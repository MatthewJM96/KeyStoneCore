package com.github.samthepsychoticleprechaun.KeyStoneCore;

import java.io.File;
import java.sql.Connection;
import java.util.List;
import java.util.logging.Logger;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import com.github.samthepsychoticleprechaun.KeyStoneCore.API.MySQL.Connect;
import com.github.samthepsychoticleprechaun.KeyStoneCore.API.MySQL.CreateTable;
import com.github.samthepsychoticleprechaun.KeyStoneCore.API.Permissions.PermissionLoader;
import com.github.samthepsychoticleprechaun.KeyStoneCore.API.YAML.GetYamlValues;
import com.github.samthepsychoticleprechaun.KeyStoneCore.API.YAML.LoadYaml;
import com.github.samthepsychoticleprechaun.KeyStoneCore.API.YAML.SaveYaml;
import com.github.samthepsychoticleprechaun.KeyStoneCore.Storage.ConfigValues;

public class KeyStoneCore extends JavaPlugin {
	
	public static KeyStoneCore plugin;
	public static Connection con;
	public static Logger log;
	
	public static File configFile;
	public static File stringsFile;
	public static File spamFile;
	public static FileConfiguration config;
	public static FileConfiguration strings;
	public static FileConfiguration spam;
	
	private static List<String> pluginSuiteList;
 
	@Override
	public void onEnable() {
		
		//Sets the plugin value for other classes
		plugin = this;
		
		//Gets the plugin's logger
		log = plugin.getLogger();
		
		//Gets the status of modules of the Key Stone Suite (i.e. loaded/unloaded, enabled/disabled)
		pluginSuiteList.add("KeyStoneChat");
		pluginSuiteList.add("KeyStoneChatGuard");
		pluginSuiteList.add("KeyStonePunish");
		pluginSuiteList.add("KeyStoneEconomy");
		CheckPluginLoaded.checkPluginsLoaded(pluginSuiteList);
		
		//Creates necessary file if not already in data folder and loads the same files
		configFile = new File(getDataFolder(), "config.yml");
		stringsFile = new File(getDataFolder(), "strings.yml");
		spamFile = new File(getDataFolder(), "spam.yml");
		LoadYaml.loadYamls();
		
		//Gets values for yaml files
		GetYamlValues.getConfigValues();
		GetYamlValues.getStringsValues();
		GetYamlValues.getSpamValues();
		
		//Adds permissions when the server starts up
		PermissionLoader.loadPerms(plugin);
		
		//Connect to MySQL if it is enabled
		if (ConfigValues.usemysql) {
			Connect.openConnection(con);
		}
		
		//Creates necessary MySQL tables if it is enabled
		if (ConfigValues.usemysql) {
			CreateTable.createTable("ks_spamlist", "playerName VARCHAR(16), offenceCount VARCHAR(3), latestCountRemoval VARCHAR(16)");
		}
			
	}
	
	@Override
	public void onDisable() {
		
		//Save all files from plugins/<plugin> folder
		SaveYaml.saveYamls();
		
		//Removes permission when the plugin is disabled
		PermissionLoader.unloadPerms(plugin);
		
		//Disconnects from MySQL if it is enabled
		if (ConfigValues.usemysql) {
			Connect.closeConnection(con);
		}
		
	}
	
}

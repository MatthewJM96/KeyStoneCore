package com.github.samthepsychoticleprechaun.KeyStoneCore;

import java.io.File;
import java.sql.Connection;
import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

import com.github.samthepsychoticleprechaun.KeyStoneCore.API.Chat.ChatDefender.SpamListClearer;
import com.github.samthepsychoticleprechaun.KeyStoneCore.API.MySQL.Connect;
import com.github.samthepsychoticleprechaun.KeyStoneCore.API.MySQL.CreateTable;
import com.github.samthepsychoticleprechaun.KeyStoneCore.API.Permissions.PermissionLoader;
import com.github.samthepsychoticleprechaun.KeyStoneCore.API.YAML.GetYamlValues;
import com.github.samthepsychoticleprechaun.KeyStoneCore.API.YAML.LoadYaml;
import com.github.samthepsychoticleprechaun.KeyStoneCore.Storage.ConfigValues;

public class KeyStoneCore extends JavaPlugin {
	
	protected static File configFile;
	public static KeyStoneCore plugin;
	public static Connection con;
	public static Logger log;
 
	@Override
	public void onEnable() {
		
		//Sets the plugin value for other classes
		plugin = this;
		
		//Gets the plugin's logger
		log = plugin.getLogger();
		
		//Creates necessary file if not already in data folder and loads the same files
		LoadYaml.loadYaml(plugin, "config.yml");
		LoadYaml.loadYaml(plugin, "strings.yml");
		
		//Gets values for yaml files
		GetYamlValues.getConfigValues();
		GetYamlValues.getStringsValues();
		
		//Adds permissions when the server starts up
		PermissionLoader.loadPerms(plugin);
		
		//Connect to MySQL if it is enabled
		if (ConfigValues.usemysql) {
			Connect.openConnection(con);
		}
		
		//Creates necessary MySQL tables if it is enabled
		if (ConfigValues.usemysql) {
			CreateTable.createTable("ks_spamlist", "playerName VARCHAR(16), offenceCount VARCHAR(3), latestOffence VARCHAR(16), latestCountRemoval VARCHAR(16)");
		}
			
	}
	
	@Override
	public void onDisable() {
		
		//Removes permission when the plugin is disabled
		PermissionLoader.unloadPerms(plugin);
		
		//Disconnects from MySQL if it is enabled
		if (ConfigValues.usemysql) {
			Connect.closeConnection(con);
		}
		
	}
	
}

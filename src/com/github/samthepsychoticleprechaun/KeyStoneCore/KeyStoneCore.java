package com.github.samthepsychoticleprechaun.KeyStoneCore;

import java.io.File;
import java.sql.Connection;
import java.util.logging.Logger;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import com.github.samthepsychoticleprechaun.KeyStoneCore.API.MySQL.Connect;
import com.github.samthepsychoticleprechaun.KeyStoneCore.Permissions.PermissionLoader;
import com.github.samthepsychoticleprechaun.KeyStoneCore.Storage.ConfigValues;
import com.github.samthepsychoticleprechaun.KeyStoneCore.YAML.GetYamlValues;
import com.github.samthepsychoticleprechaun.KeyStoneCore.YAML.LoadYaml;
import com.github.samthepsychoticleprechaun.KeyStoneCore.YAML.SaveYaml;

public class KeyStoneCore extends JavaPlugin {
	
	public static KeyStoneCore plugin;
	public static Connection con;
	public static Logger log;
	
	public static File configFile;
	public static File stringsFile;
	public static FileConfiguration config;
	public static FileConfiguration strings;
 
	@Override
	public void onEnable() {
		

		
		//Sets the plugin value for other classes
		plugin = this;
		
		//Gets the plugin's logger
		log = plugin.getLogger();
		
		LoadYaml load = new LoadYaml();
		PermissionLoader perm = new PermissionLoader();
		
		//Creates necessary file if not already in data folder and loads the same files
		configFile = new File(getDataFolder(), "config.yml");
		stringsFile = new File(getDataFolder(), "strings.yml");
		config = new YamlConfiguration();
		strings = new YamlConfiguration();
		load.loadYamls();
		
		//Gets values for yaml files
		GetYamlValues.getConfigValues();
		GetYamlValues.getStringsValues();
		
		//Adds permissions when the server starts up
		perm.loadPerms();
		
		//Connect to MySQL if it is enabled
		if (ConfigValues.usemysql) {
			Connect.openConnection(con);
		}
		
	}
	
	@Override
	public void onDisable() {

		SaveYaml save = new SaveYaml();
		PermissionLoader perm = new PermissionLoader();
		
		//Save all files from plugins/<plugin> folder
		save.saveYamls();
		
		//Removes permission when the plugin is disabled
		perm.unloadPerms();
		
		//Disconnects from MySQL if it is enabled
		if (ConfigValues.usemysql) {
			Connect.closeConnection(con);
		}
		
	}
	
}

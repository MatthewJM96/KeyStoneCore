package com.github.samthepsychoticleprechaun.KeyStoneCore.API.YAML;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Logger;

import org.bukkit.configuration.file.FileConfiguration;
import com.github.samthepsychoticleprechaun.KeyStoneCore.KeyStoneCore;

public class SaveYaml {
	
	private static Logger log = KeyStoneCore.log;
	
	/**
	 * Saves all files in plugins/<plugin> folder
	 * 
	 * @param plugin
	 * @param string
	 * @return boolean
	 */
	public static boolean saveYamls() {
		
		File configFile = KeyStoneCore.configFile;
		File stringsFile = KeyStoneCore.stringsFile;
		File spamFile = KeyStoneCore.spamFile;
		FileConfiguration config = KeyStoneCore.config;
		FileConfiguration strings = KeyStoneCore.strings;
		FileConfiguration spam = KeyStoneCore.spam;
		
		try {
			config.save(configFile);			
		} catch (FileNotFoundException e) {
			log.info("Config file was not found!");
			e.printStackTrace();
			return false;
		} catch (IOException e) {
			log.info("Error while saving config file!");
			e.printStackTrace();
			return false;
		}
		
		try {
			strings.save(stringsFile);			
		} catch (FileNotFoundException e) {
			log.info("Strings file was not found!");
			e.printStackTrace();
			return false;
		} catch (IOException e) {
			log.info("Error while saving strings file!");
			e.printStackTrace();
			return false;
		}
		
		try {
			spam.save(spamFile);			
		} catch (FileNotFoundException e) {
			log.info("Spam file was not found!");
			e.printStackTrace();
			return false;
		} catch (IOException e) {
			log.info("Error while saving spam file!");
			e.printStackTrace();
			return false;
		}
		
		return true;
		
	}
	
	public boolean saveConfig() {
		
		File configFile = KeyStoneCore.configFile;
		FileConfiguration config = KeyStoneCore.config;
		
		try {
			config.save(configFile);			
		} catch (FileNotFoundException e) {
			log.info("Config file was not found!");
			e.printStackTrace();
			return false;
		} catch (IOException e) {
			log.info("Error while saving config file!");
			e.printStackTrace();
			return false;
		}
		
		return true;
		
	}
	
	public boolean saveStrings() {
		
		File stringsFile = KeyStoneCore.stringsFile;
		FileConfiguration strings = KeyStoneCore.strings;
		
		try {
			strings.save(stringsFile);			
		} catch (FileNotFoundException e) {
			log.info("Strings file was not found!");
			e.printStackTrace();
			return false;
		} catch (IOException e) {
			log.info("Error while saving strings file!");
			e.printStackTrace();
			return false;
		}
		
		return true;
		
	}
	
	public boolean saveSpam() {
		
		File spamFile = KeyStoneCore.spamFile;
		FileConfiguration spam = KeyStoneCore.spam;
		
		try {
			spam.save(spamFile);			
		} catch (FileNotFoundException e) {
			log.info("Spam file was not found!");
			e.printStackTrace();
			return false;
		} catch (IOException e) {
			log.info("Error while saving spam file!");
			e.printStackTrace();
			return false;
		}
		
		return true;
		
	}
	
}

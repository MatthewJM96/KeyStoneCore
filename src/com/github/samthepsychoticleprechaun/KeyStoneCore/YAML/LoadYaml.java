package com.github.samthepsychoticleprechaun.KeyStoneCore.YAML;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Logger;

import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;

import com.github.samthepsychoticleprechaun.KeyStoneCore.KeyStoneCore;

public class LoadYaml {
	
	private static KeyStoneCore plugin = KeyStoneCore.plugin;
	private static Logger log = KeyStoneCore.log;
	
	public LoadYaml() {
		return;
	}
	
	/**
	 *  Loads all files from <plugin>.jar file to plugins/<plugin> folder.
	 * 
	 * @return Boolean of true if successful, else returns false.
	 */
	public boolean loadYamls() {
		
		if (!loadConf())
			return false;
		if (!loadStrings())
			return false;
		
		return true;
		
	}
	
	/**
	 * Overwrites settings in "config.yml" file in plugins/<plugin> folder.
	 * 
	 * @return boolean
	 */
	public boolean overwriteConf() {
		
		File configFile = KeyStoneCore.configFile;
		FileConfiguration config = KeyStoneCore.config;
		
		configFile.getParentFile().mkdirs();
		copy(plugin.getResource("config.yml"), configFile);
		KeyStoneCore.configFile = configFile;
		
		try {
			config.load(configFile);
		} catch (FileNotFoundException e) {
			log.info("Config file was not found!");
			e.printStackTrace();
			return false;
		} catch (IOException e) {
			log.info("Error loading config file!");
			e.printStackTrace();
			return false;
		} catch (InvalidConfigurationException e) {
			log.info("Error loading config file!");
			e.printStackTrace();
			return false;
		}

		KeyStoneCore.config = config;
		
		return true;
		
	}
	
	/**
	 * Overwrites settings in "strings.yml" file in plugins/<plugin> folder.
	 * 
	 * @return boolean
	 */
	public boolean overwriteStrings() {
			
		File stringsFile = KeyStoneCore.stringsFile;
		FileConfiguration strings = KeyStoneCore.strings;
		
		stringsFile.getParentFile().mkdirs();
		copy(plugin.getResource("strings.yml"), stringsFile);
		KeyStoneCore.stringsFile = stringsFile;
		
		try {
			strings.load(stringsFile);
		} catch (FileNotFoundException e) {
			log.info("Strings file was not found!");
			e.printStackTrace();
			return false;
		} catch (IOException e) {
			log.info("Error loading strings file!");
			e.printStackTrace();
			return false;
		} catch (InvalidConfigurationException e) {
			log.info("Error loading strings file!");
			e.printStackTrace();
			return false;
		}

		KeyStoneCore.strings = strings;
		
		return true;
		
	}
	
	/**
	 * Loads settings in "config.yml" file in plugins/<plugin> folder.
	 * 
	 * @return boolean
	 */
	public boolean loadConf() {
		
		File configFile = KeyStoneCore.configFile;
		FileConfiguration config = KeyStoneCore.config;
		
		try {
			config.load(configFile);
		} catch (FileNotFoundException e) {
			log.info("Config file was not found!");
			e.printStackTrace();
			return false;
		} catch (IOException e) {
			log.info("Error loading config file!");
			e.printStackTrace();
			return false;
		} catch (InvalidConfigurationException e) {
			log.info("Error loading config file!");
			e.printStackTrace();
			return false;
		}

		KeyStoneCore.config = config;
		
		return true;
		
	}
	
	/**
	 * Loads settings in "strings.yml" file in plugins/<plugin> folder.
	 * 
	 * @return boolean
	 */
	public boolean loadStrings() {
			
		File stringsFile = KeyStoneCore.stringsFile;
		FileConfiguration strings = KeyStoneCore.strings;
		
		try {
			strings.load(stringsFile);
		} catch (FileNotFoundException e) {
			log.info("Strings file was not found!");
			e.printStackTrace();
			return false;
		} catch (IOException e) {
			log.info("Error loading strings file!");
			e.printStackTrace();
			return false;
		} catch (InvalidConfigurationException e) {
			log.info("Error loading strings file!");
			e.printStackTrace();
			return false;
		}

		KeyStoneCore.strings = strings;
		
		return true;
		
	}
	
	
	/**
	 * Copies file from .jar file to plugins.<plugin name> directory
	 * 
	 * @param in
	 * @param file
	 */
	private void copy(InputStream in, File file) {
		
        try {
        	
            OutputStream out = new FileOutputStream(file);
            byte[] buf = new byte[1024];
            int len;
            
            while((len=in.read(buf))>0){
            	
                out.write(buf,0,len);
                
            }
            
            out.close();
            in.close();
            
        } catch (Exception e) {
        	
            e.printStackTrace();
            
        }
        
    }

}

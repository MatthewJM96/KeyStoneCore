package com.github.samthepsychoticleprechaun.KeyStoneCore.API.YAML;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Logger;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.Plugin;

public class SaveYaml {
	
	/**
	 * Saves to file of name equal to string
	 * 
	 * @param plugin
	 * @param string
	 * @return boolean
	 */
	public boolean saveYaml(Plugin plugin, String string, FileConfiguration fileCon) {
		
		File file = new File(plugin.getDataFolder(), string);
		Logger log = plugin.getLogger();
		String fileName = string.replaceFirst(".yml", "");
		
		try {
			fileCon.save(file);			
		} catch (FileNotFoundException e) {
			log.info(fileName + " was not found!");
			e.printStackTrace();
			return false;
		} catch (IOException e) {
			log.info("Error while saving " + fileName + "!");
			e.printStackTrace();
			return false;
		}
		
		return true;
		
	}
	
}

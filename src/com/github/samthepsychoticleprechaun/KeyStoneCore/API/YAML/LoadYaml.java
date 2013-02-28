package com.github.samthepsychoticleprechaun.KeyStoneCore.API.YAML;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Logger;

import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;

public class LoadYaml {
	
	/**
	 *  Loads given files from plugin.<plugin name> directory
	 * 
	 * @param plugin
	 * @param string
	 * @return boolean
	 */
	public static boolean loadYaml(Plugin plugin, String string) {
		
		File file = new File(plugin.getDataFolder(), string);
		FileConfiguration fileCon = new YamlConfiguration();
		Logger log = plugin.getLogger();
		String fileName = string.replaceFirst(".yml", "");
		
		try {
			
		if(!file.exists()) {
			
			file.getParentFile().mkdirs();
			copy(plugin.getResource(string), file);
			fileCon.load(file);
			
		} else {

			fileCon.load(file);			
			
		}
		
		} catch (FileNotFoundException e) {
			log.info(fileName + " was not found!");
			e.printStackTrace();
			return false;
		} catch (IOException e) {
			log.info("Error while loading " + fileName + "!");
			e.printStackTrace();
			return false;
		} catch (InvalidConfigurationException e) {
			log.info("Error while loading " + fileName + "!");
			e.printStackTrace();
			return false;
		}
		
		return true;
		
	}
	
	
	/**
	 * Copies file from .jar file to plugins.<plugin name> directory
	 * 
	 * @param in
	 * @param file
	 */
	private static void copy(InputStream in, File file) {
		
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

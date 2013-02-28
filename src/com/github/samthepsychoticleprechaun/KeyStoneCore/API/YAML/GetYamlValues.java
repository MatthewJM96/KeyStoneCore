package com.github.samthepsychoticleprechaun.KeyStoneCore.API.YAML;

import java.util.logging.Logger;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import com.github.samthepsychoticleprechaun.KeyStoneCore.KeyStoneCore;
import com.github.samthepsychoticleprechaun.KeyStoneCore.Storage.ConfigValues;
import com.github.samthepsychoticleprechaun.KeyStoneCore.Storage.StringValues;

public class GetYamlValues {
	
	public static boolean getConfigValues() {
		
		KeyStoneCore plugin = KeyStoneCore.plugin;
		FileConfiguration config = plugin.getConfig();
		Logger log = KeyStoneCore.log;
		
		try {
			//MySQL Settings
			ConfigValues.usemysql = config.getBoolean("usemysql");
			ConfigValues.user = config.getString("user");
			ConfigValues.password = config.getString("password");
			ConfigValues.hostname = config.getString("hostname");
			ConfigValues.port = config.getString("port");
			ConfigValues.database = config.getString("database");
			//Global Settings
			ConfigValues.tempbanduration = config.getInt("tempbanduration");
			ConfigValues.tempmuteduration = config.getInt("tempmuteduration");
			//Spam Settings
			ConfigValues.spamchatcount = config.getInt("spamchatcount");
			ConfigValues.spamchatperiod = config.getInt("spamchatperiod");
			ConfigValues.spampunsihmentorder = config.getStringList("spampunishmentorder");
			ConfigValues.spamcounttopunish = config.getIntegerList("spamcounttopunish");
			ConfigValues.spamuniquewarning = config.getStringList("spamuniquewarning");
			ConfigValues.spamtempbanduration = config.getInt("spamtempbanduration");
			ConfigValues.spamtempmuteduration = config.getInt("spamtempmuteduration");
			//Foul Chat Settings
			ConfigValues.foulchatcount = config.getInt("foulchatcount");
			ConfigValues.foulchatperiod = config.getInt("foulchatperiod");
			ConfigValues.foulpunsihmentorder = config.getStringList("foulpunishmentorder");
			ConfigValues.foulcounttopunish = config.getIntegerList("foulcounttopunish");
			ConfigValues.fouluniquewarning = config.getStringList("fouluniquewarning");
			ConfigValues.foultempbanduration = config.getInt("foultempbanduration");
			ConfigValues.foultempmuteduration = config.getInt("foultempmuteduration");
		} catch (Exception e) {
			log.info("Error getting config settings!");
			e.printStackTrace();
			return false;
		}
		
		return true;
		
	}
	
	public static boolean getStringsValues() {

		FileConfiguration strings = new YamlConfiguration();
		Logger log = KeyStoneCore.log;
		
		try {
			
			StringValues.warnofnopermission = strings.getString("warnofnopermission");
			StringValues.adminhelpnonespecific = strings.getString("adminhelpnonespecific");
			StringValues.basichelpnonespecific = strings.getString("basichelpnonespecific");
			
		} catch (Exception e) {
			log.info("Error getting string values!");
			e.printStackTrace();
			return false;			
		}
		
		return true;
		
	}

}

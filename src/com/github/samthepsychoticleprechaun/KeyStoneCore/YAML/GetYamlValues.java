package com.github.samthepsychoticleprechaun.KeyStoneCore.YAML;

import java.util.logging.Logger;

import org.bukkit.configuration.file.FileConfiguration;
import com.github.samthepsychoticleprechaun.KeyStoneCore.KeyStoneCore;
import com.github.samthepsychoticleprechaun.KeyStoneCore.Storage.ConfigValues;
import com.github.samthepsychoticleprechaun.KeyStoneCore.Storage.StringValues;

public class GetYamlValues {
	
	public static boolean getConfigValues() {
		
		FileConfiguration config = KeyStoneCore.config;
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
			ConfigValues.spamcountremovalrate = config.getInt("spamcountremovalrate");
			ConfigValues.spamuniquewarning = config.getStringList("spamuniquewarning");
			ConfigValues.spamtempbanduration = config.getInt("spamtempbanduration");
			ConfigValues.spamtempmuteduration = config.getInt("spamtempmuteduration");
			//Foul Chat Settings
			ConfigValues.foulchatcount = config.getInt("foulchatcount");
			ConfigValues.foulchatperiod = config.getInt("foulchatperiod");
			ConfigValues.foulpunsihmentorder = config.getStringList("foulpunishmentorder");
			ConfigValues.foulcounttopunish = config.getIntegerList("foulcounttopunish");
			ConfigValues.foulcountremovalrate = config.getInt("foulcountremovalrate");
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

		FileConfiguration strings = KeyStoneCore.strings;
		Logger log = KeyStoneCore.log;
		
		StringValues load = new StringValues();
		
		try {
			
			load.warnofnopermission = strings.getString("warnofnopermission");
			load.defaultspamwarning = strings.getString("defaultspamwarning");
			load.defaultfoullanguagewarning = strings.getString("defaultfoullanguagewarning");
			load.missingargcmd = strings.getString("missingargcmd");
			load.createdchannel = strings.getString("createdchannel");
			load.extraargcmd = strings.getString("extraargcmd");
			load.failedchannelcreate = strings.getString("failedchannelcreate");
			load.createdpassword = strings.getString("createdpassword");
			load.updatedpassword = strings.getString("updatedpassword");
			load.removedpassword = strings.getString("removedpassword");
			load.confirmpassword = strings.getString("confirmpassword");
			load.deniedpassword = strings.getString("deniedpassword");
			load.reloadcoresuccess = strings.getString("reloadcoresuccess");
			load.reloadchatsuccess = strings.getString("reloadchatsuccess");
			load.reloadchatguardsuccess = strings.getString("reloadchatguardsuccess");
			load.reloadallsuccess = strings.getString("reloadallsuccess");
			load.renamechannel = strings.getString("renamechannel");
			
		} catch (Exception e) {
			log.info("Error getting string values!");
			e.printStackTrace();
			return false;
		}
		
		return true;
		
	}

}

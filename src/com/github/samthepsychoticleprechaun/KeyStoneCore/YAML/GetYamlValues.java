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
		
		try {
			
			StringValues.warnofnopermission = strings.getString("warnofnopermission");
			StringValues.adminhelpnonespecific = strings.getString("adminhelpnonespecific");
			StringValues.basichelpnonespecific = strings.getString("basichelpnonespecific");
			StringValues.defaultspamwarning = strings.getString("defaultspamwarning");
			StringValues.defaultfoullanguagewarning = strings.getString("defaultfoullanguagewarning");
			StringValues.missingargcmd = strings.getString("missingargcmd");
			StringValues.createdchannel = strings.getString("createdchannel");
			StringValues.extraargcmd = strings.getString("extraargcmd");
			StringValues.failedchannelcreate = strings.getString("failedchannelcreate");
			StringValues.createdpassword = strings.getString("createdpassword");
			StringValues.updatedpassword = strings.getString("updatedpassword");
			StringValues.removedpassword = strings.getString("removedpassword");
			StringValues.confirmpassword = strings.getString("confirmpassword");
			
		} catch (Exception e) {
			log.info("Error getting string values!");
			e.printStackTrace();
			return false;
		}
		
		return true;
		
	}

}

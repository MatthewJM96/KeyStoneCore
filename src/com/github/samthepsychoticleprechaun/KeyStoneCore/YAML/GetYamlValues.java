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
			
			load.setWarnofnopermission(strings.getString("warnofnopermission"));
			load.setDefaultspamwarning(strings.getString("defaultspamwarning"));
			load.setDefaultfoullanguagewarning(strings.getString("defaultfoullanguagewarning"));
			load.setMissingargcmd(strings.getString("missingargcmd"));
			load.setCreatedchannel(strings.getString("createdchannel"));
			load.setExtraargcmd(strings.getString("extraargcmd"));
			load.setFailedchannelcreate(strings.getString("failedchannelcreate"));
			load.setCreatedpassword(strings.getString("createdpassword"));
			load.setUpdatedpassword(strings.getString("updatedpassword"));
			load.setRemovedpassword(strings.getString("removedpassword"));
			load.setConfirmpassword(strings.getString("confirmpassword"));
			load.setDeniedpassword(strings.getString("deniedpassword"));
			load.setReloadcoresuccess(strings.getString("reloadcoresuccess"));
			load.setReloadchatsuccess(strings.getString("reloadchatsuccess"));
			load.setReloadchatguardsuccess(strings.getString("reloadchatguardsuccess"));
			load.setReloadallsuccess(strings.getString("reloadallsuccess"));
			load.setRenamechannel(strings.getString("renamechannel"));
			load.setRenamedisallowed(strings.getString("renamedisallowed"));
			load.setInvitebuddy(strings.getString("invitebuddy"));
			load.setInviteneutral(strings.getString("inviteneutral"));
			load.setInvitechannel(strings.getString("invitechannel"));
			load.setInvitegroup(strings.getString("invitegroup"));
			load.setInvitedbuddy(strings.getString("invitedbuddy"));
			load.setInvitedneutral(strings.getString("invitedneutral"));
			load.setInvitedchannel(strings.getString("invitedchannel"));
			load.setInvitedgroup(strings.getString("invitedgroup"));
			load.setHelpheader(strings.getString("helpheader"));
			load.setHelpcoreheader(strings.getString("helpcoreheader"));
			load.setHelpcoreinitial(strings.getString("helpcoreinitial"));
			load.setHelpcorehelp(strings.getString("helpcorehelp"));
			//TODO: Decide between this, and getting where needed. Then acting on decision!
			
		} catch (Exception e) {
			log.info("Error getting string values!");
			e.printStackTrace();
			return false;
		}
		
		return true;
		
	}

}

package com.github.samthepsychoticleprechaun.KeyStoneCore.Permissions;

import org.bukkit.plugin.PluginManager;

import com.github.samthepsychoticleprechaun.KeyStoneCore.KeyStoneCore;

public class PermissionLoader {
	
	public static void loadPerms() {
		
		KeyStoneCore plugin = KeyStoneCore.plugin;
		PluginManager pm = plugin.getServer().getPluginManager();
		
		pm.addPermission(PermissionList.basiccmdusage);
		pm.addPermission(PermissionList.editconfig);
		pm.addPermission(PermissionList.reload);
		pm.addPermission(PermissionList.helpadmin);
		pm.addPermission(PermissionList.helpbasic);
		pm.addPermission(PermissionList.formatColour);
		pm.addPermission(PermissionList.formatFormat);
		pm.addPermission(PermissionList.formatMagic);
		pm.addPermission(PermissionList.channelBasicCreate);
		pm.addPermission(PermissionList.channelBasicPassword);
		pm.addPermission(PermissionList.channelBasicDescription);
		pm.addPermission(PermissionList.channelBasicOwner);
		pm.addPermission(PermissionList.channelBasicModerator);
		pm.addPermission(PermissionList.channelBasicInvite);
		pm.addPermission(PermissionList.channelBasicRename);
		pm.addPermission(PermissionList.channelBasicDelete);
		pm.addPermission(PermissionList.channelAdminCreate);
		pm.addPermission(PermissionList.channelAdminPassword);
		pm.addPermission(PermissionList.channelAdminDescription);
		pm.addPermission(PermissionList.channelAdminOwner);
		pm.addPermission(PermissionList.channelAdminModerator);
		pm.addPermission(PermissionList.channelAdminAdd);
		pm.addPermission(PermissionList.channelAdminRename);
		pm.addPermission(PermissionList.channelAdminDelete);
		
	}
	
	public static void unloadPerms() {
		
		KeyStoneCore plugin = KeyStoneCore.plugin;
		PluginManager pm = plugin.getServer().getPluginManager();
		
		pm.removePermission(PermissionList.basiccmdusage);
		pm.removePermission(PermissionList.editconfig);
		pm.removePermission(PermissionList.reload);
		pm.removePermission(PermissionList.helpadmin);
		pm.removePermission(PermissionList.helpbasic);
		pm.removePermission(PermissionList.formatColour);
		pm.removePermission(PermissionList.formatFormat);
		pm.removePermission(PermissionList.formatMagic);
		pm.removePermission(PermissionList.channelBasicCreate);
		pm.removePermission(PermissionList.channelBasicPassword);
		pm.removePermission(PermissionList.channelBasicDescription);
		pm.removePermission(PermissionList.channelBasicOwner);
		pm.removePermission(PermissionList.channelBasicModerator);
		pm.removePermission(PermissionList.channelBasicInvite);
		pm.removePermission(PermissionList.channelBasicRename);
		pm.removePermission(PermissionList.channelBasicDelete);
		pm.removePermission(PermissionList.channelAdminCreate);
		pm.removePermission(PermissionList.channelAdminPassword);
		pm.removePermission(PermissionList.channelAdminDescription);
		pm.removePermission(PermissionList.channelAdminOwner);
		pm.removePermission(PermissionList.channelAdminModerator);
		pm.removePermission(PermissionList.channelAdminAdd);
		pm.removePermission(PermissionList.channelAdminRename);
		pm.removePermission(PermissionList.channelAdminDelete);
		
	}

}

package com.github.samthepsychoticleprechaun.KeyStoneCore.API.Permissions;

import org.bukkit.plugin.PluginManager;

import com.github.samthepsychoticleprechaun.KeyStoneCore.KeyStoneCore;

public class PermissionLoader {
	
	public static void loadPerms(KeyStoneCore plugin) {
		
		PluginManager pm = plugin.getServer().getPluginManager();
		
		pm.addPermission(PermissionList.basiccmdusage);
		pm.addPermission(PermissionList.editconfig);
		pm.addPermission(PermissionList.reload);
		pm.addPermission(PermissionList.helpadmin);
		pm.addPermission(PermissionList.helpbasic);
		
	}
	
	public static void unloadPerms(KeyStoneCore plugin) {
		
		PluginManager pm = plugin.getServer().getPluginManager();
		
		pm.removePermission(PermissionList.basiccmdusage);
		pm.removePermission(PermissionList.editconfig);
		pm.removePermission(PermissionList.reload);
		pm.removePermission(PermissionList.helpadmin);
		pm.removePermission(PermissionList.helpbasic);
		
	}

}

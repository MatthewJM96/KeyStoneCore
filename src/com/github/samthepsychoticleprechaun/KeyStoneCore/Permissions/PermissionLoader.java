package com.github.samthepsychoticleprechaun.KeyStoneCore.Permissions;

import org.bukkit.plugin.PluginManager;

import com.github.samthepsychoticleprechaun.KeyStoneCore.KeyStoneCore;

public class PermissionLoader {
	
	public PermissionLoader() {
		return;
	}
	
	KeyStoneCore plugin = KeyStoneCore.plugin;
	PluginManager pm = plugin.getServer().getPluginManager();
	PermissionList pl = new PermissionList();
	
	public void loadPerms() {
		
		pm.addPermission(pl.getBasiccmdusage());
		pm.addPermission(pl.getEditconfig());
		pm.addPermission(pl.getReload());
		pm.addPermission(pl.getHelpadmin());
		pm.addPermission(pl.getHelpbasic());
		pm.addPermission(pl.getFormatColour());
		pm.addPermission(pl.getFormatFormat());
		pm.addPermission(pl.getFormatMagic());
		pm.addPermission(pl.getChannelBasicCreate());
		pm.addPermission(pl.getChannelBasicPassword());
		pm.addPermission(pl.getChannelBasicDescription());
		pm.addPermission(pl.getChannelBasicOwner());
		pm.addPermission(pl.getChannelBasicModerator());
		pm.addPermission(pl.getChannelBasicInvite());
		pm.addPermission(pl.getChannelBasicRename());
		pm.addPermission(pl.getChannelBasicDelete());
		pm.addPermission(pl.getChannelAdminCreate());
		pm.addPermission(pl.getChannelAdminPassword());
		pm.addPermission(pl.getChannelAdminDescription());
		pm.addPermission(pl.getChannelAdminOwner());
		pm.addPermission(pl.getChannelAdminModerator());
		pm.addPermission(pl.getChannelAdminAdd());
		pm.addPermission(pl.getChannelAdminRename());
		pm.addPermission(pl.getChannelAdminDelete());
		
	}
	
	public void unloadPerms() {
		
		pm.removePermission(pl.getBasiccmdusage());
		pm.removePermission(pl.getEditconfig());
		pm.removePermission(pl.getReload());
		pm.removePermission(pl.getHelpadmin());
		pm.removePermission(pl.getHelpbasic());
		pm.removePermission(pl.getFormatColour());
		pm.removePermission(pl.getFormatFormat());
		pm.removePermission(pl.getFormatMagic());
		pm.removePermission(pl.getChannelBasicCreate());
		pm.removePermission(pl.getChannelBasicPassword());
		pm.removePermission(pl.getChannelBasicDescription());
		pm.removePermission(pl.getChannelBasicOwner());
		pm.removePermission(pl.getChannelBasicModerator());
		pm.removePermission(pl.getChannelBasicInvite());
		pm.removePermission(pl.getChannelBasicRename());
		pm.removePermission(pl.getChannelBasicDelete());
		pm.removePermission(pl.getChannelAdminCreate());
		pm.removePermission(pl.getChannelAdminPassword());
		pm.removePermission(pl.getChannelAdminDescription());
		pm.removePermission(pl.getChannelAdminOwner());
		pm.removePermission(pl.getChannelAdminModerator());
		pm.removePermission(pl.getChannelAdminAdd());
		pm.removePermission(pl.getChannelAdminRename());
		pm.removePermission(pl.getChannelAdminDelete());
		
	}

}

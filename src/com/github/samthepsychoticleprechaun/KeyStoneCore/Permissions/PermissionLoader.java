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
		
		pm.addPermission(pl.basiccmdusage);
		pm.addPermission(pl.editconfig);
		pm.addPermission(pl.reload);
		pm.addPermission(pl.helpadmin);
		pm.addPermission(pl.helpbasic);
		pm.addPermission(pl.formatColour);
		pm.addPermission(pl.formatFormat);
		pm.addPermission(pl.formatMagic);
		pm.addPermission(pl.channelBasicCreate);
		pm.addPermission(pl.channelBasicPassword);
		pm.addPermission(pl.channelBasicDescription);
		pm.addPermission(pl.channelBasicOwner);
		pm.addPermission(pl.channelBasicModerator);
		pm.addPermission(pl.channelBasicInvite);
		pm.addPermission(pl.channelBasicRename);
		pm.addPermission(pl.channelBasicDelete);
		pm.addPermission(pl.channelAdminCreate);
		pm.addPermission(pl.channelAdminPassword);
		pm.addPermission(pl.channelAdminDescription);
		pm.addPermission(pl.channelAdminOwner);
		pm.addPermission(pl.channelAdminModerator);
		pm.addPermission(pl.channelAdminAdd);
		pm.addPermission(pl.channelAdminRename);
		pm.addPermission(pl.channelAdminDelete);
		
	}
	
	public void unloadPerms() {
		
		pm.removePermission(pl.basiccmdusage);
		pm.removePermission(pl.editconfig);
		pm.removePermission(pl.reload);
		pm.removePermission(pl.helpadmin);
		pm.removePermission(pl.helpbasic);
		pm.removePermission(pl.formatColour);
		pm.removePermission(pl.formatFormat);
		pm.removePermission(pl.formatMagic);
		pm.removePermission(pl.channelBasicCreate);
		pm.removePermission(pl.channelBasicPassword);
		pm.removePermission(pl.channelBasicDescription);
		pm.removePermission(pl.channelBasicOwner);
		pm.removePermission(pl.channelBasicModerator);
		pm.removePermission(pl.channelBasicInvite);
		pm.removePermission(pl.channelBasicRename);
		pm.removePermission(pl.channelBasicDelete);
		pm.removePermission(pl.channelAdminCreate);
		pm.removePermission(pl.channelAdminPassword);
		pm.removePermission(pl.channelAdminDescription);
		pm.removePermission(pl.channelAdminOwner);
		pm.removePermission(pl.channelAdminModerator);
		pm.removePermission(pl.channelAdminAdd);
		pm.removePermission(pl.channelAdminRename);
		pm.removePermission(pl.channelAdminDelete);
		
	}

}

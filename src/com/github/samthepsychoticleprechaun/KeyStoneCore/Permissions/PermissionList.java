package com.github.samthepsychoticleprechaun.KeyStoneCore.Permissions;

import org.bukkit.permissions.Permission;

public class PermissionList {
	
	public PermissionList() {
		return;
	}
	
	public Permission basiccmdusage = new Permission("KeyStone.basic.cmdusage");
	public Permission editconfig = new Permission("KeyStone.admin.editconfig");
	public Permission reload = new Permission("KeyStone.admin.reload");
	public Permission helpadmin = new Permission("KeyStone.admin.help");
	public Permission helpbasic = new Permission("KeyStone.basic.help");
	public Permission formatColour = new Permission("KeyStone.format.colour");
	public Permission formatFormat = new Permission("KeyStone.format.format");
	public Permission formatMagic = new Permission("KeyStone.format.magic");
	public Permission channelBasicCreate = new Permission("KeyStone.basic.channel.create");
	public Permission channelBasicPassword = new Permission("KeyStone.basic.channel.password");
	public Permission channelBasicDescription = new Permission("KeyStone.basic.channel.description");
	public Permission channelBasicOwner = new Permission("KeyStone.basic.channel.owner");
	public Permission channelBasicModerator = new Permission("KeyStone.basic.channel.moderator");
	public Permission channelBasicInvite = new Permission("KeyStone.basic.channel.invite");
	public Permission channelBasicRename = new Permission("KeyStone.basic.channel.rename");
	public Permission channelBasicDelete = new Permission("KeyStone.basic.channel.delete");
	public Permission channelAdminCreate = new Permission("KeyStone.admin.channel.create");
	public Permission channelAdminPassword = new Permission("KeyStone.admin.channel.password");
	public Permission channelAdminDescription = new Permission("KeyStone.admin.channel.description");
	public Permission channelAdminOwner = new Permission("KeyStone.admin.channel.owner");
	public Permission channelAdminModerator = new Permission("KeyStone.admin.channel.moderator");
	public Permission channelAdminAdd = new Permission("KeyStone.admin.channel.add");
	public Permission channelAdminRename = new Permission("KeyStone.admin.channel.rename");
	public Permission channelAdminDelete = new Permission("KeyStone.admin.channel.delete");
	
}

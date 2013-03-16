package com.github.samthepsychoticleprechaun.KeyStoneCore.Permissions;

import org.bukkit.permissions.Permission;

import com.github.samthepsychoticleprechaun.KeyStoneCore.API.General.IsEnabled;

public class PermissionList {
	
	private Permission basiccmdusage;
	private Permission editconfig;
	private Permission reload;
	private Permission helpadmin;
	private Permission helpbasic;
	private Permission formatColour;
	private Permission formatFormat;
	private Permission formatMagic;
	private Permission channelBasicCreate;
	private Permission channelBasicPassword;
	private Permission channelBasicDescription;
	private Permission channelBasicOwner;
	private Permission channelBasicModerator;
	private Permission channelBasicInvite;
	private Permission channelBasicRename;
	private Permission channelBasicDelete;
	private Permission channelAdminCreate;
	private Permission channelAdminPassword;
	private Permission channelAdminDescription;
	private Permission channelAdminOwner;
	private Permission channelAdminModerator;
	private Permission channelAdminAdd;
	private Permission channelAdminRename;
	private Permission channelAdminDelete;
	
	public PermissionList() {
	
	
		IsEnabled enabled = new IsEnabled();
	
		setBasiccmdusage(new Permission("KeyStone.basic.cmdusage"));
		setEditconfig(new Permission("KeyStone.admin.editconfig"));
		setReload(new Permission("KeyStone.admin.reload"));
		setHelpadmin(new Permission("KeyStone.admin.help"));
		setHelpbasic(new Permission("KeyStone.basic.help"));
		
		if (enabled.getIsEnabledList().get("KeyStoneChat")) {
		
			setFormatColour(new Permission("KeyStone.format.colour"));
			setFormatFormat(new Permission("KeyStone.format.format"));
			setFormatMagic(new Permission("KeyStone.format.magic"));
			setChannelBasicCreate(new Permission("KeyStone.basic.channel.create"));
			setChannelBasicPassword(new Permission("KeyStone.basic.channel.password"));
			setChannelBasicDescription(new Permission("KeyStone.basic.channel.description"));
			setChannelBasicOwner(new Permission("KeyStone.basic.channel.owner"));
			setChannelBasicModerator(new Permission("KeyStone.basic.channel.moderator"));
			setChannelBasicInvite(new Permission("KeyStone.basic.channel.invite"));
			setChannelBasicRename(new Permission("KeyStone.basic.channel.rename"));
			setChannelBasicDelete(new Permission("KeyStone.basic.channel.delete"));
			setChannelAdminCreate(new Permission("KeyStone.admin.channel.create"));
			setChannelAdminPassword(new Permission("KeyStone.admin.channel.password"));
			setChannelAdminDescription(new Permission("KeyStone.admin.channel.description"));
			setChannelAdminOwner(new Permission("KeyStone.admin.channel.owner"));
			setChannelAdminModerator(new Permission("KeyStone.admin.channel.moderator"));
			setChannelAdminAdd(new Permission("KeyStone.admin.channel.add"));
			setChannelAdminRename(new Permission("KeyStone.admin.channel.rename"));
			setChannelAdminDelete(new Permission("KeyStone.admin.channel.delete"));
	
		}
	
	}

	public Permission getBasiccmdusage() {
		return basiccmdusage;
	}

	public void setBasiccmdusage(Permission basiccmdusage) {
		this.basiccmdusage = basiccmdusage;
	}

	public Permission getEditconfig() {
		return editconfig;
	}

	public void setEditconfig(Permission editconfig) {
		this.editconfig = editconfig;
	}

	public Permission getReload() {
		return reload;
	}

	public void setReload(Permission reload) {
		this.reload = reload;
	}

	public Permission getHelpadmin() {
		return helpadmin;
	}

	public void setHelpadmin(Permission helpadmin) {
		this.helpadmin = helpadmin;
	}

	public Permission getHelpbasic() {
		return helpbasic;
	}

	public void setHelpbasic(Permission helpbasic) {
		this.helpbasic = helpbasic;
	}

	public Permission getFormatColour() {
		return formatColour;
	}

	public void setFormatColour(Permission formatColour) {
		this.formatColour = formatColour;
	}

	public Permission getFormatFormat() {
		return formatFormat;
	}

	public void setFormatFormat(Permission formatFormat) {
		this.formatFormat = formatFormat;
	}

	public Permission getFormatMagic() {
		return formatMagic;
	}

	public void setFormatMagic(Permission formatMagic) {
		this.formatMagic = formatMagic;
	}

	public Permission getChannelBasicPassword() {
		return channelBasicPassword;
	}

	public void setChannelBasicPassword(Permission channelBasicPassword) {
		this.channelBasicPassword = channelBasicPassword;
	}

	public Permission getChannelBasicCreate() {
		return channelBasicCreate;
	}

	public void setChannelBasicCreate(Permission channelBasicCreate) {
		this.channelBasicCreate = channelBasicCreate;
	}

	public Permission getChannelBasicDescription() {
		return channelBasicDescription;
	}

	public void setChannelBasicDescription(Permission channelBasicDescription) {
		this.channelBasicDescription = channelBasicDescription;
	}

	public Permission getChannelBasicOwner() {
		return channelBasicOwner;
	}

	public void setChannelBasicOwner(Permission channelBasicOwner) {
		this.channelBasicOwner = channelBasicOwner;
	}

	public Permission getChannelBasicModerator() {
		return channelBasicModerator;
	}

	public void setChannelBasicModerator(Permission channelBasicModerator) {
		this.channelBasicModerator = channelBasicModerator;
	}

	public Permission getChannelBasicInvite() {
		return channelBasicInvite;
	}

	public void setChannelBasicInvite(Permission channelBasicInvite) {
		this.channelBasicInvite = channelBasicInvite;
	}

	public Permission getChannelBasicRename() {
		return channelBasicRename;
	}

	public void setChannelBasicRename(Permission channelBasicRename) {
		this.channelBasicRename = channelBasicRename;
	}

	public Permission getChannelBasicDelete() {
		return channelBasicDelete;
	}

	public void setChannelBasicDelete(Permission channelBasicDelete) {
		this.channelBasicDelete = channelBasicDelete;
	}

	public Permission getChannelAdminCreate() {
		return channelAdminCreate;
	}

	public void setChannelAdminCreate(Permission channelAdminCreate) {
		this.channelAdminCreate = channelAdminCreate;
	}

	public Permission getChannelAdminPassword() {
		return channelAdminPassword;
	}

	public void setChannelAdminPassword(Permission channelAdminPassword) {
		this.channelAdminPassword = channelAdminPassword;
	}

	public Permission getChannelAdminDescription() {
		return channelAdminDescription;
	}

	public void setChannelAdminDescription(Permission channelAdminDescription) {
		this.channelAdminDescription = channelAdminDescription;
	}

	public Permission getChannelAdminOwner() {
		return channelAdminOwner;
	}

	public void setChannelAdminOwner(Permission channelAdminOwner) {
		this.channelAdminOwner = channelAdminOwner;
	}

	public Permission getChannelAdminModerator() {
		return channelAdminModerator;
	}

	public void setChannelAdminModerator(Permission channelAdminModerator) {
		this.channelAdminModerator = channelAdminModerator;
	}

	public Permission getChannelAdminAdd() {
		return channelAdminAdd;
	}

	public void setChannelAdminAdd(Permission channelAdminAdd) {
		this.channelAdminAdd = channelAdminAdd;
	}

	public Permission getChannelAdminRename() {
		return channelAdminRename;
	}

	public void setChannelAdminRename(Permission channelAdminRename) {
		this.channelAdminRename = channelAdminRename;
	}

	public Permission getChannelAdminDelete() {
		return channelAdminDelete;
	}

	public void setChannelAdminDelete(Permission channelAdminDelete) {
		this.channelAdminDelete = channelAdminDelete;
	}
	
	
	
}

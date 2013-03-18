package com.github.samthepsychoticleprechaun.KeyStoneCore.API.InviteSystem;

import java.util.HashMap;

import org.bukkit.entity.Player;

import com.github.samthepsychoticleprechaun.KeyStoneChat.API.Chat.SendMessage;
import com.github.samthepsychoticleprechaun.KeyStoneCore.API.General.IsEnabled;
import com.github.samthepsychoticleprechaun.KeyStoneCore.API.General.TimeParser;
import com.github.samthepsychoticleprechaun.KeyStoneCore.API.InviteSystem.InviteType.InvType;
import com.github.samthepsychoticleprechaun.KeyStoneCore.BuddySystem.BuddySystem;
import com.github.samthepsychoticleprechaun.KeyStoneCore.Storage.StringValues;

public class Invite {
	
	public Invite() {
		return;
	}
	
	HashMap<String, InvType> invitelist = new HashMap<String, InvType>();
	HashMap<String, String> invitetermination = new HashMap<String, String>();
	
	IsEnabled enabled = new IsEnabled();
	SendMessage msg = new SendMessage();
	StringValues load = new StringValues();
	TimeParser time = new TimeParser();
	BuddySystem buddy = new BuddySystem();
	
	String inviteChannel;
	String invitedChannel;
	String inviteBuddy;
	String invitedBuddy;
	String inviteGroup;
	String invitedGroup;
	
	public boolean InvitePlayer(Player invitee, InvType inviteType) {
		
		String inviteeName = invitee.getName();
		
		if (InvType.isMember(inviteType)) {
			
			invitelist.put(inviteeName, inviteType);
			invitetermination.put(inviteeName, time.updateTime(30, "minutes"));
		
			return true;
			
		} else {
			
			return false;
			
		}
		
	}
	
	public boolean AcceptInvite(Player invitee) {
		
		if (invitelist.get(invitee.getName()).equals(InvType.BUDDY)) {
			
			buddy.acceptBuddyInvite(invitee);
			
		} else if (invitelist.get(invitee.getName()).equals(InvType.CHANNEL)) {
			
			
			
		} else if (invitelist.get(invitee.getName()).equals(InvType.GROUP)) {
			
			
			
		}
		
		return false;
		
	}
	
}

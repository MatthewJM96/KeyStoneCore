package com.github.samthepsychoticleprechaun.KeyStoneCore.BuddySystem;

import java.util.HashMap;
import java.util.List;

import org.bukkit.entity.Player;

import com.github.samthepsychoticleprechaun.KeyStoneChat.API.Chat.SendMessage;
import com.github.samthepsychoticleprechaun.KeyStoneCore.API.General.IsEnabled;
import com.github.samthepsychoticleprechaun.KeyStoneCore.API.InviteSystem.Invite;
import com.github.samthepsychoticleprechaun.KeyStoneCore.API.InviteSystem.InviteType.InvType;
import com.github.samthepsychoticleprechaun.KeyStoneCore.BuddySystem.BuddyStatus.BuddyType;
import com.github.samthepsychoticleprechaun.KeyStoneCore.Storage.StringValues;

public class BuddySystem {

	HashMap<String, List<String>> friendList;
	HashMap<String, List<String>> ignoreList;
	HashMap<String, List<String>> enemyList;
	
	HashMap<String, String> pendingList;
	
	StringValues load = new StringValues();
	IsEnabled is = new IsEnabled();
	SendMessage msg = new SendMessage();
	Invite inv = new Invite();
	
	String inviteBuddy = load.getInvitebuddy();
	String invitedBuddy = load.getInvitedbuddy();
	
	public void inviteFriend(Player invitee, Player inviter) {
		
		String messagep1;
		String messagep2;
		
		if (inviteBuddy.contains("*p")) {
			
			int ind = inviteBuddy.indexOf("*p");
			messagep1 = inviteBuddy.substring(0, ind-1);
			messagep2 = inviteBuddy.substring(ind+2);
			inviteBuddy = messagep1 + invitee.getName() + messagep2;
			
		}
		
		if (is.getIsEnabledList().get("KeyStoneChat")) {
			
			msg.sendMessage(inviter.getName() + invitedBuddy, invitee);
			msg.sendMessage(inviteBuddy, inviter);
			
		} else {
			
			invitee.sendMessage(inviter.getName() + invitedBuddy);
			inviter.sendMessage(inviteBuddy);
			
		}
		
		inv.InvitePlayer(invitee, InvType.BUDDY);
		pendingList.put(invitee.getName(), inviter.getName());
		
	}
	
	public void acceptFriend() {
		
		
		
	}
	
	public void inviteNeutral(Player neutralised, Player neutraliser) {
		
		//TODO similar to inviteFriend()
		
	}
	
	public void acceptNeutral() {
		
		//TODO similar to acceptFriend()
		
	}
	
	public void makeEnemy(Player enemied, Player enemy) {
		
		updateStatus(enemied, enemy, BuddyType.ENEMY);
		
	}
	
	public void ignorePlayer(Player ignored, Player ignorer) {
		
		updateStatus(ignored, ignorer, BuddyType.IGNORE);
		
	}
	

	
	private void updateStatus(Player invitee, Player inviter, BuddyType buddyType) {
		
		if (BuddyType.isMember(buddyType)) {
			
			if (buddyType.equals(BuddyType.FRIEND)) {
			
				//TODO Remove new friends from all other status lists and add to friends list
			
			} else if (buddyType.equals(BuddyType.ENEMY)) {
			
				//TODO Remove new enemies from all other status lists and add to enemies list
			
			} else if (buddyType.equals(BuddyType.IGNORE)) {
			
				//TODO remove ignored from all other status lists and add to ignored list
			
			} else {
				
				//TODO remove neutral from all status lists
				
			}
				
		}
		
	}
	
}

package com.github.samthepsychoticleprechaun.KeyStoneCore.BuddySystem;

import java.util.HashMap;
import java.util.List;

import org.bukkit.entity.Player;

import com.github.samthepsychoticleprechaun.KeyStoneChat.API.Chat.SendMessage;
import com.github.samthepsychoticleprechaun.KeyStoneCore.KeyStoneCore;
import com.github.samthepsychoticleprechaun.KeyStoneCore.API.General.IsEnabled;
import com.github.samthepsychoticleprechaun.KeyStoneCore.API.InviteSystem.Invite;
import com.github.samthepsychoticleprechaun.KeyStoneCore.API.InviteSystem.InviteType.InvType;
import com.github.samthepsychoticleprechaun.KeyStoneCore.BuddySystem.BuddyStatus.BuddyType;
import com.github.samthepsychoticleprechaun.KeyStoneCore.Storage.StringValues;

public class BuddySystem {
	
	public BuddySystem () {
		return;
	}

	HashMap<String, List<String>> friendList;
	HashMap<String, List<String>> ignoreList;
	HashMap<String, List<String>> enemyList;
	
	HashMap<String, BuddyType> pendingType;
	HashMap<String, String> pendingFriendList;
	HashMap<String, String> pendingNeutralList;
	
	KeyStoneCore plugin = KeyStoneCore.plugin;
	StringValues load = new StringValues();
	IsEnabled is = new IsEnabled();
	SendMessage msg = new SendMessage();
	Invite inv = new Invite();
	
	String inviteBuddy = load.getInvitebuddy();
	String invitedBuddy = load.getInvitedbuddy();
	String inviteNeutral = load.getInviteneutral();
	String invitedNeutral = load.getInvitedneutral();
	String becomeFriend = load.getBefriended();
	String becomeNeutral = load.getBecomeneutral();
	String becomeEnemy = load.getBecomeenemy();
	
	public void acceptBuddyInvite(Player invitee) {
		
		String inviter;
		
		if (pendingType.get(invitee.getName()).equals(BuddyType.FRIEND)) {
			
			inviter = pendingFriendList.get(invitee.getName());
			acceptFriend(invitee.getName(), inviter);
			
		} else if (pendingType.get(invitee.getName()).equals(BuddyType.NEUTRAL)) {
			
			inviter = pendingNeutralList.get(invitee.getName());
			acceptNeutral(invitee.getName(), inviter);
			
		}
		
	}
	
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
		pendingFriendList.put(invitee.getName(), inviter.getName());
		pendingNeutralList.remove(invitee.getName());
		pendingType.put(invitee.getName(), BuddyType.FRIEND);
		
	}
	
	public void acceptFriend(String invitee, String inviter) {
		
		Player p1 = plugin.getServer().getPlayer(invitee);
		Player p2 = plugin.getServer().getPlayer(inviter);
		updateStatus(p1, p2, BuddyType.FRIEND);
		
		if (is.getIsEnabledList().get("KeyStoneChat")) {
			
			msg.sendMessage(becomeFriend + invitee, p2);
			msg.sendMessage(becomeFriend + inviter, p1);
			
		} else {
			
			p1.sendMessage(becomeFriend + inviter);
			p2.sendMessage(becomeFriend + invitee);
			
		}
		
	}
	
	public void inviteNeutral(Player neutralised, Player neutraliser) {
		
		String messagep1;
		String messagep2;
		
		if (inviteNeutral.contains("*p")) {
			
			int ind = inviteNeutral.indexOf("*p");
			messagep1 = inviteNeutral.substring(0, ind-1);
			messagep2 = inviteNeutral.substring(ind+2);
			inviteNeutral = messagep1 + neutralised.getName() + messagep2;
			
		}
		
		if (is.getIsEnabledList().get("KeyStoneChat")) {
			
			msg.sendMessage(neutraliser.getName() + invitedNeutral, neutralised);
			msg.sendMessage(inviteNeutral, neutraliser);
			
		} else {
			
			neutralised.sendMessage(neutraliser.getName() + invitedNeutral);
			neutraliser.sendMessage(inviteNeutral);
			
		}
		
		inv.InvitePlayer(neutralised, InvType.BUDDY);
		pendingNeutralList.put(neutralised.getName(), neutraliser.getName());
		pendingFriendList.remove(neutralised.getName());
		pendingType.put(neutralised.getName(), BuddyType.NEUTRAL);
		
	}
	
	public void acceptNeutral(String neutralised, String neutraliser) {
		
		Player p1 = plugin.getServer().getPlayer(neutralised);
		Player p2 = plugin.getServer().getPlayer(neutraliser);
		updateStatus(p1, p2, BuddyType.NEUTRAL);
		
		if (is.getIsEnabledList().get("KeyStoneChat")) {
			
			msg.sendMessage(becomeNeutral + neutralised, p2);
			msg.sendMessage(becomeNeutral + neutraliser, p1);
			
		} else {
			
			p1.sendMessage(becomeNeutral + neutraliser);
			p2.sendMessage(becomeNeutral + neutralised);
			
		}
		
	}
	
	public void makeEnemy(Player enemied, Player enemy) {
		
		updateStatus(enemied, enemy, BuddyType.ENEMY);
		
		if (is.getIsEnabledList().get("KeyStoneChat")) {
			
			msg.sendMessage(becomeEnemy + enemied, enemy);
			msg.sendMessage(becomeEnemy + enemy, enemied);
			
		} else {
			
			enemied.sendMessage(becomeEnemy + enemy);
			enemy.sendMessage(becomeEnemy + enemied);
			
		}
		
	}
	
	public void ignorePlayer(Player ignored, Player ignorer) {
		
		updateStatus(ignored, ignorer, BuddyType.IGNORE);
		
	}
	

	
	private void updateStatus(Player invitee, Player inviter, BuddyType buddyType) {
		
		if (BuddyType.isMember(buddyType)) {
			
			List<String> friends;
			List<String> enemies;
			List<String> ignore;
			
			friends = friendList.get(invitee.getName());
			enemies = enemyList.get(invitee.getName());
			ignore = ignoreList.get(invitee.getName());
			
			if (buddyType.equals(BuddyType.FRIEND)) {
				
				friends = friendList.get(invitee.getName());
				enemies = enemyList.get(invitee.getName());
				ignore = ignoreList.get(invitee.getName());
				
				if (!(friends.contains(inviter.getName()))) {
					
					friends.add(inviter.getName());
					
				}
				
				while (enemies.contains(inviter.getName())) {
					
					enemies.remove(inviter.getName());
					
				}
				
				while (ignore.contains(inviter.getName())) {
					
					ignore.remove(inviter.getName());
					
				}
				
				friends = friendList.get(inviter.getName());
				enemies = enemyList.get(inviter.getName());
				ignore = ignoreList.get(inviter.getName());
				
				if (!(friends.contains(invitee.getName()))) {
					
					friends.add(invitee.getName());
					
				}
				
				while (enemies.contains(invitee.getName())) {
					
					enemies.remove(invitee.getName());
					
				}
				
				while (ignore.contains(invitee.getName())) {
					
					ignore.remove(invitee.getName());
					
				}
			
			} else if (buddyType.equals(BuddyType.ENEMY)) {
			
				friends = friendList.get(invitee.getName());
				enemies = enemyList.get(invitee.getName());
				ignore = ignoreList.get(invitee.getName());
				
				if (!(enemies.contains(inviter.getName()))) {
					
					enemies.add(inviter.getName());
					
				}
				
				while (friends.contains(inviter.getName())) {
					
					friends.remove(inviter.getName());
					
				}
				
				while (ignore.contains(inviter.getName())) {
					
					ignore.remove(inviter.getName());
					
				}
				
				friends = friendList.get(inviter.getName());
				enemies = enemyList.get(inviter.getName());
				ignore = ignoreList.get(inviter.getName());
				
				if (!(enemies.contains(invitee.getName()))) {
					
					enemies.add(invitee.getName());
					
				}
				
				while (friends.contains(invitee.getName())) {
					
					friends.remove(invitee.getName());
					
				}
				
				while (ignore.contains(invitee.getName())) {
					
					ignore.remove(invitee.getName());
					
				}
			
			} else if (buddyType.equals(BuddyType.IGNORE)) {
			
				friends = friendList.get(invitee.getName());
				enemies = enemyList.get(invitee.getName());
				ignore = ignoreList.get(invitee.getName());
				
				if (!(ignore.contains(inviter.getName()))) {
					
					ignore.add(inviter.getName());
					
				}
				
				while (enemies.contains(inviter.getName())) {
					
					enemies.remove(inviter.getName());
					
				}
				
				while (friends.contains(inviter.getName())) {
					
					friends.remove(inviter.getName());
					
				}
				
				friends = friendList.get(inviter.getName());
				enemies = enemyList.get(inviter.getName());
				ignore = ignoreList.get(inviter.getName());
				
				if (!(ignore.contains(invitee.getName()))) {
					
					ignore.add(invitee.getName());
					
				}
				
				while (enemies.contains(invitee.getName())) {
					
					enemies.remove(invitee.getName());
					
				}
				
				while (friends.contains(invitee.getName())) {
					
					friends.remove(invitee.getName());
					
				}
			
			} else {
				
				friends = friendList.get(invitee.getName());
				enemies = enemyList.get(invitee.getName());
				ignore = ignoreList.get(invitee.getName());
				
				while (friends.contains(inviter.getName())) {
					
					friends.remove(inviter.getName());
					
				}
				
				while (enemies.contains(inviter.getName())) {
					
					enemies.remove(inviter.getName());
					
				}
				
				while (ignore.contains(inviter.getName())) {
					
					ignore.remove(inviter.getName());
					
				}
				
				friends = friendList.get(inviter.getName());
				enemies = enemyList.get(inviter.getName());
				ignore = ignoreList.get(inviter.getName());
				
				while (friends.contains(invitee.getName())) {
					
					friends.remove(invitee.getName());
					
				}
				
				while (enemies.contains(invitee.getName())) {
					
					enemies.remove(invitee.getName());
					
				}
				
				while (ignore.contains(invitee.getName())) {
					
					ignore.remove(invitee.getName());
					
				}
				
			}
				
		}
		
	}
	
	public HashMap<String, List<String>> getFriendList() {
		return friendList;
	}
	
	public void setFriendList(HashMap<String, List<String>> friendList) {
		this.friendList = friendList;
	}
	
	public HashMap<String, List<String>> getEnemyList() {
		return enemyList;
	}
	
	public void setEnemyList(HashMap<String, List<String>> enemyList) {
		this.enemyList = enemyList;
	}
	
	public HashMap<String, List<String>> getIgnoreList() {
		return ignoreList;
	}
	
	public void setIgnoreList(HashMap<String, List<String>> ignoreList) {
		this.ignoreList = ignoreList;
	}
	
}

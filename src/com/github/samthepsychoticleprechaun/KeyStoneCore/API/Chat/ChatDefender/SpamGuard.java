package com.github.samthepsychoticleprechaun.KeyStoneCore.API.Chat.ChatDefender;

import java.util.PriorityQueue;

import org.bukkit.entity.Player;

import com.github.samthepsychoticleprechaun.KeyStoneCore.KeyStoneCore;
import com.github.samthepsychoticleprechaun.KeyStoneCore.API.MySQL.ExecuteQuery;
import com.github.samthepsychoticleprechaun.KeyStoneCore.Storage.ConfigValues;

public class SpamGuard {
	
	KeyStoneCore plugin = KeyStoneCore.plugin;
	static boolean mysql = ConfigValues.usemysql;	
	private static PriorityQueue<Player> recentchatlist = new PriorityQueue<Player>();
	
	public static PriorityQueue<Player> getRecentChatList() {
		return recentchatlist;
	}
	
	
	
	
	/**
	 * Checks a player's offence count for spamming and returns the value
	 * 
	 * @param player
	 * @return boolean
	 */
	public static boolean checkOffenceCount(Player player) {
		
		String name = player.getName();
		
		if (mysql) {
			
			int count = Integer.parseInt(ExecuteQuery.getString("SELECT offenceCount FROM ks_spamlist WHERE playerName = '" + name + "'", 0));
			
			
		}
		
	}

}

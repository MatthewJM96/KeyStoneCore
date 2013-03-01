package com.github.samthepsychoticleprechaun.KeyStoneCore.API.Chat.ChatDefender;

import java.util.PriorityQueue;
import java.util.logging.Logger;

import org.bukkit.entity.Player;

import com.github.samthepsychoticleprechaun.KeyStoneCore.KeyStoneCore;
import com.github.samthepsychoticleprechaun.KeyStoneCore.API.General.TimeParser;
import com.github.samthepsychoticleprechaun.KeyStoneCore.API.MySQL.ExecuteQuery;
import com.github.samthepsychoticleprechaun.KeyStoneCore.Storage.ConfigValues;

public class SpamGuard {
	
	KeyStoneCore plugin = KeyStoneCore.plugin;
	static boolean mysql = ConfigValues.usemysql;	
	static Logger log = KeyStoneCore.log;
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
	public static int checkOffenceCount(Player player) {
		
		String name = player.getName();
		int count = 0;
		
		if (mysql) {
			
			//RemovalRate is in milliseconds while the config value is in minutes - config value * 60 * 1000 = configvalue * 60000
			int removalRate = ConfigValues.foulcountremovalrate * 60000;
			count = Integer.parseInt(ExecuteQuery.getString("SELECT offenceCount FROM ks_spamlist WHERE playerName = '" + name + "'", 0));
			String latestCountRemoval = ExecuteQuery.getString("SELECT latestCountRemoval FROM ks_spamlist WHERE playerName = '" + name + "'", 0);
			
			int diff = TimeParser.timeDifferenceToCurrent(latestCountRemoval);
			
			if (diff > removalRate) {
				
				int totalDiff = (int) Math.floor(diff / removalRate);				
				count -= totalDiff;
				double remainder = diff % removalRate;				
				int leftOver;
				String newLatestRemoval = null;
				
				if (remainder != 0) {
					
					//Multiplied by 1000 to get time in seconds
					leftOver = (int) remainder * removalRate / 1000;
					
					newLatestRemoval = TimeParser.updateTime(leftOver, "seconds");
					
				}
				
				if (newLatestRemoval != null) {
				
				ExecuteQuery.executeQuery("INSERT INTO ks_spamlist(offenceCount, latestCountRemoval) VALUES(" + count + ", " + newLatestRemoval + ") WHERE playerName = '" + name + "'");
				
				} else {
					
					log.info("Error updating offence count!");
					
				}
				
			}
			
		} else {
			
			
			
		}
		
		return count;
		
	}

}

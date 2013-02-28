package com.github.samthepsychoticleprechaun.KeyStoneCore.API.Chat.ChatDefender;

import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitTask;

import com.github.samthepsychoticleprechaun.KeyStoneCore.KeyStoneCore;
import com.github.samthepsychoticleprechaun.KeyStoneCore.Storage.ConfigValues;

public class SpamListClearer extends BukkitRunnable {
	
	static KeyStoneCore plugin = KeyStoneCore.plugin;
	static int period = ConfigValues.spamchatperiod;
	
	public static void initiateSpamListClearer() {
		BukkitTask task = new SpamListClearer().runTaskTimer(plugin, period, period);
	}
	
	public void run() {
		
		SpamGuard.getRecentChatList().poll();
		
	}

}

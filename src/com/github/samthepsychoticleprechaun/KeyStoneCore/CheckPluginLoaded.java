package com.github.samthepsychoticleprechaun.KeyStoneCore;

import java.util.List;

import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitTask;

public class CheckPluginLoaded extends BukkitRunnable {
	
	private static KeyStoneCore plugin = KeyStoneCore.plugin;
	
	public static boolean keyStoneChatStatus = false;
	public static boolean keyStoneChatGuardStatus = false;
	public static boolean keyStonePunishStatus = false;
	public static boolean keyStoneEconomyStatus = false;
	
	private static List<String> pluginsToCheck;
	public static List<Boolean> pluginsStatus;

	public static void checkPluginsLoaded(List<String> list) {
		
		pluginsToCheck = list;
		BukkitTask task = new CheckPluginLoaded().runTaskLater(plugin, 100l);
		
	}
	
	public void run() {
		
		for(int x = 0; x <= (pluginsToCheck.size() - 1); x++) {
			
			if (plugin.getServer().getPluginManager().getPlugin(pluginsToCheck.get(x)) != null) {
				
				if (plugin.getServer().getPluginManager().getPlugin(pluginsToCheck.get(x)).isEnabled()) {
					
					pluginsStatus.add(true);
					
				}
				
				pluginsStatus.add(false);
				
			}
			
			pluginsStatus.add(false);
			
		}
		
		keyStoneChatStatus = pluginsStatus.get(0);
		keyStoneChatGuardStatus = pluginsStatus.get(1);
		keyStonePunishStatus = pluginsStatus.get(2);
		keyStoneEconomyStatus = pluginsStatus.get(3);
		
	}
	
}

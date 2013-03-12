package com.github.samthepsychoticleprechaun.KeyStoneCore.API.General;

import java.util.HashMap;
import org.bukkit.plugin.Plugin;

import com.github.samthepsychoticleprechaun.KeyStoneCore.KeyStoneCore;

public class IsEnabled {

	private static KeyStoneCore plugin = KeyStoneCore.plugin;
	
	private static HashMap<String, Boolean> isEnabledList;
	
	public IsEnabled() {
		return;
	}
	
	private void updateList() {
		
		isEnabledList.clear();
		
		Plugin[] list = plugin.getServer().getPluginManager().getPlugins();
		
		for(Plugin plugin : list) {
			
			String p = plugin.getName();
			
			while (p.contains(" ")) {
				p.replace(" ", "");
			}
			
			if (p.contains("KeyStone")) {
				
				isEnabledList.put(p, true);
				
			}
			
		}
		
	}
	
	public HashMap<String, Boolean> getIsEnabledList() {
		updateList();
		return isEnabledList;
	}	
	
}

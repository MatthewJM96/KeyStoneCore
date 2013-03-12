package com.github.samthepsychoticleprechaun.KeyStoneCore.CommandHandler.Commands.Help;

import org.bukkit.entity.Player;

import com.github.samthepsychoticleprechaun.KeyStoneCore.API.General.IsEnabled;

public class Help {
	
	IsEnabled is = new IsEnabled();
	
	public boolean helpCommand(Player p) {
		
		
		
		return true;
		
	}
	
	public boolean helpCommand(Player p, String module) {
		
		
		
		return true;
		
	}
	
	private void CoreHelp() {
		
		if (is.getIsEnabledList().get("Key Stone Core")) {
			
			
			
		}
		
	}

}

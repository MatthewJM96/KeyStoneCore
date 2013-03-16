package com.github.samthepsychoticleprechaun.KeyStoneCore.CommandHandler.Commands.Help;

import org.bukkit.entity.Player;

import com.github.samthepsychoticleprechaun.KeyStoneCore.API.General.IsEnabled;
import com.github.samthepsychoticleprechaun.KeyStoneCore.API.General.Modules.Module;

public class Help {
	
	IsEnabled is = new IsEnabled();
	
	public boolean helpCommand(Player p) {
		
		CoreHelp(p);
		ChatHelp(p);
		ChatGuardHelp(p);
		EconomyHelp(p);
		PunishHelp(p);
		
		return true;
		
	}
	
	public boolean helpCommand(Player p, String module) {
		
		Module m = null;
		
		if (module.equalsIgnoreCase("CORE")) {
			m = Module.CORE;
		} else if (module.equalsIgnoreCase("CHAT")) {
			m = Module.CHAT;
		} else if (module.equalsIgnoreCase("CHATGUARD")) {
			m = Module.CHATGUARD;
		} else if (module.equalsIgnoreCase("ECONOY")) {
			m = Module.ECONOMY;
		} else if (module.equalsIgnoreCase("PUNISH")) {
			m = Module.PUNISH;
		} else {
			m = Module.CORE;
		}
		
		switch (m) {
		
		case CORE:
			CoreHelp(p);
			break;
			
		case CHAT:
			ChatHelp(p);
			break;
		
		case CHATGUARD:
			ChatGuardHelp(p);
			break;
			
		case ECONOMY:
			EconomyHelp(p);
			break;
			
		case PUNISH:
			PunishHelp(p);
			break;
			
		default:
			CoreHelp(p);
			break;
			
		}
		
		return true;
		
	}
	
	private void CoreHelp(Player player) {
		
		if (is.getIsEnabledList().get("KeyStoneCore")) {
			
			
			
		}
		
	}
	
	private void ChatHelp(Player player) {
		
		if (is.getIsEnabledList().get("KeyStoneChat")) {
			
			
			
		}
		
	}
	
	private void ChatGuardHelp(Player player) {
		
		if (is.getIsEnabledList().get("KeyStoneChatGuard")) {
			
			
			
		}
		
	}
	
	private void EconomyHelp(Player player) {
		
		if (is.getIsEnabledList().get("KeyStoneEconomy")) {
			
			
			
		}
		
	}
	
	private void PunishHelp(Player player) {
		
		if (is.getIsEnabledList().get("KeyStonePunish")) {
			
			
			
		}
		
	}

}

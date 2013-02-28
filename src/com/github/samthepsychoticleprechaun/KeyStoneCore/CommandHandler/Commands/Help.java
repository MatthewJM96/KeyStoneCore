package com.github.samthepsychoticleprechaun.KeyStoneCore.CommandHandler.Commands;

import org.bukkit.command.CommandSender;

import com.github.samthepsychoticleprechaun.KeyStoneCore.Storage.StringValues;

public class Help {
	
	public static boolean helpNoneSpecificAdmin(CommandSender sender) {
		
		sender.sendMessage(StringValues.adminhelpnonespecific);
		return true;
		
	}
	
	public static boolean helpNoneSpecificBasic(CommandSender sender) {
		
		sender.sendMessage(StringValues.basichelpnonespecific);
		return true;
		
	}

}

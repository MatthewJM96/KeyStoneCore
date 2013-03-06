package com.github.samthepsychoticleprechaun.KeyStoneCore.CommandHandler;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.github.samthepsychoticleprechaun.KeyStoneChat.API.Chat.SendMessage;
import com.github.samthepsychoticleprechaun.KeyStoneCore.CommandHandler.Commands.Help;
import com.github.samthepsychoticleprechaun.KeyStoneCore.Permissions.PermissionList;
import com.github.samthepsychoticleprechaun.KeyStoneCore.Storage.StringValues;

public class CommandHandler implements CommandExecutor{
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		
		Player p = (Player) sender;
		String message = StringValues.warnofnopermission;
		
		if (p.hasPermission(PermissionList.basiccmdusage)) {
			
			if (args[0].equalsIgnoreCase("help")) {
				
				if(sender.hasPermission(PermissionList.helpadmin) || !(sender instanceof Player) || sender.isOp()) {
					
					Help.helpNoneSpecificAdmin(sender);
					
				} else {
					
					Help.helpNoneSpecificBasic(sender);
					
				}
				
			} else {
				
				if(sender.hasPermission(PermissionList.helpadmin) || !(sender instanceof Player) || sender.isOp()) {
					
					Help.helpNoneSpecificAdmin(sender);
					
				} else {
					
					Help.helpNoneSpecificBasic(sender);
					
				}
				
				if(args.length == 0) {
					
					return true;
					
				}
					
				return false;
				
			}
			
		} else {
			
			SendMessage.sendMessage(message, p);
			
			return false;
			
		}
		
		if(args.length == 0) {
			
			return true;
			
		}
		
		return false;
		
	}

}

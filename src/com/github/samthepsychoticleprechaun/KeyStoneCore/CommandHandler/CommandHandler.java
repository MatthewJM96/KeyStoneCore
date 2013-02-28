package com.github.samthepsychoticleprechaun.KeyStoneCore.CommandHandler;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.github.samthepsychoticleprechaun.KeyStoneCore.API.Permissions.PermissionList;
import com.github.samthepsychoticleprechaun.KeyStoneCore.CommandHandler.Commands.Help;
import com.github.samthepsychoticleprechaun.KeyStoneCore.Storage.StringValues;

public class CommandHandler implements CommandExecutor{
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		
		Player p = (Player) sender;
		String message = StringValues.warnofnopermission;
		
		new PermissionList();
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
				
			}
			
		} else {
			
			p.sendMessage(message);
			
		}
		
		return true;
		
	}

}

package com.github.samthepsychoticleprechaun.KeyStoneCore.CommandHandler;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.github.samthepsychoticleprechaun.KeyStoneChat.API.Chat.SendMessage;
import com.github.samthepsychoticleprechaun.KeyStoneCore.API.General.IsEnabled;
import com.github.samthepsychoticleprechaun.KeyStoneCore.CommandHandler.Commands.Reload;
import com.github.samthepsychoticleprechaun.KeyStoneCore.Permissions.PermissionList;
import com.github.samthepsychoticleprechaun.KeyStoneCore.Storage.StringValues;

public class CommandHandler implements CommandExecutor{
	
	PermissionList perm = new PermissionList();
	IsEnabled isEnabled = new IsEnabled();
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		
		Player p = (Player) sender;
		StringValues load = new StringValues();
		String noperm = load.warnofnopermission;
		String extraargs = load.extraargcmd;
		SendMessage msg = null;
		if (isEnabled.getIsEnabledList().get("KeyStoneChat")) {
			msg = new SendMessage();
		}
		
		if (p.hasPermission(perm.getBasiccmdusage())) {
			
			if (args[0].equalsIgnoreCase("help")) {
				
				if (args.length == 1) {
					
					if (isEnabled.getIsEnabledList().get("KeyStoneChat")) {

						//TODO: Something
						
					} else {
						
						//TODO: Something
						
					}
					
				} else if (args.length == 2) {
					
					//TODO: Something
					
				} else {
					
					if (isEnabled.getIsEnabledList().get("KeyStoneChat")) {
						
						msg.sendMessage(extraargs, p);
						
					} else {
						
						p.sendMessage(extraargs);
						
					}
					
				}
				
			} else if (args[0].equalsIgnoreCase("reload")) {
				
				Reload r = new Reload();
				
				if (args.length == 1) {
					
					r.reload(sender);
					
					
				} else if (args.length == 2) {
					
					if (args[1].equalsIgnoreCase("Core")) {
						
						r.reloadCore(sender);
						
					} else if (args[1].equalsIgnoreCase("Chat")) {
						
						r.reloadChat(sender);
						
					} else if (args[1].equalsIgnoreCase("ChatGuard")) {
						
						r.reloadChatGuard(sender);
						
					}
					
				} else {
					
					if (isEnabled.getIsEnabledList().get("KeyStoneChat")) {
						
						msg.sendMessage(extraargs, p);
						
					} else {
						
						p.sendMessage(extraargs);
						
					}
					
				}
				
			}
			
		} else {
			
			if (isEnabled.getIsEnabledList().get("KeyStoneChat")) {
			
				msg.sendMessage(noperm, p);
			
			} else {
				
				p.sendMessage(noperm);
				
			}
			
			return false;
			
		}
		
		if(args.length == 0) {
			
			return true;
			
		}
		
		return false;
		
	}

}

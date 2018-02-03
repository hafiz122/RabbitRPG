package me.rabbitdegamer.rabbitrpg.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class Command_suicide implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("suicide") && sender instanceof Player);
		Player s = (Player) sender;
		s.sendMessage(ChatColor.RED + "Error: Unknown reason");
		
		return true;
		
	}
	
}

package me.rabbitdegamer.rabbitrpg.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Command_leaveprank implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("leaveprank") && sender instanceof Player);
		
		Player s = (Player) sender;
		
		Bukkit.getServer().broadcastMessage(ChatColor.YELLOW + s.getName() + " left the game");
		
		return true;
		
	}
	
}

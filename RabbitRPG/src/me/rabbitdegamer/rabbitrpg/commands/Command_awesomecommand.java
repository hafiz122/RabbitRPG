package me.rabbitdegamer.rabbitrpg.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Command_awesomecommand implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("awesomecommand") && sender instanceof Player);
		Player s = (Player) sender;
		Bukkit.getServer().broadcastMessage("<" + ChatColor.DARK_RED + s.getName() + "> " + ChatColor.WHITE + "Let's go to Japan!");
		return true;
		
	}
	
}

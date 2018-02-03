package me.rabbitdegamer.rabbitrpg.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Command_burninhell implements CommandExecutor{

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("burninhell") && sender instanceof Player);
		
		Player s = (Player)	sender;
		
		s.setFireTicks(1000);
		
		s.sendMessage(ChatColor.YELLOW + "DIEDIEDIEDIEDIEDIEDIEBURNBURNBURNBURN");
		
		return true;
		
	}
	
}

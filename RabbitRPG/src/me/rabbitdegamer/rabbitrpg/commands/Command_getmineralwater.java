package me.rabbitdegamer.rabbitrpg.commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Command_getmineralwater implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("getmineralwater") && sender instanceof Player);
		
		ItemStack mineralwater = new ItemStack(Material.POTION, 1);
		
		ItemMeta mineralwatermeta = mineralwater.getItemMeta();
		
		mineralwatermeta.setDisplayName(ChatColor.BLUE + "Mineral Water");
		
		return true;
		
	}
	
}

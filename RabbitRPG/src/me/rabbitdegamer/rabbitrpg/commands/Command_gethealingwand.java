package me.rabbitdegamer.rabbitrpg.commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Command_gethealingwand implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("") && sender instanceof Player);
		
		Player s = (Player) sender;
		
		ItemStack healingWand = new ItemStack(Material.IRON_AXE, 1);
		
		ItemMeta healingWandMeta = healingWand.getItemMeta();
		healingWand.setItemMeta(healingWandMeta);
		healingWandMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Healing Wand");
		s.getInventory().addItem(healingWand);
		
		return true;
		
	}
	
}

package me.rabbitdegamer.rabbitrpg.commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Command_getarrowrainingrod implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player s = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("getarrowrainingrod") && sender instanceof Player);
		ItemStack wand = new ItemStack(Material.GOLD_HOE, 1);
		ItemMeta wandMeta = wand.getItemMeta();
		wandMeta.setDisplayName(ChatColor.AQUA + "Arrow Raining Rod");
		wand.setItemMeta(wandMeta);
		
		if (s.getInventory().contains(wand)) 
		{
            s.sendMessage(ChatColor.RED + "You already have this item in your inventory!");
            return true;
        } else {
            s.getInventory().addItem(wand);
            s.sendMessage(ChatColor.RED + "You have received " + ChatColor.LIGHT_PURPLE + "the Arrow Raining Rod!");
        }
			return true;
		}
	
}

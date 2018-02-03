package me.rabbitdegamer.rabbitrpg.commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Command_getrabbitwand implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("getrabbitwand"));
		Player s = (Player) sender;
		ItemStack wand = new ItemStack(Material.BONE, 1);
		ItemMeta wandMeta = wand.getItemMeta();
		wandMeta.setDisplayName(ChatColor.DARK_BLUE + "Rabbit Wand");
		wand.setItemMeta(wandMeta);
		
		if (s.getInventory().contains(wand)) 
		{
            s.sendMessage(ChatColor.RED + "You already have this item in your inventory!");
            return true;
        } else {
            s.getInventory().addItem(wand);
            s.sendMessage(ChatColor.RED + "You have received " + ChatColor.LIGHT_PURPLE + "the Rabbit Wand!");
        }
			return true;
		}
	
}

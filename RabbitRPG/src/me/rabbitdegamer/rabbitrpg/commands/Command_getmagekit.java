package me.rabbitdegamer.rabbitrpg.commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Command_getmagekit implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("getmagekit") && sender instanceof Player);
		
		Player s = (Player) sender;
		
		if(s.hasPermission("rabbitrpg.getmagekit"));
		
		ItemStack mage = new ItemStack(Material.DIAMOND_HELMET, 1);
		ItemMeta mageMeta = mage.getItemMeta();
		mageMeta.setDisplayName(ChatColor.DARK_BLUE + "Mage Helmet");
		mage.setItemMeta(mageMeta);
            s.getInventory().addItem(mage);
            s.sendMessage(ChatColor.RED + "You have received " + ChatColor.DARK_BLUE + "the Mage Helmet!");
            		
        ItemStack mage1 = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
        ItemMeta mageMeta1 = mage.getItemMeta();
        mageMeta1.setDisplayName(ChatColor.DARK_BLUE + "Mage Chestplate");
        mage1.setItemMeta(mageMeta1);
        	s.getInventory().addItem(mage1);
        	s.sendMessage(ChatColor.RED + "You have received " + ChatColor.DARK_BLUE + "the Mage Chestplate!");
        	
        ItemStack mage2 = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
        ItemMeta mageMeta2 = mage.getItemMeta();
        mageMeta2.setDisplayName(ChatColor.DARK_BLUE + "Mage Leggings");
        mage2.setItemMeta(mageMeta2);
        	s.getInventory().addItem(mage2);
    
        ItemStack mage3 = new ItemStack(Material.DIAMOND_BOOTS, 1);
        ItemMeta mageMeta3 = mage3.getItemMeta();
        mageMeta3.setDisplayName(ChatColor.DARK_BLUE + "Mage Boots");
        	s.getInventory().addItem(mage3);
        	s.sendMessage(ChatColor.RED + "You have received " + ChatColor.DARK_BLUE + "the Mage Boots!");
        
		return true;

		
	}

	
}

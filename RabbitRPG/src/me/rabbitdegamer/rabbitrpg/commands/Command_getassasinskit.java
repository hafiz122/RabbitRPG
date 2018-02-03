package me.rabbitdegamer.rabbitrpg.commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Command_getassasinskit implements CommandExecutor {
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("getassassinskit") && sender instanceof Player);
		
		Player s = (Player) sender;
		
		if(s.hasPermission("rabbitrpg.getassassinskit"));
		
		ItemStack assassin1 = new ItemStack(Material.IRON_HELMET, 1);
		ItemMeta assassinMeta = assassin1.getItemMeta();
		assassinMeta.setDisplayName(ChatColor.DARK_BLUE + "Assassins Kit");
		assassin1.setItemMeta(assassinMeta);
            s.getInventory().addItem(assassin1);
            s.sendMessage(ChatColor.RED + "You have received " + ChatColor.DARK_BLUE + "the Assassin helmet!");
    
        ItemStack assassin2 = new ItemStack(Material.IRON_CHESTPLATE, 1);
        ItemMeta assassinMeta2 = assassin2.getItemMeta();
        assassinMeta2.setDisplayName(ChatColor.DARK_BLUE + "Assassins Chestplate");
        assassin2.setItemMeta(assassinMeta2);
        	s.getInventory().addItem(assassin2);
        	s.sendMessage(ChatColor.RED + "You have received " + ChatColor.DARK_BLUE + "the Assassins chestplate!");
        	
        ItemStack assassin3 = new ItemStack(Material.IRON_LEGGINGS, 1);
        ItemMeta assassinMeta3 = assassin3.getItemMeta();
        assassinMeta3.setDisplayName(ChatColor.DARK_BLUE + "Assassins Leggings");
        assassin3.setItemMeta(assassinMeta3);
            	s.getInventory().addItem(assassin3);
            	s.sendMessage(ChatColor.RED + "You have received " + ChatColor.DARK_BLUE + "the Assassins leggings!");

		ItemStack assassin4 = new ItemStack(Material.IRON_BOOTS, 1);
		ItemMeta assassinMeta4 = assassin4.getItemMeta();
		assassinMeta4.setDisplayName(ChatColor.DARK_BLUE + "Assassins Boots");
		assassin4.setItemMeta(assassinMeta4);
		        	s.getInventory().addItem(assassin4);
		        	s.sendMessage(ChatColor.RED + "You have received " + ChatColor.DARK_BLUE + "the Assassins boots!");
		        	
		        	s.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 9999999, 2));
		        	s.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 999999, 1));
		         	s.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 999999, 1));
		        	
		        	return true;
		}
	
	
}


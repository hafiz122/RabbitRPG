package me.rabbitdegamer.rabbitrpg.listeners;


import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Blaze;
import org.bukkit.entity.DragonFireball;
import org.bukkit.entity.EnderPearl;
import org.bukkit.entity.Fireball;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class RabbitRPG_Events implements Listener {
	
    @EventHandler
    public void onRabbitRPG(PlayerInteractEvent e) {
        Player s = e.getPlayer();
        
        ItemStack item = s.getInventory().getItemInMainHand();
        if(item.getType().equals(Material.STICK))
        {
            if(e.getAction() == Action.RIGHT_CLICK_AIR)
            {
                Fireball fire = s.getWorld().spawn(e.getPlayer().getLocation(), Fireball.class);
        fire.setShooter(s);
            } else {
                return;
            }
        
            
        } else {
            return;
        }


        	}
    @EventHandler
	 public void onRabbitRPG1(PlayerInteractEvent e) {
      Player s = e.getPlayer();
      
      ItemStack item = s.getInventory().getItemInMainHand();
      if(item.getType().equals(Material.BONE))
      {
          if(e.getAction() == Action.LEFT_CLICK_AIR)
          {
              EnderPearl ep = s.getWorld().spawn(e.getPlayer().getLocation(), EnderPearl.class);
      ep.setShooter(s);
          } else {
              return;
          }
      
          
      } else {
          return;
      }

      if(e.getAction() == Action.RIGHT_CLICK_AIR)
      {
          Blaze bz = s.getWorld().spawn(e.getPlayer().getLocation(), Blaze.class);
  bz.isLeashed();
      } else {
          return;
      }
      
	
}
  
    @EventHandler
	 public void onRabbitRPG2(PlayerInteractEvent e) {
       Player s = e.getPlayer();
       
       ItemStack item = s.getInventory().getItemInMainHand();
       if(item.getType().equals(Material.BLAZE_ROD))
       {
           if(e.getAction() == Action.RIGHT_CLICK_AIR)
           {
               DragonFireball df = s.getWorld().spawn(e.getPlayer().getLocation(), DragonFireball.class);
       df.setShooter(s);
           } else {
               return;
           }
       
           
       } else {
           return;
       }


       	}
    
    @EventHandler
     public void onRabbitRPG3(PlayerJoinEvent e) {
    	Player s = e.getPlayer();
    	
    	Bukkit.getServer().broadcastMessage(ChatColor.BLUE + "Welcome to the server! " + ChatColor.LIGHT_PURPLE + s.getName());
    	
    }
    @EventHandler
    public void onRabbitRPG4(PlayerInteractEvent e) {
        Player s = e.getPlayer();
        
        ItemStack item = s.getInventory().getItemInMainHand();
        if(item.getType().equals(Material.GOLD_HOE))
        {
            if(e.getAction() == Action.RIGHT_CLICK_AIR)
            {
                Arrow arrow = s.getWorld().spawn(e.getPlayer().getLocation(), Arrow.class);
              arrow.setShooter(s);
            } else {
                return;
            }
        

        } else {
            return;
        }

        	
        
        	}
       	
    	@EventHandler
    	public void onRabbitRPG5(PlayerInteractEvent e) {
    		Player s = e.getPlayer();
    		
    		ItemStack item = s.getInventory().getItemInMainHand();
    	       if(item.getType().equals(Material.IRON_AXE))
    	       {
    	           if(e.getAction() == Action.RIGHT_CLICK_AIR)
    	           {
    	        	   
    	        	   s.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 55, 50));
    	        	   s.sendMessage(ChatColor.LIGHT_PURPLE + "You have been healed!");
    	        	   
    	           } else {
    	               return;
    	           }
    	       
    	           
    	       } else {
    	           return;
    	       }


    	}

    	@EventHandler
    	public void onRabbitRPG6(PlayerInteractEvent e) {
    		Player s = e.getPlayer();
    		
    		ItemStack item = s.getInventory().getItemInMainHand();
    		if(item.getType().equals(Material.IRON_INGOT));
    		
    	}
    	
    	}
    	
    	        
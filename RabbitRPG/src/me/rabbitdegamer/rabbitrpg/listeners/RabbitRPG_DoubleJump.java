package me.rabbitdegamer.rabbitrpg.listeners;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerToggleFlightEvent;

public class RabbitRPG_DoubleJump implements Listener {


	@EventHandler
	public void onDoubleJump(PlayerMoveEvent e) {
		Player s = e.getPlayer();
		if((s.getGameMode() != GameMode.CREATIVE)
				&& (s.getLocation().subtract(0, 1, 0).getBlock().getType() != Material.AIR)
				&& (!s.isFlying()))
			s.setAllowFlight(true);
	}

	@EventHandler
	public void onFlight(PlayerToggleFlightEvent e) {
		Player s = e.getPlayer();
		if (s.getGameMode() == GameMode.CREATIVE)
			return;
		
		e.setCancelled(true);
		s.setAllowFlight(false);
		s.setFlying(false);
		s.setVelocity(s.getLocation().getDirection().multiply(1.5).setY(1));
	}
	
	
}

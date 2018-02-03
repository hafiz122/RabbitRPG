package me.rabbitdegamer.rabbitrpg;

import org.bukkit.Bukkit;
import org.bukkit.permissions.Permission;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import me.rabbitdegamer.rabbitrpg.commands.Command_awesomecommand;
import me.rabbitdegamer.rabbitrpg.commands.Command_burninhell;
import me.rabbitdegamer.rabbitrpg.commands.Command_getarrowrainingrod;
import me.rabbitdegamer.rabbitrpg.commands.Command_getassasinskit;
import me.rabbitdegamer.rabbitrpg.commands.Command_getelderwand;
import me.rabbitdegamer.rabbitrpg.commands.Command_gethealingwand;
import me.rabbitdegamer.rabbitrpg.commands.Command_getmagekit;
import me.rabbitdegamer.rabbitrpg.commands.Command_getrabbitwand;
import me.rabbitdegamer.rabbitrpg.commands.Command_getwand;
import me.rabbitdegamer.rabbitrpg.commands.Command_leaveprank;
import me.rabbitdegamer.rabbitrpg.listeners.RabbitRPG_DoubleJump;
import me.rabbitdegamer.rabbitrpg.listeners.RabbitRPG_Events;

public class RabbitRPGMain extends JavaPlugin {

	public Permission pperm = new Permission("rabbitrpg.getassassinskit");
	public Permission pperm1 = new Permission("rabbitrpg.getmagekit");
	public Permission pperm2 = new Permission("rabbitrpg.getrabbitwand");
	public Permission pperm3 = new Permission("rabbitrpg.getelderwand");
	public Permission pperm4 = new Permission("rabbitrpg.getarrowrainingrod");
	public Permission pperm5 = new Permission("rabbitrpg.getwand");
	public Permission pperm6 = new Permission("rabbitrpg.awesomecommand");
	public Permission pperm7 = new Permission("rabbitrpg.gethealingwand");
	
	@Override
	public void onEnable() {
		System.out.println("RabbitRPG has been enabled");
		Bukkit.getPluginManager().registerEvents(new RabbitRPG_Events(), this);
		Bukkit.getPluginManager().registerEvents(new RabbitRPG_DoubleJump(), this);
		
		PluginManager pm = getServer().getPluginManager();
		pm.addPermission(pperm);
		pm.addPermission(pperm1);
		pm.addPermission(pperm2);
		pm.addPermission(pperm3);
		
		this.getCommand("getwand").setExecutor(new Command_getwand());
		this.getCommand("getelderwand").setExecutor(new Command_getelderwand());
		this.getCommand("getrabbitwand").setExecutor(new Command_getrabbitwand());
		this.getCommand("getarrowrainingrod").setExecutor(new Command_getarrowrainingrod());
		this.getCommand("awesomecommand").setExecutor(new Command_awesomecommand());
		this.getCommand("getassassinskit").setExecutor(new Command_getassasinskit());
		this.getCommand("getmagekit").setExecutor(new Command_getmagekit());
		this.getCommand("leaveprank").setExecutor(new Command_leaveprank());
		this.getCommand("gethealingwand").setExecutor(new Command_gethealingwand());
		this.getCommand("burninhell").setExecutor(new Command_burninhell());
		
	}
	
	@Override
	public void onDisable() {
		System.out.println("RabbitRPG is disabled");
		
	}
	
}

package com.gmail.werer9;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	private final Logger logger = getLogger();
	
	@Override
	public void onEnable() {
		logger.info("Plugin Started!");
		getCommand("player").setExecutor(null);
	}
	
	@Override
	public void onDisable() {
		logger.info("Stopping BukkitExperiment...");
	}
}
package io.github.fargothcor.spawnhelper.spawnhelper;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender.Spigot;
import org.bukkit.plugin.java.JavaPlugin;

public final class Spawnhelper extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new Handler(), this);
        getCommand("spawn").setExecutor(new commands(this));
        getLogger().info("PLUGIN WAS STARTED SUCCESSFULLY!!!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

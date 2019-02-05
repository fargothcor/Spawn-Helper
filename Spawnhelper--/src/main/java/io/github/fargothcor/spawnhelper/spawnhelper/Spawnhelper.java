package io.github.fargothcor.spawnhelper.spawnhelper;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public final class Spawnhelper extends JavaPlugin {

    @Override
    public void onEnable() {
        this.reloadConfig();
        Bukkit.getPluginManager().registerEvents(new Handler(), this);

        getCommand("spawn").setExecutor(new commands(this));
        getLogger().info("PLUGIN WAS STARTED SUCCESSFULLY!!!");
    }

    @Override
    public void onDisable() {
        getLogger().info("Ty Ahyel????");
    }
}
    
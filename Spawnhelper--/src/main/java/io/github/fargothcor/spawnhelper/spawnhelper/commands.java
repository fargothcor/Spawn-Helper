package io.github.fargothcor.spawnhelper.spawnhelper;

import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static org.bukkit.Bukkit.getWorld;


public class commands implements CommandExecutor {

    private Spawnhelper plugin;

    public commands(Spawnhelper plugin)
    {
        this.plugin = plugin;
    }
    private Double x = plugin.getConfig().getDouble("spawn.coords.x"),
                   y = plugin.getConfig().getDouble("spawn.coords.y"),
                   z = plugin.getConfig().getDouble("spawn.coords.z");
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        if (!(sender instanceof Player)) {
            sender.sendMessage("You must be a player!");
            return true;
        }

        sender.sendMessage(plugin.getConfig().getString("spawn.coords.y"));
        Location loc = new Location(getWorld("world"), x, y, z);
        ((Player) sender).setGameMode(GameMode.ADVENTURE);
        ((Player) sender).teleport(loc);
        
        //((Player) sender).setHealth(20.0);

        return true;
    }
}

package io.github.fargothcor.spawnhelper.spawnhelper;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static org.bukkit.Bukkit.getLogger;
import static org.bukkit.Bukkit.getWorld;


public class commands implements CommandExecutor {
    private Spawnhelper plugin;
    public commands(Spawnhelper plugin)
    {
        this.plugin = plugin;
    }
    
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        if (!(sender instanceof Player)) {
            sender.sendMessage("You must be a player!");
            return true;
        }
        //хуй
        //more хуй
        Location loc = new Location(getWorld("world"),225,65,225);
        ((Player) sender).teleport(loc);
        ((Player) sender).setHealth(20.0);

        return true;
    }
}

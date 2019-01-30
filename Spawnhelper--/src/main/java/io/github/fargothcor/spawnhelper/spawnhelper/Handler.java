package io.github.fargothcor.spawnhelper.spawnhelper;


import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.entity.Player;
public class Handler implements Listener {
    @EventHandler
    public void join(PlayerJoinEvent e){
        Player p=e.getPlayer();
        p.chat("Hello bitch");
    }
    
}

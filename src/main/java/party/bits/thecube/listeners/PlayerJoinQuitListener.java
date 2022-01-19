package party.bits.thecube.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerJoinQuitListener implements Listener {

    @EventHandler
    public void handlePlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();


        player.teleport(player.getWorld().getSpawnLocation());
    }

    @EventHandler
    public void handlePlayerQuit(PlayerQuitEvent event) {

    }
}

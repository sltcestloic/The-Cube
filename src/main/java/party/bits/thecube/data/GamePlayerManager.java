package party.bits.thecube.data;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.Collection;
import java.util.HashMap;
import java.util.UUID;

public class GamePlayerManager extends HashMap<UUID, GamePlayerData> {

    public GamePlayerData getPlayer(Player player) {
        return get(player.getUniqueId());
    }

    public GamePlayerData getPlayer(String playerName) {
        return get(Bukkit.getPlayer(playerName));
    }

    public Collection<GamePlayerData> getPlayers() {
        return values();
    }
}

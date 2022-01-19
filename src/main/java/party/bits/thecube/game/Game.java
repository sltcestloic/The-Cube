package party.bits.thecube.game;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitRunnable;
import party.bits.thecube.TheCube;

public class Game extends BukkitRunnable {

    @Getter @Setter private GameState state;

    private int timer;
    private TheCube theCube;

    public Game(TheCube theCube) {
        this.theCube = theCube;
        state = GameState.LOBBY;
        timer = 60;
    }

    @Override
    public void run() {
        if (state == GameState.LOBBY) {
            if (theCube.getPlayerManager().getPlayers().size() < 8) {
                timer = 60; //reset timer in case someone left
                return;
            }
            timer--;
            if (timer % 10 == 0 || timer <= 5)
                Bukkit.broadcastMessage("La partie commence dans " + timer + " seconde" + (timer > 1 ? "s" : ""));
            if (timer == 1) {
                state = GameState.GAME;
                timer = 0;
            }
        } else if (state == GameState.GAME) {
            if (timer == 0) {
                Bukkit.broadcastMessage("La partie commence !");
                //TODO teleport players
            }
            timer++;
        }
    }

    public enum GameState {
        LOBBY, GAME
    }
}

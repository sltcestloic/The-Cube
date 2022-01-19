package party.bits.thecube;

import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;
import party.bits.thecube.data.GamePlayerManager;

public final class TheCube extends JavaPlugin {

    private static TheCube instance;

    @Getter
    private GamePlayerManager playerManager;

    public static TheCube getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        instance = this;

        playerManager = new GamePlayerManager();
    }

    @Override
    public void onDisable() {
    }
}

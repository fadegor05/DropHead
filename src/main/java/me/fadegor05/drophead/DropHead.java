package me.fadegor05.drophead;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class DropHead extends JavaPlugin {

    private static final Logger logger = Logger.getLogger("Minecraft");

    private static DropHead plugin;

    private static DropHead getPlugin() { return plugin; }

    @Override
    public void onEnable() {
        logger.info("DropHead 1.0 has been enabled!");
    }
}

package me.fadegor05.drophead;

import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.entity.Player;

import java.util.logging.Logger;

public final class DropHead extends JavaPlugin implements Listener {

    private static final Logger logger = Logger.getLogger("Minecraft");

    @Override
    public void onEnable() {
        logger.info("DropHead 1.0 has been enabled!");
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onDeath(PlayerDeathEvent event) {
        Player player = event.getEntity();
        player.getWorld().dropItem(player.getLocation(), getHead(player));
    }

    public static ItemStack getHead(Player player){
        ItemStack head = new ItemStack(Material.PLAYER_HEAD, 1);
        SkullMeta headMeta = (SkullMeta) head.getItemMeta();
        headMeta.setPlayerProfile(player.getPlayerProfile());
        head.setItemMeta(headMeta);
        return head;
    }
}

package me.teixtarcio.tguns;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Egg;
import org.bukkit.entity.Player;
import org.bukkit.entity.Snowball;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class TGuns extends JavaPlugin implements Listener {

    //Diamond Hoe = Snowball Launcher
    //Iron Hoe = Egg Launcher

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent e){

        Player p = e.getPlayer();


        if(e.hasItem()){
            if(e.getItem().getType().equals(Material.DIAMOND_HOE)){
                p.launchProjectile(Snowball.class);
                p.sendMessage(ChatColor.GREEN + "You have shot the snowball!");

            } else if (e.getItem().getType().equals(Material.IRON_HOE)){
                p.launchProjectile(Egg.class);
                p.sendMessage(ChatColor.GREEN + "You have shot the egg!");
            }

        }
    }
}

package me.beezle.ferns;

import org.bukkit.plugin.java.JavaPlugin;

public class Ferns extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new BlockHandler(), this);
        System.out.print("[Ferns v1.0.0] Enabled.");
    }

    @Override
    public void onDisable() {
        System.out.print("[Ferns v1.0.0] Disabled.");
    }
}
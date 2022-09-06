package fr.killbib_coder.smallcommand;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Smallcommand extends JavaPlugin {
    @Override
    public void onEnable() {
        System.out.println("[Smallcommand] Author: Killbib_coder");
        getCommand("gm").setExecutor(new Command());
        getCommand("day").setExecutor(new Command());
        getCommand("night").setExecutor(new Command());
        getCommand("wcl").setExecutor(new Command());
    }

    @Override
    public void onDisable() {
    }
}

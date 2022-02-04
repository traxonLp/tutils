package de.traxonlp;

import de.traxonlp.commands.*;
import de.traxonlp.runnable.Lag;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getLogger().fine("TraxonUtils started. Pls don't kill me :c");
        //TPS Runnable
        Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(this, new Lag(), 100L, 1L);

        commandRegistration();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
    public static String getAutor() {
        return "" + ChatColor.WHITE + ChatColor.BOLD + "Traxon_LP";
    }

    public static String getVersion() {
        return "" + ChatColor.WHITE + ChatColor.BOLD + "1.0";
    }

    public static String getPrefix() {
        return ChatColor.GOLD + "[" + ChatColor.WHITE + ChatColor.BOLD + "T" + ChatColor.YELLOW + ChatColor.BOLD + "Utils" + ChatColor.GOLD + "]" + ChatColor.BOLD + ChatColor.WHITE + " >> ";
    }
    public void commandRegistration() {
        getCommand("wipe").setExecutor(new WipeCommand());
        getCommand("broadcast").setExecutor(new BroadcastCommand());
        getCommand("about").setExecutor(new AboutCommand());
        getCommand("lag").setExecutor(new TPSCommand());
        getCommand("tuversion").setExecutor(new TuVersion());
        getCommand("cc").setExecutor(new ChatClearCommand());

    }

}

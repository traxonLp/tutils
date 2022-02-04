package de.traxonlp.commands;

import de.traxonlp.Main;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class TuVersion implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender.isOp())
        {
            sender.sendMessage(Main.getPrefix() + ChatColor.GOLD + "Plugin Version is " + Main.getVersion());
        }
        else
            {
            sender.sendMessage(Main.getPrefix() + ChatColor.RED + "Dafür hast du keine Rechte!");
            }
        return false;
    }
}

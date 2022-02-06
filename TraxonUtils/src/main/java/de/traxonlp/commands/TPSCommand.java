package de.traxonlp.commands;

import de.traxonlp.Main;
import de.traxonlp.runnable.Lag;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class TPSCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender.isOp())
        {
            sender.sendMessage(ChatColor.GOLD + "----------------------------------------");
            sender.sendMessage(Main.getPrefix() + "The Servers TPS is: " + ChatColor.GREEN + ChatColor.BOLD + Math.round(Lag.getTPS()) + ChatColor.WHITE + " TPS");
            sender.sendMessage(Main.getPrefix() + "Server Performance: " + ChatColor.GREEN + ChatColor.BOLD + Math.round(Lag.getTPS())* 5 + ChatColor.WHITE + " %");
            sender.sendMessage(ChatColor.GOLD + "----------------------------------------");
        }
        else
            {
            sender.sendMessage(Main.getPrefix() + ChatColor.RED + Main.getPermissionError());
            }
        return false;
    }
}

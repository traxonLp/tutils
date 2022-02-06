package de.traxonlp.commands;

import de.traxonlp.Main;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class AboutCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        sender.sendMessage(ChatColor.GOLD + "----------------------------------------");
        sender.sendMessage(ChatColor.GOLD + "|      This Plugin was made by " + Main.getAutor() + ChatColor.GOLD + "      |");
        sender.sendMessage(ChatColor.GOLD + "----------------------------------------");



        return false;
    }
}

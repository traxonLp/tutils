package de.traxonlp.commands;

import de.traxonlp.Main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;
import org.bukkit.entity.Player;

public class ChatClearCommand implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {
        if (sender.isOp())
        {
            int i;
            for (i = 0; i < 100; i++)
            {
                Bukkit.broadcastMessage("");
            }
            sender.sendMessage(Main.getPrefix() +  "The Chat was Cleared!");
        }
        else
            {
            sender.sendMessage(Main.getPrefix() + ChatColor.RED + Main.getPermissionError());
            }

        return false;

    }

}

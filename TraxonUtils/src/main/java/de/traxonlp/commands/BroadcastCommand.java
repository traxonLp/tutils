package de.traxonlp.commands;

import de.traxonlp.Main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class BroadcastCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender.isOp())
        {
            if (args.length >= 1)
            {
                String  msg = "";

                for (int i = 0; i< args.length;i++)
                {
                    msg = msg + args[i] + " ";
                }

                Bukkit.broadcastMessage("");
                Bukkit.broadcastMessage(Main.getPrefix() + ChatColor.BOLD + ChatColor.GREEN + msg.replaceAll("&", "§"));
                Bukkit.broadcastMessage("");

            }
            else {
                sender.sendMessage(Main.getPrefix() + ChatColor.RED + "Meintest du /broadcast ?");


            }

        }
        else sender.sendMessage(Main.getPrefix() + ChatColor.RED + Main.getPermissionError());

        return false;
    }
}

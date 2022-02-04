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
            sender.sendMessage(Main.getPrefix() + "Die Server TPS sind: " + ChatColor.GREEN + Lag.getTPS());
        }
        else
            {
            sender.sendMessage(Main.getPrefix() + ChatColor.RED + "Dafür hast du keine Rechte!");
            }
        return false;
    }
}

package de.traxonlp.commands;
import de.traxonlp.Main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class WipeCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player target;

        if (sender.isOp())
        {
            if (args.length == 0 && !(sender instanceof Player)) {
                sender.sendMessage(Main.getPrefix() + ChatColor.RED + "Please define a Player");
                return true;
            }
            if (args.length == 0) {
                target = (Player) sender;
            }

            else
                {
                target = Bukkit.getServer().getPlayer(args[0]);

                if (target == null)
                {
                    sender.sendMessage(Main.getPrefix() + ChatColor.RED + "The Player" + ChatColor.RED  + args[0] + ChatColor.RED + "wasn't found!");
                    return true;
                }
            }
            target.getEnderChest().clear();
            target.getInventory().clear();
            target.setLevel(0);
            target.sendMessage(Main.getPrefix() + "§aThe Player " + ChatColor.WHITE + sender.getName() +  "§a has wiped your Inventory and Enderchest!");
            target.sendMessage(Main.getPrefix() + "§aYour exp was reset!");
            sender.sendMessage(Main.getPrefix() + "§aThe Player " + ChatColor.WHITE + args[0] + "§a wurde gewiped!");
        }
        else
        {
            sender.sendMessage(Main.getPrefix() + ChatColor.RED + Main.getPermissionError());
        }


        return false;
    }
}

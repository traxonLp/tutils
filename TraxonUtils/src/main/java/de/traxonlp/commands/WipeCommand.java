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
                sender.sendMessage(Main.getPrefix() + "§cDu musst einen Spieler definieren!");
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
                    sender.sendMessage(Main.getPrefix() +"§cDer Spieler " + ChatColor.RED  + args[0] + "§c wurde nicht gefunden!");
                    return true;
                }
            }
            target.getEnderChest().clear();
            target.getInventory().clear();
            target.setLevel(0);
            target.sendMessage(Main.getPrefix() + "§aDer Spieler " + ChatColor.WHITE + sender.getName() +  "§a hat dein Inventar und deine EnderChest gewiped!");
            target.sendMessage(Main.getPrefix() + "§aDeine Erfahrungspunkte wurden auf 0 Gesetzt!");
            sender.sendMessage(Main.getPrefix() + "§aDer Spieler " + ChatColor.WHITE + args[0] + "§a wurde gewiped!");
        }
        else
        {
            sender.sendMessage(Main.getPrefix() + ChatColor.RED + "Dafür hast du keine Rechte!");
        }


        return false;
    }
}

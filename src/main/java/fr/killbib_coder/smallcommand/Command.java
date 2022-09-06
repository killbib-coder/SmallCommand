package fr.killbib_coder.smallcommand;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Command implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, org.bukkit.command.Command cmd, String label, String[] args) {
        if(sender instanceof Player) {
            Player player = (Player) sender;
            if(cmd.getName().equalsIgnoreCase("gm")) {
                if (args.length == 0) {
                    sender.sendMessage("You only typed gm!");
                } else {
                    if (args[0].equalsIgnoreCase("0")) {
                        Bukkit.dispatchCommand(sender, "gamemode "+args[0]);
                    } else if (args[0].equalsIgnoreCase("1")){
                        Bukkit.dispatchCommand(sender, "gamemode "+args[0]);
                    } else if (args[0].equalsIgnoreCase("2")){
                        Bukkit.dispatchCommand(sender, "gamemode "+args[0]);
                    } else if (args[0].equalsIgnoreCase("3")){
                        Bukkit.dispatchCommand(sender, "gamemode "+args[0]);
                    }
                }
            }
            else if(cmd.getName().equalsIgnoreCase("day")) {
                Bukkit.dispatchCommand(sender, "time set day");
            }
            else if(cmd.getName().equalsIgnoreCase("night")) {
                Bukkit.dispatchCommand(sender, "time set night");
            }
            else if(cmd.getName().equalsIgnoreCase("wcl")) {
                Bukkit.dispatchCommand(sender, "weather clear");
            }
            else {
                Bukkit.dispatchCommand(sender, "Wrong Command");
            }

        }

        return false;
    }
}

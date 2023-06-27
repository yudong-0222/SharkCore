package me.dev.yudong.cmds;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class gma implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "Only Player can do this command!");
            return true;
        }
        Player player = (Player) sender;
        if (sender.hasPermission("sharkcore.gma")) {
            if(player.getGameMode() == GameMode.ADVENTURE) {
                player.sendMessage(ChatColor.YELLOW + "你已經是冒險模式了!");
            } else {
                player.setGameMode(GameMode.ADVENTURE);
                player.sendMessage(ChatColor.GREEN + "你已切換至冒險模式");
                return true;
            }
        } else {
            player.sendMessage(ChatColor.RED + "You do not have permission to do this.");
            return true;
        }
        return false;
    }
}

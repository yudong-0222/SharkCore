package me.dev.yudong.cmds;

import me.dev.yudong.core;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class gmc implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "Only Player can do this command!");
            return true;
        }
        Player player = (Player) sender;
        if (sender.hasPermission("sharkcore.gmc")) {
            if(player.getGameMode() == GameMode.CREATIVE) {
                player.sendMessage(ChatColor.YELLOW + "你已經是創造模式了!");
            } else {
                player.setGameMode(GameMode.CREATIVE);
                player.sendMessage(ChatColor.GREEN + "你已切換至創造模式");
                return true;
            }
        } else {
            player.sendMessage(ChatColor.RED + "You do not have permission to do this.");
            return true;
        }
        return false;
    }
}

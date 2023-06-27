package me.dev.yudong.cmds;

import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Map;
import java.util.UUID;

public class day implements CommandExecutor {
    ChatColor ch;
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
        if(!(sender instanceof Player)) {
            sender.sendMessage(ch.RED + "You must be a Player to do this");
            return true;
        }
        Player player = (Player) sender;
        player.setPlayerTime(1000, false);
        player.sendMessage(ch.AQUA + "時間設定成: §e上午");
        return true;
    }
}

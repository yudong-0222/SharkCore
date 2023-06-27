package me.dev.yudong.cmds;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class night implements CommandExecutor {
    ChatColor ch;
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
        if(!(sender instanceof Player)) {
            sender.sendMessage(ch.RED + "You must be a Player to do this");
            return true;
        }
        Player player = (Player) sender;
        player.setPlayerTime(16000, false);
        player.sendMessage(ch.YELLOW + "時間設定成: §b夜晚");
        return true;
    }
}

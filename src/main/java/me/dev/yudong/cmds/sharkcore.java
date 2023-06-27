package me.dev.yudong.cmds;

import me.dev.yudong.core;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class sharkcore implements CommandExecutor {

    ChatColor ch;
    core core;
    public sharkcore(core core) {
        this.core = core;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
        Player player = (Player) sender;
        player.sendMessage(ch.WHITE.toString() + ch.STRIKETHROUGH + "--------------------");
        player.sendMessage(ch.LIGHT_PURPLE + core.getDescription().getName());
        player.sendMessage(ch.AQUA + "Ver: " + core.getDescription().getVersion());
        player.sendMessage(ch.GOLD + core.getDescription().getDescription());
        player.sendMessage(ch.WHITE.toString() + ch.STRIKETHROUGH + "--------------------");
        return true;
    }
}

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
        if (!(sender instanceof Player)) {
            sender.sendMessage(ch.WHITE.toString() + ch.STRIKETHROUGH + "--------------------");
            sender.sendMessage(ch.LIGHT_PURPLE + core.getDescription().getName());
            sender.sendMessage(ch.AQUA + "Ver: " + core.getDescription().getVersion());
            sender.sendMessage(ch.GOLD + core.getDescription().getDescription());
            sender.sendMessage(ch.YELLOW + "/sharkcore help - 查看指令");
            sender.sendMessage(ch.WHITE.toString() + ch.STRIKETHROUGH + "--------------------");
            return true;
        }
        Player player = (Player) sender;
        if (args.length == 0) {
            player.sendMessage(ch.WHITE.toString() + ch.STRIKETHROUGH + "--------------------");
            player.sendMessage(ch.LIGHT_PURPLE + core.getDescription().getName());
            player.sendMessage(ch.AQUA + "Ver: " + core.getDescription().getVersion());
            player.sendMessage(ch.GOLD + core.getDescription().getDescription());
            sender.sendMessage(ch.YELLOW + "/sharkcore help - 查看指令");
            player.sendMessage(ch.WHITE.toString() + ch.STRIKETHROUGH + "--------------------");
        } else if (args.length == 1 && args[0].equalsIgnoreCase("help") && player.hasPermission("sharcore.help")) {
            player.sendMessage(ch.WHITE.toString() + ch.STRIKETHROUGH + "--------------------");
            player.sendMessage(ch.LIGHT_PURPLE + core.getDescription().getName());
            player.sendMessage(ch.AQUA + "Ver: " + core.getDescription().getVersion());
            player.sendMessage(ch.YELLOW + "/day & /night - 切換當前時間");
            player.sendMessage(ch.YELLOW + "/gmc - 創造模式");
            player.sendMessage(ch.YELLOW + "/gms - 生存模式");
            player.sendMessage(ch.YELLOW + "/gma - 冒險模式");
            player.sendMessage(ch.YELLOW + "/gmsp - 觀察者模式");
            player.sendMessage(ch.YELLOW + "/fly - 飛行");
            player.sendMessage(ch.WHITE.toString() + ch.STRIKETHROUGH + "--------------------");
        } else if (!player.hasPermission("sharkcore.help")) {
            player.sendMessage(ch.WHITE.toString() + ch.STRIKETHROUGH + "--------------------");
            player.sendMessage(ch.LIGHT_PURPLE + core.getDescription().getName());
            player.sendMessage(ch.AQUA + "Ver: " + core.getDescription().getVersion());
            player.sendMessage(ch.YELLOW + "/day & /night - 切換當前時間");
            player.sendMessage(ch.WHITE.toString() + ch.STRIKETHROUGH + "--------------------");
        } else {
            player.sendMessage(ch.WHITE.toString() + ch.STRIKETHROUGH + "--------------------");
            player.sendMessage(ch.LIGHT_PURPLE + core.getDescription().getName());
            player.sendMessage(ch.AQUA + "Ver: " + core.getDescription().getVersion());
            player.sendMessage(ch.GOLD + core.getDescription().getDescription());
            sender.sendMessage(ch.YELLOW + "/sharkcore help - 查看指令");
            player.sendMessage(ch.WHITE.toString() + ch.STRIKETHROUGH + "--------------------");
        }
        return true;
     }
}

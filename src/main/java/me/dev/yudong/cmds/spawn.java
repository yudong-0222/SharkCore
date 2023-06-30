package me.dev.yudong.cmds;

import ga.strikepractice.StrikePractice;
import me.dev.yudong.core;
import me.dev.yudong.manager.ConfigManager;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
public class spawn implements CommandExecutor {
    core core;
    ChatColor ch;

    public spawn(core core) {
        this.core = core;
    }
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if (!(sender instanceof Player)) {
            return false;
        }
        Player player = (Player) sender;
        if (StrikePractice.getAPI().isInFight(player)) {
            try {
                sender.sendMessage(core.prefix + "§c對局已經開始.現時無法使用此指令");
            } catch (NullPointerException e) {
                player.sendMessage(core.prefix + "§c對局已經開始.現時無法使用此指令");
            }
        } else {
            Location loc = ConfigManager.getSpawn();
            player.teleport(loc);
        }
        return true;
    }
}

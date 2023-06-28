package me.dev.yudong.cmds;

import com.sun.org.apache.bcel.internal.generic.FADD;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class fly implements CommandExecutor {
    ChatColor ch;
    String prefix = "§7[§8SHARK§7] "; //i am lazy so add prefix here x)
    // all commands will have prefix in the future!
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
        if (!(sender instanceof Player)) {
            return false;
        }
        Player p = (Player) sender;
        if (p.hasPermission("sharkcore.fly")) {
            if (!p.getAllowFlight()) {
                p.setAllowFlight(true);
                p.sendMessage(prefix + ch.GREEN + "飛行已啟用");
            } else {
                p.setAllowFlight(false);
                p.sendMessage(prefix + ch.RED + "飛行已經禁用");
            }
        }
        return true;
    }
}

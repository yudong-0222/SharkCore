package me.dev.yudong;

import me.dev.yudong.cmds.*;
import me.dev.yudong.events.ConnectListener;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class core extends JavaPlugin {

    @Override
    public void onEnable(){
        Bukkit.broadcastMessage(ChatColor.GREEN + "SharkCore Enabled!");
        regCmds();
        regEvent();
    }

    public void regCmds() {
        getCommand("gmc").setExecutor(new gmc());
        getCommand("gma").setExecutor(new gma());
        getCommand("gms").setExecutor(new gms());
        getCommand("gmsp").setExecutor(new gmsp());
        getCommand("day").setExecutor(new day());
        getCommand("night").setExecutor(new night());
        getCommand("sharkcore").setExecutor(new sharkcore(this));
        getCommand("fly").setExecutor(new fly());

    }

    public void regEvent() {
        getServer().getPluginManager().registerEvents(new ConnectListener(this), this);
    }
}

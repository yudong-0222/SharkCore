package me.dev.yudong.manager;

import ga.strikepractice.StrikePractice;
import ga.strikepractice.api.StrikePracticeAPI;
import me.dev.yudong.core;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.configuration.file.FileConfiguration;

import java.util.Objects;

public class ConfigManager {
    private static FileConfiguration config;

    public static void setupConfig (core core) {
        ConfigManager.config = core.getConfig();
        core.saveDefaultConfig();
    }

    public static Location getSpawn() {
        return StrikePractice.getAPI().getSpawnLocation();
    }

}

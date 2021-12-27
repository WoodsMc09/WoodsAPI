package me.woodsmc.woodsapi;

import me.woodsmc.woodsapi.command.WoodsApiCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class WoodsAPI extends JavaPlugin {



    @Override
    public void onEnable() {
        getCommand("woodsapi").setExecutor(new WoodsApiCommand());
    }

    
}

package me.woodsmc.woodsapi.command;

import me.woodsmc.woodsapi.apimanager.ApiManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class WoodsApiCommand implements CommandExecutor {




    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        if(sender instanceof Player){
            Player p = (Player) sender;
            ApiManager.sendActionBar(p, "Hello Person");

        }

        return true;
    }
}

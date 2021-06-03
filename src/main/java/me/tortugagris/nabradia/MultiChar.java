package me.tortugagris.nabradia;

import org.bukkit.plugin.java.JavaPlugin;
import net.md_5.bungee.api.ChatColor;
import me.tortugagris.nabradia.command.ChangeCharacter;
import me.tortugagris.nabradia.command.CreateCharacter;
import me.tortugagris.nabradia.command.CharacterList;

public class MultiChar extends JavaPlugin
{
    public void onEnable() {
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "\n\nMultiChar has been Enabled\n\n");
        // Command register
        this.getCommand("changeCharacter").setExecutor(new ChangeCharacter());
        this.getCommand("createCharacter").setExecutor(new CreateCharacter());
        this.getCommand("characterList").setExecutor(new CharacterList());
    }

    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "\n\nMultiChar has been Disabled\n\n");
    }
}

package me.tortugagris.nabradia.command;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.Command;
import org.bukkit.entity.Player;
import org.bukkit.ChatColor;

public class ChangeCharacter implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            //Change Character
            player.sendMessage(ChatColor.GREEN + "Cambiaste al personaje " + args[0]);
            return true;
        }
        return false;
    }
}
package me.tortugagris.nabradia.command;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.Command;
import org.bukkit.entity.Player;
import org.bukkit.ChatColor;
import me.tortugagris.nabradia.collection.PlayerCharactersArray;
import me.tortugagris.nabradia.object.CharacterSheet;
import java.util.ArrayList;

public class CharacterList implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {

            Player player = (Player) sender;
            //Create Character
            PlayerCharactersArray playerCharactersArray = PlayerCharactersArray.getInstance();
            
            if (playerCharactersArray.inArray(player.getUniqueId())) {
                ArrayList<CharacterSheet> characterArray = playerCharactersArray.getPlayer(player.getUniqueId()).getCharacterArray();
                player.sendMessage("List:");
                for (CharacterSheet character: characterArray) {
                    player.sendMessage(" - " + character.getName());
                }
            } else {
                player.sendMessage(ChatColor.RED + "Ningún personaje encontrado");
            }
            return true;
        }
        return false;
    }
}
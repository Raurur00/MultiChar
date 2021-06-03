package me.tortugagris.nabradia.command;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.Command;
import org.bukkit.entity.Player;
import org.bukkit.ChatColor;
import me.tortugagris.nabradia.collection.PlayerCharactersArray;
import me.tortugagris.nabradia.object.CharacterSheet;
import me.tortugagris.nabradia.object.PlayerCharacters;

public class CreateCharacter implements CommandExecutor {

    private int age;

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length != 4) {
            return false;
        }
        try {
            this.age = Integer.parseInt(args[2]);
        } catch (NumberFormatException nfe) {
            return false;
        }
        if (sender instanceof Player) {

            Player player = (Player) sender;
            //Create Character
            CharacterSheet character = new CharacterSheet(args[0], args[1], this.age, args[3]);
            PlayerCharactersArray playerCharactersArray = PlayerCharactersArray.getInstance();
            
            if (playerCharactersArray.inArray(player.getUniqueId())) {
                playerCharactersArray.getPlayer(player.getUniqueId()).getCharacterArray().add(character);
            } else {
                PlayerCharacters playerCharacters = new PlayerCharacters(player.getUniqueId());
                playerCharacters.getCharacterArray().add(character);
                playerCharactersArray.getPlayerCharactersArray().add(playerCharacters);
            }

            //save character in db
            
            player.sendMessage(ChatColor.GREEN + "Personaje Creado");
            return true;
        }
        return false;
    }
}
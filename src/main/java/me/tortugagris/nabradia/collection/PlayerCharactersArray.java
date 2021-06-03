package me.tortugagris.nabradia.collection;

import me.tortugagris.nabradia.object.PlayerCharacters;
import java.util.UUID;
import java.util.ArrayList;

public class PlayerCharactersArray {
    private ArrayList<PlayerCharacters> playerCharactersArray;

    private static PlayerCharactersArray instance;
    
    private PlayerCharactersArray() {
        playerCharactersArray = new ArrayList<PlayerCharacters>();
    }

    public static PlayerCharactersArray getInstance() {
        if (instance == null) {
            // Initalize Instace
            instance = new PlayerCharactersArray();
        }
        
        return instance;
    }

    public ArrayList<PlayerCharacters> getPlayerCharactersArray() {
        return playerCharactersArray;
    }

    public boolean inArray(UUID playerUUID) {
        for (PlayerCharacters player: playerCharactersArray) {
            if (player.getPlayerUUID() == playerUUID) {
                return true;
            }
        }
        return false;
    }
    
    public PlayerCharacters getPlayer(UUID playerUUID) {
        for (PlayerCharacters player: playerCharactersArray) {
            if (player.getPlayerUUID() == playerUUID) {
                return player;
            }
        }
        return null;
    }
}
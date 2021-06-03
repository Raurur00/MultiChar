package me.tortugagris.nabradia.object;

import me.tortugagris.nabradia.object.CharacterSheet;
import java.util.UUID;
import java.util.ArrayList;

public class PlayerCharacters {
    private UUID playerUUID;
    private ArrayList<CharacterSheet> characterArray;

    public PlayerCharacters(UUID playerUUID) {
        this.playerUUID = playerUUID;
        this.characterArray = new ArrayList<CharacterSheet>();
    }

    public ArrayList<CharacterSheet> getCharacterArray() {
        return characterArray;
    }

    public UUID getPlayerUUID() {
        return playerUUID;
    }
}
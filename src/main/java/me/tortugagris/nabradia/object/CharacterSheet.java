package me.tortugagris.nabradia.object;

public class CharacterSheet {
    private String name;
    private String race;
    private int age;
    private String gender;

    public CharacterSheet(String name, String race, int age, String gender) {
        this.name = name;
        this.race = race;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }

    public String getRace() {
        return this.race;
    }

    public int getAge() {
        return this.age;
    }

    public String getGender() {
        return this.gender;
    }

}
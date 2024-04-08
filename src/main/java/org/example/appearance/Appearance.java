package org.example.appearance;

import java.util.ArrayList;

public class Appearance {
    private final String gender;
    private final String race;
    private final ArrayList<String> height;
    private final ArrayList<String> weight;
    private final String eyeColor;
    private final String hairColor;

    public Appearance(String gender, String race, ArrayList<String> height, ArrayList<String> weight, String eyeColor, String hairColor) {
        this.gender = gender;
        this.race = race;
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
    }

    public String getGender() {
        return gender;
    }

    public String getRace() {
        return race;
    }

    public ArrayList<String> getHeight() {
        return height;
    }

    public ArrayList<String> getWeight() {
        return weight;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    @Override
    public String toString() {
        return "Appearance{" +
                "gender='" + gender + '\'' +
                ", race='" + race + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", eyeColor='" + eyeColor + '\'' +
                ", hairColor='" + hairColor + '\'' +
                '}';
    }
}
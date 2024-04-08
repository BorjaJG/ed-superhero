package org.example.powerstats;

import java.util.ArrayList;

public class Powerstats {

    private final ArrayList<Integer> intelligence;
    private final ArrayList<Integer> strength;
    private final ArrayList<Integer> speed;
    private final ArrayList<Integer> durability;
    private final ArrayList<Integer> power;
    private final ArrayList<Integer> combat;


    public Powerstats(ArrayList<Integer> intelligence, ArrayList<Integer> strength, ArrayList<Integer> speed, ArrayList<Integer> durability, ArrayList<Integer> power, ArrayList<Integer> combat) {
        this.intelligence = intelligence;
        this.strength = strength;
        this.speed = speed;
        this.durability = durability;
        this.power = power;
        this.combat = combat;
    }

    public ArrayList<Integer> getIntelligence() {
        return intelligence;
    }

    public ArrayList<Integer> getStrength() {
        return strength;
    }

    public ArrayList<Integer> getSpeed() {
        return speed;
    }

    public ArrayList<Integer> getDurability() {
        return durability;
    }

    public ArrayList<Integer> getPower() {
        return power;
    }

    public ArrayList<Integer> getCombat() {
        return combat;
    }
}


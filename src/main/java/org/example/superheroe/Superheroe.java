package org.example.superheroe;

import org.example.appearance.Appearance;
import org.example.biography.Biography;
import org.example.powerstats.Powerstats;

public class Superheroe {
    private final String name;
    private final Biography biography;
    private final Appearance appearance;
    private final Powerstats powerstats;

    public Superheroe(String name, Biography biography, Appearance appearance, Powerstats powerstats) {
        this.name = name;
        this.biography = biography;
        this.appearance = appearance;
        this.powerstats = powerstats;
    }

    public String getName() {
        return name;
    }

    public Biography getBiography() {
        return biography;
    }

    public Appearance getAppearance() {
        return appearance;
    }

    public Powerstats getPowerstats() {
        return powerstats;
    }

    @Override
    public String toString() {
        return "Superheroe{" +
                "name='" + name + '\'' +
                ", biography=" + biography +
                ", appearance=" + appearance +
                ", powerstats=" + powerstats +
                '}';
    }
}

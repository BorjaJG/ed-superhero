package org.example.biography;

import java.util.ArrayList;

public class Biography {
    private final String fullName;
    private final String alterEgos;
    private final ArrayList<String> aliases;
    private final String placeOfBirth;
    private final String firstAppearance;
    private final String publisher;
    private final String alignment;


    public Biography(String fullName, String alterEgos, ArrayList<String> aliases, String placeOfBirth, String firstAppearance, String publisher, String alignment) {
        this.fullName = fullName;
        this.alterEgos = alterEgos;
        this.aliases = aliases;
        this.placeOfBirth = placeOfBirth;
        this.firstAppearance = firstAppearance;
        this.publisher = publisher;
        this.alignment = alignment;
    }

    public String getFullName() {
        return fullName;
    }

    public String getAlterEgos() {
        return alterEgos;
    }

    public ArrayList<String> getAliases() {
        return aliases;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public String getFirstAppearance() {
        return firstAppearance;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getAlignment() {
        return alignment;
    }
}

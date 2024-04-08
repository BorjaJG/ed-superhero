package org.example.connection;

public class Connections {
    private final String groupAffiliation;
    private final String relatives;

    public Connections(String groupAffiliation, String relatives) {
        this.groupAffiliation = groupAffiliation;
        this.relatives = relatives;
    }

    public String getGroupAffiliation() {
        return groupAffiliation;
    }

    public String getRelatives() {
        return relatives;
    }
}
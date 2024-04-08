package org.example.work;

public class Work {
    private final String occupation;
    private final String base;

    public Work(String occupation, String base) {
        this.occupation = occupation;
        this.base = base;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getBase() {
        return base;
    }
}
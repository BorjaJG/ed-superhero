package org.example.image;

public class Images {
    private final String thumb;
    private final String small;
    private final String medium;
    private final String large;

    public Images(String thumb, String small, String medium, String large) {
        this.thumb = thumb;
        this.small = small;
        this.medium = medium;
        this.large = large;
    }

    public String getThumb() {
        return thumb;
    }

    public String getSmall() {
        return small;
    }

    public String getMedium() {
        return medium;
    }

    public String getLarge() {
        return large;
    }
}
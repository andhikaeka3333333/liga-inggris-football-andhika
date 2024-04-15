package com.example.ligainggrisandhika.model;

public class ModelTopScore {
    String name,club;
    int image;

    public ModelTopScore(String name, String club, int image) {
        this.name = name;
        this.club = club;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getClub() {
        return club;
    }

    public int getImage() {
        return image;
    }
}

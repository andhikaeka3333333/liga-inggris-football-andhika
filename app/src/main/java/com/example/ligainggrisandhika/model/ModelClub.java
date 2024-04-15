package com.example.ligainggrisandhika.model;

public class ModelClub {
    String name, stadium;
    int image;

    public ModelClub(String name, String stadium, int image) {
        this.name = name;
        this.stadium = stadium;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getStadium() {
        return stadium;
    }

    public int getImage() {
        return image;
    }
}

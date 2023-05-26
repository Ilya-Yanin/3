package com.example.a3;

public class Bird {

    private String name;
    private String birdDescription;
    private int birdRes;

    public Bird(String name, String birdDescription, int birdRes) {
        this.name = name;
        this.birdDescription = birdDescription;
        this.birdRes = birdRes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirdDescription() {
        return birdDescription;
    }

    public void setBirdDescription(String birdDescription) {
        this.birdDescription = birdDescription;
    }

    public int getBirdRes() {
        return birdRes;
    }

    public void setBirdRes(int birdRes) {
        this.birdRes = birdRes;
    }
}
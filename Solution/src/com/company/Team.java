package com.company;

public class Team {
    private String name;
    private Integer accumulatedPoints;

    public Team(String name) {
        this.name = name;
        accumulatedPoints = 0;
    }

    public Team() {
        name = "";
        accumulatedPoints = 0;
    }

    public void hasWon() {
        accumulatedPoints += 3;
    }

    public void hasDrawn() {
        accumulatedPoints += 1;
    }

    @Override
    public String toString() {
        return name;
    }

    public Integer getAccumulatedPoints() {
        return accumulatedPoints;
    }
}

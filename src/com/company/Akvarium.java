package com.company;

import java.util.Arrays;

public class Akvarium {
    private Shark[] sharks;
    private Duck[] ducks;
    private Turtle[] turtles;

    @Override
    public String toString() {
        return "Akvarium{" +
                "\nsharks=" + Arrays.toString(sharks) +
                ", \nducks=" + Arrays.toString(ducks) +
                ", \nturtles=" + Arrays.toString(turtles) +
                '}';
    }

    public Shark[] getSharks() {
        return sharks;
    }

    public void setSharks(Shark[] sharks) {
        this.sharks = sharks;
    }

    public Duck[] getDucks() {
        return ducks;
    }

    public void setDucks(Duck[] ducks) {
        this.ducks = ducks;
    }

    public Turtle[] getTurtles() {
        return turtles;
    }

    public void setTurtles(Turtle[] turtles) {
        this.turtles = turtles;
    }

    public Akvarium(Shark[] sharks, Duck[] ducks, Turtle[] turtles) {
        this.sharks = sharks;
        this.ducks = ducks;
        this.turtles = turtles;
    }
}

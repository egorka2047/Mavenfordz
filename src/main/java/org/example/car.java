package org.example;

public class car {

    String name;
    int speed;
    String ownerName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }
}

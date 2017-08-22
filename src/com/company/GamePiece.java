package com.company;

public class GamePiece {
    String name;
    String color;
    int positionX;
    int positionY;
    boolean frozen;
    int minX;
    int minY;
    int maxX;
    int maxY;


    public GamePiece(String name, String color) {
        this.name = name;
        this.color = color;
        this.positionX = 0;
        this.positionY = 0;
        this.frozen = false;
        this.minX = 100;
        this.minY = 100;
        this.maxX = 100;
        this.maxY = 100;

    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public boolean isFrozen() {
        return frozen;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void moveIfPossible(int x,int y) {
//        if (minX = 100, minY = 200, maxX = 100, maxY = 200)

        if (frozen == false) {
            positionX = x;
            positionY = y;
        }
    }

//    public void setFreeze(boolean freeze) {
//        frozen = freeze;
//    }

    public void freeze() {
        frozen = true;
    }

    public void unFreeze() {
        frozen = false;
    }

    public void describePiece() {
        System.out.println("The " + name + " is " + color + ". " + "The X position is " + positionX + "," + " and the Y position is " + positionY + ". " + "Is the piece frozen? " + frozen + ".");
    }
}

package com.school;

public class Building {
    String name;
    int floors;
    int block;

    public Building(String name, int floors, int block) {
        this.name = name;
        this.floors = floors;
        this.block = block;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }
}


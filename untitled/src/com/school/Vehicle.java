package com.school;

public class Vehicle{
    public Vehicle(String type, int seats, int no_of_vehicle) {
        this.type = type;
        Seats = seats;
        this.no_of_vehicle = no_of_vehicle;
    }

    String type;
    int Seats;
    int no_of_vehicle;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSeats() {
        return Seats;
    }

    public void setSeats(int seats) {
        Seats = seats;
    }

    public int getNo_of_vehicle() {
        return no_of_vehicle;
    }

    public void setNo_of_vehicle(int no_of_vehicle) {
        this.no_of_vehicle = no_of_vehicle;
    }
}




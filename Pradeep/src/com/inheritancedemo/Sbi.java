package com.inheritancedemo;

public class Sbi extends Bank {
    public String place;
    public String state;
    public int Pin_code;

    public Sbi(String place, String state, int pin_code) {
        this.place = place;
        this.state = state;
        Pin_code = pin_code;

    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPin_code() {
        return Pin_code;
    }

    public void setPin_code(int pin_code) {
        Pin_code = pin_code;
    }
}

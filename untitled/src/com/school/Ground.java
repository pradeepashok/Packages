package com.school;

public class Ground {
    String name ;
    String area_name;
    String place;


    public Ground(String name, String area_name, String place) {
        this.name = name;
        this.area_name = area_name;
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea_name() {
        return area_name;
    }

    public void setArea_name(String area_name) {
        this.area_name = area_name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}


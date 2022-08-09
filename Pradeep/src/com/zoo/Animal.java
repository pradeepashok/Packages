package com.zoo;

public class Animal {
    public String name;
    public String type;

    Animal(String name,String type){
        this.name=name;
        this.type = type;
    }

    void pet_animal(){
        System.out.println("dog,cat,cow,goat");
    }
}

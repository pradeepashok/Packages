package com.zoo;

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Animal("Tiger","forest");
        Animal a2 = new Animal("dog","pet");
        Animal a3 = new Animal("Lion","Forest");
        Animal a4 = new Animal("cat","pet");

        System.out.println(a2.type);
        a1.pet_animal();
        System.out.println();
    }
}

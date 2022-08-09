package com.school;

public class Student {
    String name;
    String standed;
    char section;

    public Student(String name, String standed, char section) {
        this.name = name;
        this.standed = standed;
        this.section = section;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStanded() {
        return standed;
    }

    public void setStanded(String standed) {
        this.standed = standed;
    }

    public char getSection() {
        return section;
    }

    public void setSection(char section) {
        this.section = section;
    }
}

package com.nackademinjava;

public class Dog implements MakesNoise {
    private int age;
    private String name;


    // Constructor
    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // Getters & Setters
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Interface
    @Override // annotation
    public void makeNoise() {
        System.out.println(getName() + " Says Bark!");
    }
}

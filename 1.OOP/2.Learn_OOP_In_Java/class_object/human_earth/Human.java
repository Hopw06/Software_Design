package com.company.class_object.human_earth;

public class Human {
    String name;
    int age;
    int height;
    String eyeColor;

    public Human(String name, int age, int height, String eyeColor) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.eyeColor = eyeColor;
    }

    public void speak() {
        System.out.println("I am " + this.name);
        System.out.println("I am " + this.age + " year old");
        System.out.println("I am " + this.height + " inches tall");
        System.out.println("My eye color is " + this.eyeColor);
    }

    public void eat() {
        System.out.println("Eating...");
    }

    public void walk() {
        System.out.println("Walking...");
    }
}
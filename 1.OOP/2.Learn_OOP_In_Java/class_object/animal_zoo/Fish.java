package com.company.class_object.animal_zoo;

public class Fish extends Animal {
    public Fish(int age, String gender, int weightInLbs) {
        super(age, gender, weightInLbs);
        System.out.println("I am a fish");
    }

    @Override
    public void move() {
        System.out.println("Waving tail...");
    }
//    int age;
//    String gender;
//    int weightInLbs;
//
//    public Fish(int age, String gender, int weightInLbs) {
//        this.age = age;
//        this.gender = gender;
//        this.weightInLbs = weightInLbs;
//    }
//
//    public void eat() {
//        System.out.println("Eating...");
//    }
//
//    public void sleep() {
//        System.out.println("Sleeping...");
//    }
    // Duplicate code with Animal class. The better design is make Fish extends Animal

    // special method only Fish has
    public void swim() {
        System.out.println("Swiming...");
    }
}

package com.company.class_object.animal_zoo;

public class Bird extends Animal {

    public Bird(int age, String gender, int weightInLbs) {
        super(age, gender, weightInLbs);
    }

    @Override
    public void move() {
        System.out.println("Flapping wings...");
    }
//    int age;
//    String gender;
//    int weightInLbs;
//
//    public Bird(int age, String gender, int weightInLbs) {
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
    // Duplicate code with Animal class. The better design is make Bird extends Animal

    // special method that only Bird has
//    public void fly() {
//        System.out.println("Flying...");
//    }
}

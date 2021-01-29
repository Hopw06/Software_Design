package com.company.class_object.animal_zoo;

public class Sparrow extends Bird implements Flyable {
    public Sparrow(int age, String gender, int weightInLbs) {
        super(age, gender, weightInLbs);
        System.out.println("I am a Sparrow");
    }

    @Override
    public void fly() {
        System.out.println("Flying...");
    }
}

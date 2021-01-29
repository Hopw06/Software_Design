package com.company.class_object.animal_zoo;


// Chicken is also a bird. But it can not fly. If Chicken extends Bird, default user can call fly() method on Chicken.
// There are two ways to solve this problem:
// + Make Animal as abstract class with move method, remove fly method
// + Using Flyable interface
public class Chicken extends Bird{
    public Chicken(int age, String gender, int weightInLbs) {
        super(age, gender, weightInLbs);
        System.out.println("I am a chicken");
    }
}

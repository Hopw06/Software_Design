package com.company.class_object.animal_zoo;

public class Zoo {
    public static void main(String[] args) {
//        Animal animal = new Animal(2, "F", 30);
//        animal.eat();
//        animal.sleep();

        Chicken chicken = new Chicken(1, "F", 2);
        chicken.eat();
        chicken.sleep();
        chicken.move();

        Sparrow sparrow = new Sparrow(3, "F", 4);
        sparrow.eat();
        sparrow.sleep();
        sparrow.move();
        sparrow.fly();

        Fish fish = new Fish(2, "F", 5);
        fish.eat();
        fish.sleep();
        fish.move();
        fish.swim();
    }
}
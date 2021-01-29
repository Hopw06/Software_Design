package com.company.class_object.human_earth;

public class Earth {
    public static void main(String[] args) {
        Human joe = new Human("Joe", 23, 76, "Blue");
        Human lucy = new Human("Lucy", 24, 68, "Green");

        joe.speak();
        joe.eat();
        joe.walk();

        lucy.speak();
        lucy.eat();
        lucy.walk();
    }
}
package com.company.oop_design.liskov_substitution;

public class MathTeacher extends SchoolStaff implements CourseInstructor{
    @Override
    public void teach() {
        System.out.println("teach math");
    }
}

package com.company.oop_design.liskov_substitution;

/*
    Teacher class is an abstract class contain teach method and other responsibilities of school staff
    such as:
        make announcements
        collect paper work
        conduct Hallway Duties
    But SubstitueTeacher is just a school staff, they do not teach, but have all responsibilities above.
    SubsitueTeacher is not a subtype of Teacher.

    => extract Teacher class to SchoolStaff class and CourseInstructor (contain method teach()).
 */

public abstract class Teacher {

    protected abstract void teach();

    private void makeAnnouncements() {
        System.out.println("make announcements");
    }

    private void collectPaperWork() {
        System.out.println("collect paper work");
    }

    private void conductHallwayDuties() {
        System.out.println("conduct Hallway Duties");
    }

    public void persformOtherResponsibilities() {
        makeAnnouncements();
        collectPaperWork();
        conductHallwayDuties();
    }
}

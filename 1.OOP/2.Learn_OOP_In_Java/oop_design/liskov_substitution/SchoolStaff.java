package com.company.oop_design.liskov_substitution;

public class SchoolStaff {
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

package com.company.oop_design.open_closed_principle;

public class HospitalManagement {

    // Now: HospitalManagement class is simple
    /*
        If other employee is added to system, it only need to extends Employee class and implement function performDuties().
        The original code does not need to change.
     */
    public static void callUpon(Employee emp) {
        emp.performDuties();
    }

    /* The bad design */
    /* Issue with this design:
        1. Object responsibility:
            + There are no behaviors defined in Nurse, Doctor class.
            + Those behavior was put in HospitalManagement class, this class contains all kind of behaviors.
            => behaviors should be define in object.
        2. Violate open_closed principle:
            + If other employees are added to system, we have to add behavior to this class => need modification
            + So after times, this class become to be huge class with all kind of behaviors
            + This class know too much about behavior of objects.
            => implement open_closed principle.
     */
//    public void callUpon(Employee emp) {
//        if (emp instanceof Nurse) {
//            checkVitalSigns();
//            drawBlood();
//            cleanPatienArea();
//        } else if (emp instanceof Doctor) {
//            prescribeMedicine();
//            diagnosePatients();
//        }
//    }
//    // Nurses
//    private void checkVitalSigns() {
//        System.out.println("Checking vitals");
//    }
//
//    private void drawBlood() {
//        System.out.println("drawing blood");
//    }
//
//    private void cleanPatienArea() {
//        System.out.println("cleaning patient area");
//    }
//
//    // Doctors
//    private void prescribeMedicine() {
//        System.out.println("Prescribe Medicine");
//    }
//
//    private void diagnosePatients() {
//        System.out.println("Diagnosing Patient");
//    }
}

package com.company.oop_design.open_closed_principle;

public class EmergencyRoom {

    public static void main(String[] args) {
        Employee peggy = new Nurse("Peggy", "emergency", true);

        HospitalManagement.callUpon(peggy);

        Employee suzan = new Doctor("Suzan", "emergency", true);

        HospitalManagement.callUpon(suzan);
    }
}

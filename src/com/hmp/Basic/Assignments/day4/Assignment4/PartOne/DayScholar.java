package com.hmp.Basic.Assignments.day4.Assignment4.PartOne;

class DayScholar extends Student {
    private String residentialAddress;

    DayScholar(int studentId, char studentType, String studName,
               int semFees, String residentialAddress) {
        super(studentId, studentType, studName, semFees);
        this.residentialAddress = residentialAddress;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.print(" Residential Address: "+ residentialAddress);
    }
}

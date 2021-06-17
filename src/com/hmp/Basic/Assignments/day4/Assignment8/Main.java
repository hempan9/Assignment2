package com.hmp.Basic.Assignments.day4.Assignment8;

public class Main {
    public static void main(String[] args) {
        if (args[0].equals("Hostelite")) {
            Student student = new Hostelite(10, 'F', "Hemanta Pant",
                    2000, "Indrawati", 214);
            student.calculateFees(2000);
            student.displayStudentDetails();
        } else {
            Student scholar = new DayScholar(12, 'M',
                    "Firoj Syangdan", 1200, "3100 Farnswood Lane");
            scholar.calculateFees(1200);
            scholar.displayStudentDetails();
        }
    }
}

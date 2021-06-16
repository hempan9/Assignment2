package com.hmp.Assignments.day4.Assignment3;

public class Main {
    public static void main(String[] args) {
        if (args[0] == "Hostelite") {
            Student student = new Hostelite(10, 'F', "Hemanta Pant",
                    2000, "Indrawati", 214);

            student.displayStudentDetails();
        } else {
            Student scholar = new DayScholar(12, 'M',
                    "Firoj Syangdan", 1200, "3100 Farnswood Lane");
            scholar.displayStudentDetails();
        }


    }
}

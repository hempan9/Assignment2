package com.hmp.Basic.Assignments.day4.Assignment3;

public class Main {
    public static void main(String[] args) {
        String input = args[0];
        if (input.equals("Hostelite")) {
            Student student = new Hostelite(10, 'F', "Hemanta Pant",
                    2000, "Indrawati", 214);
            student.displayStudentDetails();
        }


    }
}

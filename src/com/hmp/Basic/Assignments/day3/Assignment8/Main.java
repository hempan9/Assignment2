package com.hmp.Basic.Assignments.day3.Assignment8;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(11, 'F', "Ramesh", "Pokhrel");
        student.setResidentialStatus("Day Scholar");
        if (student.getResidentialStatus() == "DayScholar") {
            student.calculateFees(2000);
        } else {
            student.calculateFees(5000, 2000);
        }
        System.out.println(student.getStudentType());
        System.out.println(student.getStudentId() + " " + student.getStudentType() + " "
                + student.getResidentialStatus() + " " + student.getStudentName() +
                " " + student.getFeesPerMonth() + " ");
    }

}

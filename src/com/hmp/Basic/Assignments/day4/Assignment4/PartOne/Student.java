package com.hmp.Basic.Assignments.day4.Assignment4.PartOne;

class Student {
    protected int studentId;
    protected char studentType;
    protected String studentName;
    protected int semesterFees;
    protected int feesPerMonth;

    Student(int studentId) {
        this.studentId = studentId;
    }

    Student(int studentId, char studentType, String studName, int semFees) {
        super();
        this.studentType = studentType;
        studentName = studName;
        semesterFees = semFees;
        this.studentId = studentId;

    }

    void displayDetails() {
        System.out.print("Student Id: "+studentId + " " + "Student Type: "
                +studentType + " " +
                "Student Name:"+studentName +"Semester fees " + semesterFees);
    }
}


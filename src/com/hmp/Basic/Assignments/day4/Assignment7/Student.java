package com.hmp.Basic.Assignments.day4.Assignment7;

public class Student {
    int studentId;
    char studentType;
    String studentName;
    final int semesterFees=12000;
     int feesPerMonth;

    public Student() {
        studentId++;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentType(char studentType) {
        this.studentType = studentType;
    }

    public void setStudentName(String fName, String lName) {
        this.studentName = fName + " " + lName;
    }

    public void calculateFees() {
        feesPerMonth = (int) (semesterFees / 6.0);
    }

    public void displayDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Type: " + studentType);
        System.out.println("Student Name: " + studentName);
        System.out.println("Fees per month : " + feesPerMonth);
    }
}

    final class DayScholar extends Student {
    private String residentialAddress;

    public DayScholar() {
    super();
    }

     DayScholar(int id, char type, String name, double fees, String residentialAddress) {
        studentId = id;
        studentType = type;
        studentName = name;
        feesPerMonth = (int) fees;
        this.residentialAddress = residentialAddress;
    }

    public void displayDayDetails() {
        super.displayDetails();
        System.out.println("Residential Address: " + residentialAddress);
    }
}
class Main{
    public static void main(String[] args) {
        DayScholar dayScholar = new DayScholar(5,'F',"Hemanta Pant",
                25000,"No 32/3 Vijayanagar");
        dayScholar.setStudentId(10);
        dayScholar.setStudentName("Saile"," kushuwa");
        dayScholar.setStudentType('R');
        dayScholar.calculateFees();
        dayScholar.displayDayDetails();
    }
}
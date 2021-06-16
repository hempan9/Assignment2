package com.hmp.Assignments.day4.Assignment3;

public class Student {
    protected int studentId;
    protected char studentType;
    protected String studentName;
    protected double feesPerMonth;

    public Student() {

    }

    public Student(int id, char type, String firstName, String lastName) {
        studentId = id;
        studentType = type;
        studentName = firstName + " " + lastName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public char getStudentType() {
        return studentType;
    }

    public void setStudentType(char studentType) {
        this.studentType = studentType;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String fName, String lName) {
        this.studentName = fName + " " + lName;
    }

    public double getFeesPerMonth() {
        return feesPerMonth;
    }

    public void setFeesPerMonth(double feesPerMonth) {
        this.feesPerMonth = feesPerMonth;
    }
    public void displayStudentDetails(){
        System.out.print(getStudentId()+" ");
        System.out.print(getStudentType()+" ");
        System.out.print(getStudentName()+" ");
        System.out.print(getFeesPerMonth()+" ");

    }
}

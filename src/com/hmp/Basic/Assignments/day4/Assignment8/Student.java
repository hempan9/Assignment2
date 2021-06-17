package com.hmp.Basic.Assignments.day4.Assignment8;

abstract class Student {
    protected int studentId;
    protected char studentType;
    protected String studentName;
    protected double feesPerMonth;
    abstract void calculateFees(double semesterFees);
    public Student() {
    studentId++;
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
        System.out.println("Student id: "+getStudentId()+" ");
        System.out.println("Student Type: "+getStudentType()+" ");
        System.out.println("Student Name: "+getStudentName()+" ");
        System.out.println("Monthly fees: "+getFeesPerMonth()+" ");

    }
}

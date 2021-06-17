package com.hmp.Basic.Assignments.day4.Assignment4.PartTwo;

public class CourseRegistration {
    static protected int regId;
    protected String courseName;
    CourseRegistration(){
        regId++;
    }
    CourseRegistration (String cName){
        this();
        courseName = cName;
    }
    public void displayDetails(){
        System.out.println("Registration ID: "+regId);
        System.out.println("Course Name: "+courseName);
    }
}
class Student extends CourseRegistration{
    protected int studentId;
    protected char studentType;
    protected String studentName;
    private int semesterFees;
    private int feesPerMonth;
    Student (int studentId, String cName){
        super(cName);
        this.studentId = studentId;

    }
    Student(int studentId, char studentType, String studName, int semFees, String cName){
        super(cName);
        this.studentId = studentId;
        this.studentType = studentType;
        studentName = studName;
        semesterFees = semFees;
    }
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Student ID: "+studentId+" Student Type: "+studentType+" Student name: "+
                studentName+" Semester fees: "+semesterFees+" ");

    }
}
    class DayScholar extends Student{
        private String residentialAddress;
        DayScholar(int studentId, char studentType, String studName, int semFees,
                   String residentialAddress, String cName){
            super(studentId,studentType,studName,semFees,cName);
        this.residentialAddress = residentialAddress;
        }

         public void displayDetails(){
            super.displayDetails();
                        System.out.println("Residential Address: "+residentialAddress);

            }
        }
        class CourseReg{
            public static void main(String[] args) {
                DayScholar dayScholar = new DayScholar(1001,'D',"Eugene",
                        12000,"No32/68 Vijayanagar","OOP");
                dayScholar.displayDetails();
            }
        }


package com.hmp.Assignments.day4.Assignment4;
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
    }

    void displayDetails() {
        System.out.println(studentId+" "+studentType+" "+studentName+" "+semesterFees);
    }
}
class DayScholar extends Student{
     private String residentialAddress;
     DayScholar(int studentId, char studentType, String studName,
                int semFees, String residentialAddress){
         super(studentId,  studentType,  studName, semFees);
         this.residentialAddress = residentialAddress;
             super.displayDetails();
     }
}
class CourseReg{
    public static void main(String[] args) {
        Student student = new Student(10);
        Student student1 = new Student(1001,'D',
                "Eugene",12000);
        DayScholar dayScholar = new DayScholar(1001,'D',
                "Eugene",12000,
        "No 32/68 Vijayanagar");
        student1.displayDetails();
        dayScholar.displayDetails();
    }
}


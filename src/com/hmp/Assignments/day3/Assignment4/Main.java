package com.hmp.Assignments.day3.Assignment4;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setStudentId(25);
        student.setStudentType('F');
        student.setStudentName("Ram","Rai");
        System.out.print(student.getStudentId()+" ");
        System.out.print(student.getStudentType()+" ");
        System.out.println(student.getStudentName());
        Student student1 = new Student(10,'M',"Sam","Smith");
        System.out.print(student1.getStudentId()+" ");
        System.out.print(student1.getStudentType()+" ");
        System.out.println(student1.getStudentName());    }
}

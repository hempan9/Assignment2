package com.hmp.Basic.Assignments.day4.Assignment1;

public class Main {
    public static void main(String[] args) {
        Hostelite student = new Hostelite(10,'F',"Ramesh","Pant",
                2000,"Mahsimati",214);
        System.out.print(student.getStudentId()+" ");
        System.out.print(student.getStudentType()+" ");
        System.out.print(student.getStudentName()+" ");
        System.out.print(student.getFeesPerMonth()+" ");
        System.out.print(student.getHostelName()+" ");
        System.out.print(student.getRoomNumber()+" ");



    }
}

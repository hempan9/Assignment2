package com.hmp.Assignments.day4.Assignment3;

public class Hostelite extends Student {
    private String hostelName;
    private int roomNumber;



    public Hostelite(){

    }
    public Hostelite(int id, char type, String studentName,double feesPerMonth, String hostelName, int roomNumber){
        studentId = id;
        studentType = type;
        this.studentName =studentName;
        this.hostelName = hostelName;
        this.roomNumber = roomNumber;
    }
    public String getHostelName() {
        return hostelName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }
    public void displayStudentDetails(){
         super.displayStudentDetails();
        System.out.print(getHostelName()+" ");
        System.out.print(getRoomNumber()+" ");
    }

}

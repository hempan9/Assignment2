package com.hmp.Basic.Assignments.day4.Assignment8;

public class Hostelite extends Student {
    private String hostelName;
    private int roomNumber;
    void calculateFees(double semesterFees) {
        feesPerMonth = semesterFees/6.0;
        //Add hostel fees Rs. 1200
        feesPerMonth = feesPerMonth+1200;
    }
    public Hostelite(){
    super();
    }
    public Hostelite(int id, char type, String studentName,double feesPerMonth, String hostelName, int roomNumber){
        studentId = id;
        studentType = type;
        this.studentName =studentName;
        this.hostelName = hostelName;
        this.roomNumber = roomNumber;
        this.feesPerMonth = feesPerMonth;
    }
    public String getHostelName() {
        return hostelName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }
    public void displayStudentDetails(){
         super.displayStudentDetails();
        System.out.println("Hostel name: "+getHostelName()+" ");
        System.out.println("Room number: "+getRoomNumber()+" ");
    }


}

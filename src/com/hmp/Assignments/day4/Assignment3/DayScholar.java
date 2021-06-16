package com.hmp.Assignments.day4.Assignment3;

public class DayScholar extends Student {
    protected String residentialAddress;
public DayScholar(){

}
public DayScholar(int id, char type, String name, double fees, String rAddress ){
    studentId = id;
    studentType = type;
    studentName= name;
    feesPerMonth = fees;
    residentialAddress = rAddress;
}
    public String getResidentialAddress() {
        return residentialAddress;
    }
    public void displayStudentDetails(){
        super.displayStudentDetails();
        System.out.print(getResidentialAddress());
    }
}

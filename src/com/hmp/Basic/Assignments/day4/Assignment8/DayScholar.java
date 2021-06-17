package com.hmp.Basic.Assignments.day4.Assignment8;

public class DayScholar extends Student {
    protected String residentialAddress;

    void calculateFees(double semesterFees) {
        feesPerMonth = semesterFees/6.0;
    }

    public DayScholar(){
super();
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

package com.hmp.Basic.Assignments.day4.Assignment6;

public class Student {
    protected int studentID;
    protected char studentType;
    protected String studentName;

    public void setStudentID(int sId) {
        this.studentID = sId;
    }

    public void setStudentType(char sType) {
        this.studentType = sType;
    }

    public void setStudentName(String sName) {
        this.studentName = sName;
    }

    public void getDetails() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Type: " + studentType);
    }
}

class DayScholar extends Student {
    private String residentialAddress;

    public void setResidentialAddress(String resAddress) {
        this.residentialAddress = resAddress;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Student Name: " + studentName);
        System.out.println("Residential Address: " + residentialAddress);
    }
}

class DyanamicsEx {
    public static void main(String[] args) {
        Student dayscholar;
        dayscholar= new DayScholar();
        dayscholar.setStudentID(1001);
        dayscholar.setStudentType('D');
        dayscholar.setStudentName("Thomas");
        ((DayScholar) dayscholar).setResidentialAddress("HanumanThan"); //downcasting
        dayscholar.getDetails();
    }
}
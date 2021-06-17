package com.hmp.Basic.Assignments.day5.Assignment2.registrationpack;

import com.hmp.Basic.Assignments.day5.Assignment2.studentpack.Student;

public class DayScholar extends Student {
    private String residentialAddress;

    public void setResidentialAddress(String residentialAddress) {
        this.residentialAddress = residentialAddress;
    }
    public void getDetails(){
       System.out.println("Student Id: "+studentId);
        System.out.println("Student Type: "+studentType);
        System.out.println("Student Name: "+studentName);
    }
}
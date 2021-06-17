package com.hmp.Basic.Assignments.day5.Assignment2;

import com.hmp.Basic.Assignments.day5.Assignment2.registrationpack.DayScholar;

class Registeration {
    public static void main(String[] args) {
        DayScholar dayScholar = new DayScholar();
        dayScholar.setStudentId(1001);
        dayScholar.setStudentType('D');
        dayScholar.setStudentName("Dinil");
        dayScholar.getDetails();
    }
}

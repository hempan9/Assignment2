package com.hmp.AdvanceLabs.Assignment27;

import com.hmp.AdvanceLabs.Assignment22.Employee;

import java.util.Calendar;

public class EmployeeBeans {
    int employeeId;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Calendar getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Calendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    String employeeName;
    Calendar dateOfBirth;

    public static void main(String[] args) {
        EmployeeBeans employeeBeans = new EmployeeBeans();
    }
}
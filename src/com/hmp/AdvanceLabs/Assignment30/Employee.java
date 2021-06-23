package com.hmp.AdvanceLabs.Assignment30;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employee {
    int employeeId;
    String employeeName;
    String dateOfBirth;

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

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
public String toString(){
        return employeeName +" " + employeeId+" "+ dateOfBirth;
}

}
class EmployeeInfo{
    public static void main(String[] args) {
        //To-Do : create four employee objects
        //To-Do : store the objects in the ArrayList
        //To-Do : retrieve the employee objects from the list using iterator and display their information
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();
        employee1.employeeId =1001;
        employee1.employeeName= "Sam";
        employee1.setDateOfBirth("1997-07-14");
        employee2.employeeId =1002;
        employee2.employeeName= "Ram";
        employee2.setDateOfBirth("1974-07-14");
        employee3.employeeId =1003;
        employee3.employeeName= "Lax";
        employee3.setDateOfBirth("1984-02-01");
        employee4.employeeId =1004;
        employee4.employeeName= "Fox";
        employee4.setDateOfBirth("1990-08-20");
        List list=new ArrayList();
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        list.add(employee4);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Object elm = iterator.next();
            System.out.println(elm.toString());
        }
    }

}
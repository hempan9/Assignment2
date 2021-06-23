package com.hmp.AdvanceLabs.Assignment31;

import java.util.ArrayList;

public class EmployeeInfo {
    public static void main(String[] args) {
        ArrayList<Integer>employeeId = new ArrayList<Integer>();
        employeeId.add(1001);
        employeeId.add(1002);
        employeeId.add(1003);
        for (int count = 0; count < employeeId.size(); count++) {
            // To-do: retrieve & display the value
            // To-do: stored in int variable
            int val = employeeId.get(count);
            System.out.println(val);

        }

    }
}

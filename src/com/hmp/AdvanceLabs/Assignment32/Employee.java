package com.hmp.AdvanceLabs.Assignment32;
import java.util.Vector;
public class Employee {
    public static void main(String[] args) {
        Vector emplist = new Vector();
        int empNO= 1000;
        for (int count = 0; count < 5; count++) {
            empNO++;
            emplist.add((empNO));
        }
        System.out.println(emplist);
    }
}

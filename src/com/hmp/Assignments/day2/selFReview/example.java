package com.hmp.Assignments.day2.selFReview;

public class example {
    public static void main(String[] args) {
        int intValOne = 0;
        int intValTwo = 0;
        for (short index = 0; index < 5; index++) {
            if ((++intValOne > 2) || (++intValTwo > 2)) {
                intValOne++;

            }
        }
        System.out.println(intValOne + " " + intValTwo);

    }


}

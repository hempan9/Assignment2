package com.hmp.Assignments.day3.Assignment6;

public class cmdLine {
    public static void main(String[] args) {
        int number, iterations;
        number = Integer.parseInt(args[0]);
        iterations = Integer.parseInt(args[1]);
        for (int i = 1; i <= iterations; i++) {
            System.out.printf("%d\t*\t%d\t=\t%d\n",number,i,number*i);
        }
    }
}

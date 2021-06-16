package com.hmp.Assignments.day3.Assignment5;

import java.util.Scanner;

public class JavaDoc {
   static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter your name?");
        String name = s.nextLine();
        System.out.println("The length of the string is: "+name.length());
        System.out.println("Hi "+name);
        System.out.println("Your name in Lower case:  "+name.toLowerCase());
        System.out.println("Your name in Upper case:  "+name.toUpperCase());
        System.out.println("Starts with \"a\": "+name.startsWith("a"));

        System.out.println("Replaced string: "+name.replace(name,"Krishna"));

    }
}

package com.hmp.AdvanceLabs.Assignment32;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestReflection {
    public static void main(String[] args) throws IOException, InterruptedException {
        //To-Do : write code to collect the method information- name and parameters
        // To-Do : write code to collect field information -access specifiers and data types

        try {
            Class classObj = Class.forName("com.hmp.AdvanceLabs.Assignment32.Employee");
            System.out.println(classObj.getName());
            Field[] fields;
            fields = classObj.getFields();
            System.out.println("======================");
            System.out.println("Fields");

            for (Field f :
                    fields) {
                System.out.println(f);

            }
            System.out.println("======================");
            System.out.println("Methods");
            Method[] methods = classObj.getMethods();
            for (Method m : methods) {
                System.out.println(m);

            }
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        }
    }
}

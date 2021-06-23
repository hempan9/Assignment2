package com.hmp.AdvanceLabs.Assignment32;
import java.lang.reflect.*;

public class TestReflection {
    public static void main(String[] args) throws ClassNotFoundException {
        //To-Do : write code to collect the method information- name and parameters
        // To-Do : write code to collect field information -access specifiers and data types
       try{
        Class classObj = Class.forName("Employee.class");
           System.out.println(classObj.getName());
           System.out.println(Modifier.toString(classObj.getModifiers()));
       }catch (ClassNotFoundException e){
           e.printStackTrace();
       }
    }
}

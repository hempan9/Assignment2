package com.hmp.AdvanceLabs.Assignment32;
import java.lang.reflect.*;
import java.util.Arrays;

public class TestReflection {
    public static void main(String[] args) throws ClassNotFoundException {
       try{
        Class classObj = Class.forName("com.hmp.AdvanceLabs.Assignment32.Employee");
           System.out.println(classObj.getName());
           System.out.println(Modifier.toString(classObj.getModifiers()));
       }catch (ClassNotFoundException e){
           e.printStackTrace();
       }
    }
}

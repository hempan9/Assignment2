package com.hmp.AdvanceLabs.Assignment25;

public class ExceptionDemo {
    static {
        System.out.println("In the static block of Exception..");
    }
}
class checkeExceptionDemo{
    public static void main(String[] args) {
        try{
        Class.forName("ExceptionDemo");
    }catch (ClassNotFoundException e){
            System.out.println("Exception: "+e);
        }
    }
}
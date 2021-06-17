package com.hmp.Basic.Assignments.day5.Assignment3;

 interface InnerOne {
    int varOne=20; // we must intitlize varibale
     int varTwo = 100;
    void methodOne();
    void methodTwo();
}
class Example implements InnerOne{
    public void methodOne() {
        //varTwo = varTwo+10;  // we cannott change the value of variable in implementationof any interfce it is set to final by default
        System.out.println("Value of varTeo: "+varTwo);
        System.out.println("Good Morning");
    }
    public void methodTwo(){
        System.out.println("Good Afternoon");
    }
}
class DemoInterface{
    public static void main(String[] args) {
        Example obj = new Example();
        obj.methodOne();;
        obj.methodTwo();
    }
}
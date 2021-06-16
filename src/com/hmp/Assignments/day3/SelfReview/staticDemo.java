package com.hmp.Assignments.day3.SelfReview;

public class staticDemo {
    static int count =10;
    staticDemo(){
        count++;
    }
    static void display(){
        System.out.println(count);
    }
    static {
        System.out.println("Static block written Before Main");
    }

    public static void main(String[] args) {
        staticDemo t1 = new staticDemo();
        staticDemo t2 = new staticDemo();
        staticDemo.display();
        t2.display();

    }
    static{
        System.out.println("Static block writtem after Main");
    }

}

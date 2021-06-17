package com.hmp.Basic.Assignments.day4.SelfReview.Example4;

public class Parent {
    private int num;

    Parent(int num) {
        this.num = num;

    }

    public int getNum() {
        return num;
    }
}

class Child extends Parent {
    private int val;

    Child(int num, int val) {
        //To invoke superclass constructor
        super(num);
        this.val = val;
    }

    public int getVal() {
        return val;
    }
}

class CourseMgmt {
    public static void main(String[] args) {
        Child child = new Child(100, 200);
        System.out.println("Parent: num: " + child.getNum());
        System.out.println("Child: Val: " + child.getVal());
    }
}
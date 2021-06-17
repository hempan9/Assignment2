package com.hmp.Basic.Assignments.day5.SelfReview.Assignment2;

public interface Count {
    short counter = 0;
    void countUp();

}
 class TestCount implements Count{
    public static void main(String[] args) {
        TestCount test = new TestCount();
        test.countUp();
    }
/*
    @Override
    public void countUp() {
        for (int x = 0; x > counter; x--,++counter {
            System.out.println(counter);
        }
    }*/
@Override
public void countUp() {
    for (int x = 10; x > counter; x--) {
        System.out.println(x);
    }
}
}
/*
output will be error because variable defined inside interface
are static, public and final by default.
 */
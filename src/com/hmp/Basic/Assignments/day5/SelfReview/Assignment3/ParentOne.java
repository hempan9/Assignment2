package com.hmp.Basic.Assignments.day5.SelfReview.Assignment3;

public interface ParentOne {
    int pOne =1;
    void printParentOne();

}
interface ParentTwo{
    int pTwo = 2;
    void printParentTwo();

}
interface Child extends ParentOne, ParentTwo{
    int child = 3;
    void printChild();
}
class InheritClass implements Child{

    @Override
    public void printParentOne() {
        System.out.println(pOne);
    }

    @Override
    public void printParentTwo() {
        System.out.println(pTwo);
    }

    @Override
    public void printChild() {
        System.out.println(child);
    }
}
class testInterface{
    public static void main(String[] args) {
        InheritClass inheritClass = new InheritClass();
        inheritClass.printParentOne();
        inheritClass.printParentTwo();
        inheritClass.printChild();
    }
}
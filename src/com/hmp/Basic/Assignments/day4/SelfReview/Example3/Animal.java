package com.hmp.Basic.Assignments.day4.SelfReview.Example3;

public class Animal {
    public static void testClassMethod() {
        System.out.println("The class method in Animal");
    }
    public void testInstanceMethod(){
        System.out.println("The instance method in Animal");
    }
}
class Cat extends Animal{
    public static void testClassMethod(){
        System.out.println("This class in cat");
    }
    public void testInstanceMethod(){
        System.out.println("The instance method in Cat");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        Animal myAnimal = cat;
        Animal.testClassMethod();
        myAnimal.testInstanceMethod();
    }
}
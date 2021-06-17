package com.hmp.Basic.Assignments.day5.SelfReview.Assignment1;

abstract class Animal {
    abstract  void testClassMethod();
    public static void testInstanceMethod(){
        System.out.println("The Instance method in Animal");
    }

}
class Cat extends Animal{
    public   void testClassMethod(){
        System.out.println("The class method in cat");
    }

    public static void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }

    public static void main(String[] args) {
        Cat myCat = new Cat();
        Animal myAnimal = myCat;
        Animal.testInstanceMethod();
        myAnimal.testClassMethod();
    }
}
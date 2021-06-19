package com.hmp.AdvanceLabs.Assignment18;
interface PetAnimal{
    public void friend();
    public void plays();
}
public class Animal {
        String name;
        int age;
        char gender;

public Animal(String name,int age,char gender){
    this.name = name;
    this.age=age;
    this.gender=gender;
}

}
class Hipps extends Animal{

    public Hipps(String name, int age, char gender) {
        super(name, age, gender);
    }
    public void displayInfo(){
        System.out.println("Animal: "+name);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
    }
}
class dog extends Animal implements PetAnimal{

    public dog(String name, int age, char gender) {
        super(name, age, gender);
    }
    @Override
    public void friend() {
        System.out.println("This dog is friendly.");
    }

    @Override
    public void plays() {
        System.out.println("dog also likes to play.");
    }
    public void displayInfo(){
        System.out.println("Animal: "+name);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
    }
}
class cat extends Animal implements PetAnimal{

    public cat(String name, int age, char gender) {
        super(name, age, gender);
    }
    @Override
    public void friend() {
        System.out.println("This animal is friendly. Plays like a baby");
    }

    @Override
    public void plays() {
        System.out.println("It also likes to play. Meow..Meow");
    }
    public void displayInfo(){
        System.out.println("Animal: "+name);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
    }
}
class Main{
    public static void main(String[] args) {
        Hipps hoipps = new Hipps("Heppo",2,'M');
        hoipps.displayInfo();
        dog dog = new dog("Puppy",3,'F');
        dog.friend(); dog.plays(); dog.displayInfo();
        cat cat = new cat("Utsab",4,'M');
        cat.friend(); cat.plays();cat.displayInfo();
    }
}
package Inheritance;

//Write a Java program to create a class called Animal with a method called makeSound(). Create a subclass called Cat that overrides the makeSound() method to bark.

class Animal{
    void makeSound(){
        System.out.println("MAKE A SOUND");
    }
}
 class Cat extends Animal {
    Cat(){
        super.makeSound(); // calling parent class method
    }
    @Override
     void makeSound(){
        System.out.println("Bark");
    }
 }
public class Question1 {
    public static void main(String[] args) {


    }

}

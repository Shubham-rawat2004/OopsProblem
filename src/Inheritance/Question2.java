package Inheritance;

//Write a Java program to create a class called Vehicle with a method called drive(). Create a subclass called Car that overrides the drive() method to print "Repairing a car".

 class Vechile{
     Vechile(){
         System.out.println("Vechile");
     }
 void drive(){
     System.out.println("Driving car ");
 }
}
class Car extends Vechile {
     Car(){
         super(); // calling parent class constructor
         super.drive();

     }
     @Override

    void drive(){
         System.out.println("Repairing a car");
     }
}
public class Question2 {
}

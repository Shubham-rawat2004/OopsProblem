package Abstraction;
//Write a Java program to create an abstract class Vehicle with abstract methods startEngine() and stopEngine().
// Create subclasses Car and Motorcycle that extend the Vehicle class and implement the respective methods to start and stop the engines for each vehicle type.
abstract  class Vechile {
    abstract void startEngine();
    abstract void stopEngine();
}
class Car extends Vechile{
    @Override
    void startEngine(){
        System.out.println("Engine gets  started as soon as key is pressed ");
    }
    void stopEngine(){
        System.out.println("Engine gets stopped as soon as key is locked ");
    }
}
class Motorcycle extends Vechile{
    @Override
    void startEngine(){
        System.out.println("Engine can be started through kick or through self-start");
    }
    void  stopEngine(){
        System.out.println("Engine gets stopped as soon as power gets disconnected");
    }
}
public class Question6 {
    public static void main(String[] args) {
        Vechile v=new Motorcycle(); // RUNTIME POLYMORPHISM OR DYNAMIC METHOD DISPATCH
        v.startEngine();
        v.stopEngine();
    }
}

package Interface;

//Write a Java program to create an interface Flyable with a method called fly_obj().
// Create three classes Spacecraft, Airplane, and Helicopter that implement the Flyable interface.
// Implement the fly_obj() method for each of the three classes.

interface Flyable {
    void fly_obj();
}
 class  SpaceCraft implements Flyable{
    @Override
  public  void fly_obj(){
        System.out.println("Spacecraft travelling in space");
    }
 }
 class Airplane implements Flyable {
     @Override
     public void fly_obj() {
         System.out.println("Airplane taking off");
     }
 }
     class Helicopter   implements Flyable {
     @Override
     public  void fly_obj(){
         System.out.println("Helicopter is  taking off");
     }
     }
public class Question3 {
    public static void main(String[] args) {
        Flyable f1=new Airplane();
        f1.fly_obj();
        Flyable f2=new Helicopter();
        f2.fly_obj();
    }
}

package Inheritance;
//Write a Java program to create a vehicle class hierarchy. The base class should be Vehicle, with subclasses Truck, Car and Motorcycle. Each subclass should have properties such as make, model, year, and fuel type. Implement methods for calculating fuel efficiency, distance traveled, and maximum speed.

  class   Vechiles {
     String model;
     int year;
     String  fuel_type;
   protected   int mileage;

     public void fuelEfficiency(){
     }
     public void   distance(){
     }
     public void maxSpeed(){
     }
  }
   class Truck extends Vechiles {
      Truck(){
          model="T1";
          year=2014;
          fuel_type="Petrol";
          mileage=40; // base class me protected use karne se directly accessible ho gya attribute without using super keyword
      }
   private  float distance=3.4f;

 private int maxSpeed=120;

@Override
public void fuelEfficiency(){
    System.out.println(mileage);
}
@Override
public void   distance(){
    System.out.println("Distance travelled is "+distance);
}
@Override
public void maxSpeed(){
    System.out.println("MaxSpeed of Truck is "+maxSpeed );
}
 }

// class Cars extends  Vechiles{
//
// }
// class Motorcycle extends Vechiles{
//
// }
public class Question9 {
    public static void main(String[] args) {
        Truck t=new Truck();
        t.fuelEfficiency();
        t.distance();
        t.maxSpeed();
    }
}

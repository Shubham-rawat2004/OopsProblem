package Abstraction;
//  Write a Java program to create an abstract class GeometricShape with abstract methods area() and perimeter().
//  Create subclasses Triangle and Square that extend the GeometricShape class
//  and implement the respective methods to calculate the area and perimeter of each shape.
 abstract class  GeometricShape {
     protected int area;
    abstract double perimeter();
}
class Triangle extends GeometricShape{
     private double base=4;
     private double height=5;
     @Override
    double perimeter(){
         return (1/2*base*height);
     }
}
class  Square extends GeometricShape{
     private double side=7;
     @Override
    double perimeter(){
         return 4*side;
     }
}
public class Question7 {
    public static void main(String[] args) {
        GeometricShape GP1 = new Triangle();
        GeometricShape GP2 = new Triangle();
      double perimeter1=GP1.perimeter();
        System.out.println(perimeter1);
       double perimeter2= GP2.perimeter();
        System.out.println(perimeter2);
    }
}
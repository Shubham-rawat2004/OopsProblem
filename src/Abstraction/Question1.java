package Abstraction;
//Write a Java program to create an abstract class Shape with abstract methods calculateArea()
// and calculatePerimeter(). Create subclasses Circle and Triangle that extend the Shape class and
// implement the respective methods to calculate the area and perimeter of each shape.


abstract  class Shape{
    abstract double  calculateArea(double radius);
    abstract double calculatePerimeter(float rad);
    }
    class Circle extends Shape{
    @Override
    double  calculateArea(double radius){
        return  3.14*radius*radius;
    }
    double calculatePerimeter(float radius){
         return 2*3.14 *radius;
    }
    }
public class Question1 {
    public static void main(String[] args) {
  Circle c=new Circle();
 double area=  c.calculateArea(4);
        System.out.println("Area of circle with given radius is "+area );
  c.calculatePerimeter(5);
    }
}

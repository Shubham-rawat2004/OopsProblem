package Interface;
 //  Write a Java program to create an interface Shape with the getArea() method.
//   Create three classes Rectangle, Circle, and Triangle that implement the Shape interface.
//   Implement the getArea() method for each of the three classes.

//All variables in interfaces are implicitly:
//public
//static
//final
interface Shape{
//    int length=5;
//    length=4;  cannot reassign as all variables are implicitly public static final
  public  double getArea();
}
 class  Rectangle  implements Shape {
     private double length=4;
     private  double breadth=5;

//     public double getLength() {  WITHIN THE CLASS WE DON'T NEED TO CREATE GETTER  AND SETTER AS THEY ARE ACCESIBLE INSIDE THE SAME CLASS IN WHICH THEY ARE DEFINED
//         return length;
//     }
//     public void setLength(double length) {
//         this.length = length;
//     }
//     public double getBreadth() {
//         return breadth;
//     }
//     public void setBreadth(double breadth) {
//         this.breadth = breadth;
//     }
   public   double getArea(){
        return length*breadth;
    }
 }
 class  Circle implements Shape{
    private double radius=3.5;
    @Override
    public  double getArea(){
        return 3.14*Math.pow(radius,2);
    }
 }
 class Triangle implements Shape{
    private double base=2;
    private  double height=4;
    @Override
     public double getArea(){
        return (1/2*base*height);
    }
 }
public class Question1 {
    public static void main(String[] args) {
  Shape p=new Circle();
  p.getArea();
  Shape p2=new Rectangle();
System.out.println(p2.getArea());
Shape p3=new Triangle();
    System.out.println(p3.getArea());
    }
}
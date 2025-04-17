package Encapsulation;
//. Write a Java program to create a class called Rectangle with private instance variables length and width. Provide public getter and setter methods to access and modify these variables.

class  Rectangle{
  private double length;
    private double breadth;

    Rectangle(double length,double breadth){ // assigning value to variables but not accessible as they are private so requiring getter and setter method
        this.length=length;
        this.breadth=breadth;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }
}
public class Question3 {
    public static void main(String[] args) {
        Rectangle r=new Rectangle(23.4,56.44);
           r.setBreadth(23.9);
           r.setLength(45.6);
        System.out.println(r.getBreadth());
        System.out.println(r.getLength());
    }
}

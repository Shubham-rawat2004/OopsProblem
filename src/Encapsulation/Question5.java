package Encapsulation;
//Write a Java program to create a class called Circle with a private instance variable radius. Provide public getter and setter methods to access and modify the radius variable. However, provide two methods called calculateArea() and calculatePerimeter() that return the calculated area and perimeter based on the current radius value.
class  Circle {
    private float radius;

    Circle(float radius){ // if we don't create getter and setter then constructor vlaue is taken
       this.radius=radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
    public  float calculateArea(float radius){
        float area=3.14f*radius*radius; // we don't need to pass the radius since it's get stored inside object
        return area;
    }
    public float calculatePerimeter(float radius){
        float perimeter= 2*3.14f*radius;
        return perimeter;
    }
}
public class Question5 {
    public static void main(String[] args) {
        Circle c=new Circle(7.22f);
        c.setRadius(4);
      float cArea=  c.calculateArea(c.getRadius());
        System.out.println(cArea);

        float cPerimeter=c.calculatePerimeter(c.getRadius());
        System.out.println(cPerimeter);

    }
}

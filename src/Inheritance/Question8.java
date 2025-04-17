package Inheritance;

class Shapes {
    public float getArea() {
        return 0;
    }
    public float getPerimeter() {
        return 0;
    }
}

class Circle extends Shapes {
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public float getArea() {
        return (float) (Math.PI * radius * radius);
    }

    @Override
    public float getPerimeter() {
        {
            return (float) (2 * Math.PI * radius);
        }
    }
}
      public class Question8 {
      public static void main(String[] args) {
        Circle c = new Circle(4.0f);
        System.out.println("Area of Circle: " + c.getArea());
        System.out.println("Perimeter of Circle: " + c.getPerimeter());
    }
}


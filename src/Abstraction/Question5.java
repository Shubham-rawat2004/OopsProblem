package Abstraction;
//Write a Java program to create an abstract class Shape3D with abstract methods calculateVolume() and calculateSurfaceArea().
// Create subclasses Sphere and Cube that extend the Shape3D class and implement the respective methods to calculate the volume and surface area of each shape.
 abstract class Shape3D {
    abstract float calculateVolume();
    abstract float surfaceArea();
}
class  Sphere extends Shape3D {
     private float radius;


   public float getRadius(){  // getters  and setters to access and modify private variables or attributes
       return radius;
   }
   public  void setRadius(float radius){
       this.radius=radius;
   }
    @Override
    float calculateVolume(){
         return (float) (4/3*3.14* Math.pow(radius,3));
     }
  @Override
 float surfaceArea(){
    return (float) (4/3*3.14* Math.pow(radius,2));
 }
 }

 class Cube extends  Shape3D{
      float side=4;
     @Override
     float calculateVolume(){
          return (float) (4*Math.pow(side,3));
     }
     @Override
     float surfaceArea(){
         return (4*side*side);
     }
 }
public class Question5 {
    public static void main(String[] args) {
        Sphere sp=new Sphere();
        sp.setRadius(3);
        float vol= sp.calculateVolume();
        System.out.println(vol);
        float area=sp.surfaceArea();
        System.out.println(area);
        Cube c=new Cube();
         float res=c.calculateVolume();
        System.out.println(res);
        float areas=c.surfaceArea();
        System.out.println(areas);
    }
    }

package Abstraction;
// Write a Java program to create an abstract class Animal with abstract methods eat() and sleep().
// Create subclasses Lion, Tiger, and Deer that extend the Animal class and implement the eat() and sleep()
// methods differently based on their specific behavior.
abstract class Animal{
    abstract void eat();
    abstract void sleep();
}
class Lion extends Animal{
    @Override
    void eat(){
        System.out.println("Lion eats flesh ");
    }
    @Override
    void sleep(){
        System.out.println("Lion sleeps in deep sleep");
    }
}
class Tiger extends Animal{
    @Override
    void eat(){
        System.out.println("Tiger eats flesh ");
    }
    @Override
    void sleep(){
        System.out.println("Tiger sleeps in deep sleep");
    }
}
class Deer extends Animal{
    @Override
    void eat(){
        System.out.println("Deer  eats grass");
    }
    @Override
    void sleep(){
        System.out.println("Deer is sleeping in deep sleep");
    }
}
public class Question3 {
    public static void main(String[] args) {
//        Animal a=new Animal(); // animal class is abstracted cannot create object of it because it is incomplete by design
   Deer d=new Deer();
   d.eat();
   d.sleep();
    }
}

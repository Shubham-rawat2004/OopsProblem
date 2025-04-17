package polymorphism;
//Write a Java program to create a base class Animal (Animal Family) with a method called Sound().
// Create two subclasses Bird and Cat. Override the Sound() method in each subclass
// to make a specific sound for each animal.

class  Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}
  class Bird extends Animal{
        @Override
        void sound(){
            System.out.println("Birds are chirping");
        }
    }
  class Cat extends Animal{
        @Override
        void sound(){
            System.out.println("Cats voice is mi-a-oou");
        }
    }
public class Question1 {
    public static void main(String[] args) {
        Animal b=new Bird(); //dynamic method dispatch decide at runtime which method to execute.Also called as run time polymorphism .what can be used depends on reference variable and
       b.sound();               // who will use will be dependent on object type
    }
}

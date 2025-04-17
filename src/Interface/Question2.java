package Interface;
//Write a Java program to create an Animal interface with a method called bark() that takes no arguments
// and returns void. Create a Dog class that implements Animal and overrides speak() to print "Dog is barking".

interface Animal {
    void bark(); // here by default it is public because every method is public
}
class Dog implements Animal{
    @Override
    public   void bark(){ // here it is default implictly so we need to explicitly make it public
        System.out.println("Dog is barking");
    }
}
public class Question2 {
    public static void main(String[] args) {
        Animal d=new Dog();
        d.bark();
    }
}

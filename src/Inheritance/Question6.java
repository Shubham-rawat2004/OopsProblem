package Inheritance;

//Write a Java program to create a class called Animal with a method named move(). Create a subclass called Cheetah that overrides the move() method to run

 class Animals{
    void move(){
        System.out.println("Animal is moving");
    }

}
class Cheetah extends Animals {
    @Override
    void move() {
        System.out.println("Cheetah runs very fast ");
    }

    public class Question6 {
        public static void main(String[] args) {
            Animal genericAnimal = new Animal();
//        genericAnimal.move();// Output: Animal is moving

            Cheetah c = new Cheetah();
            c.move(); // Output: Cheetah runs very fast!
        }

    }
}

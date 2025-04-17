package Inheritance;

//Write a Java program to create a class called Employee with methods called work() and getSalary(). Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee().

class Employee {
    int salary=100000;
    Employee(){

    }
    void work(){
        System.out.println("Doing work ");
    }
    int getSalary(int salary){
        this.salary=salary;
        return 0;
    }
}
class HRManager extends Employee{
    int salary=10000; // field hiding

//    HRManager(int salary){ // this need to be created explicitly in child class to avoid error as parent class  contains no-default constructo
//        super(20000);
//    }
    @Override
    void work(){
        System.out.println("MIND YOUR WORK");
    }
    void addEmployee(){
        System.out.println("Adding a new Employee");
    }
}
public class Question4 {
    public static void main(String[] args) {

    }
}

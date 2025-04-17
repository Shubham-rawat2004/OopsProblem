package Abstraction;
//   Write a Java program to create an abstract class Employee with abstract methods calculateSalary() and displayInfo().
//   Create subclasses Manager and Programmer that extend the Employee class and implement the respective methods to calculate salary and display information for each role.

 abstract class Employee {
    abstract float calculateSalary();
    abstract void displayInfo();
}
class Manager extends Employee {
    private int salary;
     private  int deduction;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getDeduction() {
        return deduction;
    }

    public void setDeduction(int deduction) {
        this.deduction = deduction;
    }

    @Override
    float calculateSalary(){
         return salary-deduction;
     }
     @Override
    void displayInfo(){
         System.out.println("basic pay is "+salary+" and net salary is "+ calculateSalary());
     }
}
class Programmer extends Employee{
     private int basicPay;
     private int deduction;

    public int getBasicPay() {
        return basicPay;
    }

    public void setBasicPay(int basicPay) {
        this.basicPay = basicPay;
    }

    public int getDeduction() {
        return deduction;
    }

    public void setDeduction(int deduction) {
        this.deduction = deduction;
    }

    @Override
    float calculateSalary() {
         return basicPay - deduction;
     }
     @Override
    void displayInfo(){
         System.out.println("Basic pay is "+ basicPay + " and net salary is "+calculateSalary());
     }
}
public class Question4 {
    public static void main(String[] args) {
        Manager m=new Manager();
        m.setSalary(10000);
        m.setDeduction(2000);
        m.calculateSalary();
        m.displayInfo();
        Programmer p=new Programmer();
        p.setBasicPay(34000);
        p.setDeduction(2300);
        p.calculateSalary();
        p.displayInfo();
    }
}

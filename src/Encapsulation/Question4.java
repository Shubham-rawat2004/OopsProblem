package Encapsulation;

//Write a Java program to create a class called Employee with private instance variables employee_id, employee_name, and employee_salary. Provide public getter and setter methods to access and modify the id and name variables, but provide a getter method for the salary variable that returns a formatted string.
class Employee{
    private  int employee_id;
    private String employee_name;
    private int  employee_salary;

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public int  getEmployee_salary() {
        return employee_salary;
    }
    public void setEmployee_salary(int  employee_salary) {
        this.employee_salary=employee_salary;
        System.out.println(String.format("Salary of employee is %d", employee_salary));
    }
}
public class Question4 {
    public static void main(String[] args) {
 Employee E= new Employee();
 E.setEmployee_id(3);
 E.setEmployee_name("Shubham");
 E.setEmployee_salary(75000);
        System.out.println(E.getEmployee_id());
        System.out.println(E.getEmployee_salary());
        System.out.println(E.getEmployee_name());
    }
}

package Encapsulation;
//Write a Java program to create a class called Student with private instance variables student_id,
// student_name, and grades.
// Provide public getter and setter methods to access and modify the student_id and student_name variables.
// However, provide a method called addGrade() that allows adding a grade to the grades variable while
// performing additional validation.

class Student{
    private int student_id;
    private String student_Name;
    private char Grade;

    Student(int student_id,String  student_Name,char Grade){  //  parameter constructor
        this.student_id=student_id;
        this.student_Name=student_Name;
        this.Grade=Grade;
    }
    public  boolean addGrade(char c){
        if(c== 'A' || c=='B' || c=='C' || c=='D' || c=='E'){
            this.Grade=c;
            return true;
        }
        else{
            System.out.println("Invalid Grade valid upto E");
            return false;
        }
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getStudent_Name() {
        return student_Name;
    }

    public void setStudent_Name(String student_Name) {
        this.student_Name = student_Name;
    }

    public char getGrade() {
        return Grade;
    }

    public void setGrade(char grade) {
        Grade = grade;
    }
}
public class Question7 {
    public static void main(String[] args) {
        Student s=new Student(2,"Shubham",'B');
        s.setGrade('A');
        s.setStudent_id(1);
        s.setStudent_Name("Suraj Rawat");
//        s.setGrade('K');
        System.out.println(s.getGrade());
        System.out.println(s.getStudent_id());
        System.out.println(s.getStudent_Name());

    }
}
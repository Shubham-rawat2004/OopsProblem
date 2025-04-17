package Encapsulation;
//Write a Java program to create a class called BankAccount with private instance variables accountNumber and balance. Provide public getter and setter methods to access and modify these variables.
class  BankAccount{
    private int accountNumber;
    private int balance;

    BankAccount(int accountNumber,int balance){ // pehle constructor ka use karke value daal di and phir getter and setter ka use karke value modify kar di but construcot vali value accessible nhi h
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
}
public class Question2 {
    public static void main(String[] args) {
     BankAccount ba=new BankAccount(12,33);
       ba.setBalance(1000);
        ba.setAccountNumber(120000040);
        System.out.println(ba.getAccountNumber());
        System.out.println(ba.getBalance());
    }
}
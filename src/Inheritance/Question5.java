package Inheritance;
 //Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw(). Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if the account balance falls below one hundred

class BankAccount{
    int amount=0;
    void deposit(int money){
        amount+=money;
//        System.out.println("Total amount deposited is "+amount);
    }
    void withdraw(int withdrawal ){

        }
}
class  SavingAccount extends BankAccount{
@Override
void withdraw(int withdrawal){
    if(amount<100 || withdrawal>amount ){
        System.out.println("Insufficient cash to withdraw ");
    }
    else {
        System.out.println("Cash to withdraw with amount "+withdrawal);
    }
    }
    public double getBalance(int amount,int withdrawal){
        return amount-withdrawal;
    }
}
public class Question5 {
    public static void main(String[] args) {
SavingAccount s=new SavingAccount();
s.deposit(99);
s.withdraw(10);
        System.out.println(s.getBalance(99,10));
    }
}

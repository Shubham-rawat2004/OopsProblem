package Abstraction;

import java.util.Scanner;

abstract class BankAccount {
    abstract void deposit(float depositMoney);
    abstract int withdraw(int amount);
}
class SavingAccounts extends BankAccount {
    private float totalAmount = 0;
    @Override
        void deposit(float depositMoney) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select Account type: ");
        System.out.println("1.) Current Account");
        System.out.println("2.) Saving Account");
        int input = sc.nextInt();

        switch (input) {
            case 1:
                totalAmount += depositMoney;
                System.out.println(totalAmount);
                break;
            case 2:
                float interest = 0.10f * depositMoney;  // interest
                totalAmount += depositMoney + interest;
                System.out.println(totalAmount);
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
    @Override
    int withdraw(int withAmount) {
        if (withAmount > totalAmount) {
            System.out.println("Insufficient Balance");
            return -1;
        }
        totalAmount -= withAmount;
        System.out.println("Withdrawn: " + withAmount + ", Remaining Balance: " + totalAmount);
        return (int) totalAmount;
    }
}
public class Question2 {
    public static void main(String[] args) {
        SavingAccounts account = new SavingAccounts();
        account.deposit(1000);
//        account.withdraw(200);
    }
}


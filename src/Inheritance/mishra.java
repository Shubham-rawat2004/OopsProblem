package Inheritance;

import java.util.Scanner;

public class mishra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  number less 5");
        int a = sc.nextInt();
        int [] arr={1,2,4};

        for(int i=0;i<a;i++) {
            if (i == 3) {
                continue;
            } else {
                System.out.println(arr[i]);
            }
        }
int [][] v= new int[3][3];
        switch (a) {
            case 1:
                System.out.println("1");
                break;

            case 2:
                System.out.println("2");
//                continue: // throws an error :only run inside loop  not in switch statement

            case 3:
                System.out.println("3");

            case 4:
                System.out.println("4");

            default:
                System.out.println("Invalid Inputs");
        }
    }
}

package src.basics_03_16thDec;

import java.util.Scanner;

public class Lab047 {
    public static void main(String[] args) {

        // Take a input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value to checck if its even or odd");
        int a = sc.nextInt();

     //   int a = 34;

        if (a%2 == 1){
            System.out.println("Odd Num");
        }
        else {
            System.out.println("Even Num");
        }
    }
}

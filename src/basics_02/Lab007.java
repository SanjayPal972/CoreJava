package src.basics_02;

import java.util.Arrays;

public class Lab007 {

    /*
    Program difference between println and print
     */

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Java");

        int age = 30;
        // %d - any integer - byte,short,int or long
        // %s - String
        // %c - char
        // %f - float
        System.out.println("Your age is " + age);

        System.out.printf("Your Age is %d", age); // Age value will be replaced by %d

    }
}

package src.basics_01;

public class Lab002 {
    public static void main(String[] args) {  //main method
        // Keywords --
        // package, class, public are Reserved Keywords
        // Keywords are always in Lower case
        // We can't use keywords as a variable

        byte age = 10; // Range of Byte is -128 to 127

        //Note: It will accept only the latest value and print
        age = 127; // If we add 128 it will be out of range and throw an error while executing the program

        System.out.println(age); //If adding in the ""the printing statement will be printed

        // age =age + 1; --This is out of range, It will throw an error
        // System.out.println(age);

         // Age is local varible within
        // Local variable is available within the main method/main function

        short age2 = 128; // Range of Byte is -32768 to 32768
        System.out.println(age2);

    }
}

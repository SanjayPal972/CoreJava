package src.basics_03_16thDec;

public class Lab027 {
    public static void main(String[] args) {

    // Casting Mold
    byte b = 10;
    // int a = b; // Implicit Casting
     //   int a = (int) b; // Explicit casting
        // basically we need to add the data type beside the value

        int a1 = 500;
       // byte b1 = a1; // Invalid Implicit Casting
        byte b1 = (byte)a1; // Explicit casting
        System.out.println(b1);

}

}
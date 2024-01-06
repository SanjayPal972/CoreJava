package src.basics_03_16thDec;

public class Lab028 {
    public static void main(String[] args) {


        //If we do widening doesn't give any problem with that
        // If we are narrowing (implicit and Explicit) we need to add it manually
        int a = 100;
        float b = 10.25f;
        double c = a + b*a;
        // byte c = a + (byte) b*a;
        System.out.println(c);

    }
}

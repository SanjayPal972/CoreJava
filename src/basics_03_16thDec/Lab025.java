package src.basics_03_16thDec;

public class Lab025 {
    public static void main(String[] args) {

        int a = 70;
        boolean b = !(a > 10 || a < 678); // if using not equal to it will return as false
        System.out.println(b);


        // AND operator
        boolean c = !(a > 10 && a < 678);
        System.out.println(c); // false
    }
}

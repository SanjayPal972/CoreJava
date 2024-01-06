package src.basics_03_16thDec;

public class Lab037 {
    public static void main(String[] args) {

        // ? is a Ternary Operator
        // int a = conditon ? if this is true print do this : If false do this

        int a = 10;
        int b =20;
        int max = a < b ? b : a;
        int min = a < b ? a : b;
        System.out.println(max);
        System.out.println(min);



    }
}

package src.basics_03_16thDec;

public class Lab038 {
    public static void main(String[] args) {

        int a = 40;
        int b = 20;
        int c = 35;

        // a > b
        int max = (a > b)? ((a > c)? a : c) : ((b > c)? b : c);
        System.out.println(max);


    }
}

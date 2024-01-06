package src.basics_03_16thDec;

public class Lab030 {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        String s1 = "Sanjay";
        String s2 = "Pal";
        System.out.println(a+b+s1+s2); // 30SanjayPal
        System.out.println(s1+s2+a+b); // SanjayPal1020
        System.out.println(s1+s2+(a+b)); // SanjayPal30
    }
}

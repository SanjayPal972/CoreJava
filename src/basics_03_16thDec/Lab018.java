package src.basics_03_16thDec;

public class Lab018 {
    public static void main(String[] args) {

        int a = 10;
        int b =20;

        System.out.println(a+b);  // it will add and show the output as 30
        String name = "JavaBasics";
                System.out.println(a+b+name); // Over here it adds and Concatenate
        // Concatenation happens only when string is present
        // Note: Left to right
        // String + other

        System.out.println(a+name);
        System.out.println(a+name);



        System.out.println(name+a+b); //over here the String is first so it will concatenate
        // and the output will be JavaBascis1020

        System.out.println(a+name+b); //String is present so it is getting COncatenated instead of addition


    }
}

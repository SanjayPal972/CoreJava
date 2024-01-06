package src.basics_02;

public class Lab009 {
    public static void main(String[] args) {

        byte b = 10;
        short s = 128;
        int i = 128; // we can't have same variable name,
        // but variable value can be the same

        short i1 = 128;
        i1 = 3;
        i1 = 45; // in this case latest value will be printed
        // and it will be replaced by 45
        System.out.println(i1);

        String s1 = "Sanjay";
        System.out.println(s1);



    }
}

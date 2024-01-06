package src.basics_03_16thDec;

public class Lab033 {
    public static void main(String[] args) {

        String name = "Java Candidates";
        String name1 = "Java Candidates";
        String name2 = new String("Java candidates");

     //   System.out.println(name == name1);
     //   System.out.println(name.equals(name1));

     //   System.out.println(name == name2);
        System.out.println(name.equals(name2));
        System.out.println(name.equalsIgnoreCase(name2));



    }
}

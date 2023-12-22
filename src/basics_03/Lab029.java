package src.basics_03;

public class Lab029 {
    public static void main(String[] args) {

        String s1 = "Sheetal";
        //String Constant pool - SCP / String Pool

        // New Operator - Object
        String s2 = new String ("Sheetal");

        // Interview Question:
        //String s1 = "Sheetal";             // s1==s2? reference are equal? False
        //String s2= new String ("Sheetal"); // s1.equals(s2)? Value are equal? True

        //New Operator is used to create the new object for class.
        // It returns the address of newly created object.

        System.out.println(s2);
        System.out.println(new String ("Sheetal"));







    }
}

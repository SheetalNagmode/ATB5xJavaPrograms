package src.basics_03;

public class Lab020 {
    public static void main(String[] args) {
        // Relational Operators
        int age_Sheetal = 42;
        int age_Sandeep = 45;
        boolean result = age_Sandeep > age_Sheetal;
        System.out.println(result);

        // >,<,=,<=,>=,==,!=  (examples of relational operators)

        int a = 10;
        int b = 10;
        boolean c = a == b; //(== checks for references if they are present)

        int a1 = 11;
        int b1 = 12;
        boolean c1 = a1 > b1;
        System.out.println(c1);

        int a2 = 22;
        int b2 = 33;
        boolean c2 = a2 < b2;
        System.out.println(c2);

        int a3 = 22;
        int b3 = 22;
        boolean c3 = a3 >= b3;
        System.out.println(c3); // over condition.


        // reference in case of int - it check for value, string - it checks for references
        System.out.println(c);










    }
}

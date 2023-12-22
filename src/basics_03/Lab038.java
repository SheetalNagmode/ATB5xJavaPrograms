package src.basics_03;

public class Lab038 {

    public static void main(String[] args) {

        // Ternary operator.

        // int a = condition? if this is true, do this. If this is false, do this.

        // MAX in two number?

        int a = 40;
        int b = 20;
        int c = 32;

        // Ternary operator → ?
        // a > b && a > c →

        // (a > c) ? a : c
        // (b > c) ? b : c

        int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);  // ternary operator within ternary operator
        System.out.println(max);








    }





}

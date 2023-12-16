package src.basics_02;

public class Lab007 {
    public static void main(String[] args) {
        /**
         * Author - Sheetal
         * showcase difference between println vs print
         * hover over print, press crl, you will see the definition
         */

        System.out.println("Hello world");
        System.out.print("Sheetal");

        int age = 34;

        // %d → any integer - byte,short, int or long
        // %s → string
        // %c → char
        // %f → float

        System.out.printf("Your Age is %d", age);



    }
}

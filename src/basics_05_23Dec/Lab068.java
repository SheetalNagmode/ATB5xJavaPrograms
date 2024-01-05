package src.basics_05_23Dec;

import java.util.Scanner;

public class Lab068 {
    public static void main(String[] args) {

        //You have to tell JVM which input user is entering
        // sc.next() → String;
        // sc.nextInt();
        // sc.nextDouble();
        // sc.nextBoolean();
        // sc.nextFloat();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the X");
        double x = sc.nextDouble();
        System.out.println("Enter the y");
        double y = sc.nextDouble();
        System.out.println(" Enter the Z");
        double z = sc.nextDouble();

        double result = 0;

        // 3/ x^2 + y^2 - |z|
        // A+B+C → A → x^2, B → y^2, C → |z| abs(z) |-1| → 1
        result = Math.cbrt(Math.pow(x,2) + Math.pow(y,2) - Math.abs(z));
        System.out.println(result);

        // Scanner stream should be closed after we are done.
        // JVM will do it, Garbage Collector → who will do it for you
        // It is not a good practice →
        sc.close();









    }
}

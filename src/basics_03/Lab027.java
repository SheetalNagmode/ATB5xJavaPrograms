package src.basics_03;

public class Lab027 {
    public static void main(String[] args) {

        // Casting - mold
        // Widening is a process of converting lower type to higher type

        byte b = 10;
    //    int a = b;  // Implicit casting - JVM
        int a = (int)b; // Explicit casting

        //Narrowing is a process of converting higher type to lower type

        int a1 = 300;
    //    byte b1 = a1; // Invalid Implicit casting
        byte b1 = (byte)a1;  // Explicit casting
        System.out.println(b1);

        // 32 bits
        //0  0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 2 3 1
        //will be sorted into the b
    //  0 0 1 0 1 1 0 0
    //  0 * 27 + 0 * 26 + 1* 25 + 0 * 24 + 1 * 23 + 1 * 22 + 0 * 21 + 0 + 0 + 32 + 0 + 8 + 4 + 0 + 0
        //44






    }




}

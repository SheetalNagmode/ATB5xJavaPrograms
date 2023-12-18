package src.basics_03;

public class Lab018 {
    public static void main(String[] args) {
        int a = 10;
        int b = 45;
        System.out.println(a+b);
        String name = "Sheetal";
        System.out.println(a+name);
        System.out.println(name+a);
        // Interview question = String concatenation goes from left to right

        // Concatenation happens only when there is → String + other
        System.out.println(a+b+name);

        // All the + below are concatenation
        System.out.println(name+a+b);





    }
}

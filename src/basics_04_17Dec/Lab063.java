package src.basics_04_17Dec;

public class Lab063 {
    public static void main(String[] args) {

        int itemCode = 005;
        switch (itemCode) {
            case 001 -> System.out.println("It's a laptop!");
            case 002 -> System.out.println("It's a desktop!");
            case 003,004 -> System.out.println("It's a mobile!");
            default -> System.out.println("Hello!");

        // if you use arrow you don't have to write break separately
        // arrow automatically adds a break
        // issue with this is it takes only one liner if you add another line it won't take it

        }
    }
}

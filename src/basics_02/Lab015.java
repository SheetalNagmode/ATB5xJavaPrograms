package src.basics_02;

public class Lab015 {
    public static void main(String[] args) {

        char c = '\n';   // Add New line/ Next line
        char c1 = '\t';  // Add a tab
        char c2 = '\b';  // Backlash - delete 1 character
        char c3 = '\r';  // Carriage return - delete the previous word
        System.out.println("Move" + c + "Please");
        System.out.println("Thank" + c1 +"God");
        System.out.println("Hello" + c2 + "Sir");
        System.out.println("Sheetal" + c3 + "Nagmode");

        System.out.println("Sheetal\tNagmode");
        System.out.println("Step\nDown");
        System.out.println("Hello\bWorld");
        System.out.println("No\rMovie");
        System.out.println("Sheetal\'s");  // \" single quote character
        System.out.println("Sheetal\"s");  // \' double quote character

    }
}

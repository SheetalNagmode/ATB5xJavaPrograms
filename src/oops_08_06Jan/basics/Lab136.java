package src.oops_08_06Jan.basics;

public class Lab136 {
    public static void main(String[] args) {


        // If something is Thread Safe, we avoid!
        // StringBuffer vs StringBuilder
        StringBuilder stringBuilder = new StringBuilder("Pramod");
        stringBuilder.reverse();
        System.out.println(stringBuilder);



    }
}

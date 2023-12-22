package src.basics_03;

public class Lab033 {
    public static void main(String[] args) {

        String name = "The Testing Academy";   //SCP
        String name1 = "The Testing Academy";  // SCP
        String name2 = new String ("The Testing Academy");  // Heap Area

        System.out.println(name == name1);
        System.out.println(name.equals(name1));

        System.out.println(name == name2);

        System.out.println(name.equals(name2));
    //  System.out.println(name. equals(name2));
    //  This is false for name2 = "The Testing academy"
    //  System.out.println(name.equalsIgnoreCase(name2));
    //  This case its True



    }
}

package src.oops_11_14Jan;

public class Lab150 {
    public static void main(String[] args) {

        //        System.out.println(StaticDemo.college_name);
//        StaticDemo.printName();

        StaticDemo s1 = new StaticDemo();
        s1.version = 199;
        s1.printVersion();

        StaticDemo.college_name = "TTA";

        StaticDemo s2 = new StaticDemo();
        s2.version = 299;
        s2.printVersion();


        //Lab150.main();

    }
}

package src.basics_03;

public class Lab021 {
    public static void main(String[] args) {
        //Interview Question → Relational operator
        System.out.println(10==10);
        System.out.println(10>=10);
        System.out.println(10<=10);
        System.out.println(10>10);
        System.out.println(10<10);

        System.out.println('A'==65);
        // character in sop statement is always integer, ASCII
        // Assigning value is not allowed in sop statement, you can only compare.

        byte b = 65;
        System.out.println('A'==b);
        // anything used in a sop statement becomes integer
        System.out.println('A'== 65.0f);
        // This is a property of Java. Float in sop statement will be integer
        System.out.println('A'== 65.2);
        // Now its false since the value is not equal

        //System.out.println(true == 0);
        // double equal operator cannot be applied to boolean and integer
        //System.out.println(true >= true);
        // between boolean there is no comparison operators


    }
}

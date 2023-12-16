package src.basics_01;

public class Lab002 {
    public static void main(String[] args) {

        // Keywords → simple english words
        // package, public, class → Reserved Words (Java)
        // blue color in IntelliJ
        // keywords are in lower case.
        // We can't use keywords as variables.

        byte age = 10;  // Range of byte -128 to 127
        age = 127;  // out of Range if 128
        System.out.println(age + 1);
      //   age = age + 1
        System.out.println(age);

        // Local Variable - age

        short age2 = 128;  // -32768 to 32678
      //  age2 = 45000000;  error- out of Range

        // short = Data Type, age2 = Variable Name, 128 = Variable Value (also called as Literal).
        // Variable name = you can't use names like class, public, etc.. since they are Keywords
        // Upper case Class, Public, Static, etc can be used as a variable name.
        // $ can be used as a variable name
        // _ can't be used as a variable name as of Java 9 as it is a keyword, but _age can be used

    }
}
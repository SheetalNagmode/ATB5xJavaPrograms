package src.oops_10_13Jan.encapsulation;

public class Lab149 {
    public static void main(String[] args) {

        ICICIBank i = new ICICIBank("pramod", 100);
        i.setBal(-1);
        i.setName("Lucky"); //Fine
    }
}

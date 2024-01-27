package src.oops_10_13Jan.abstraction.interfaces;

public class PramodC implements FatherI{

    @Override
    public void load1K() {
        FatherI.print2();
        System.out.println("I will give you LOAN!");
    }
}

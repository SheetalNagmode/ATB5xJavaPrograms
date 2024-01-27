package src.oops_10_13Jan.abstraction.interfaces.realtimeexample;

public class Car implements Engine, Break{
    void start(){
        System.out.println("Starting the Car");
        startEngine();
        breaks();
    }

    @Override
    public void startEngine() {
        System.out.println("Started Enginer");
    }

    @Override
    public void breaks() {
        System.out.println("break is working fine");
    }
}

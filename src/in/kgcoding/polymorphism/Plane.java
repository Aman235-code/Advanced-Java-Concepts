package in.kgcoding.polymorphism;

public class Plane extends Vehicle{

    @Override
    public void start() {
        super.start();
        System.out.println("plane taking off..");
    }

}

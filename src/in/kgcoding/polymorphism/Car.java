package in.kgcoding.polymorphism;

public class Car extends Vehicle{

    Car(){
        super();
        System.out.println("Caaaaaaaaaaaaaaaa");
    }

    Car(int noOfTires){
        super(noOfTires);
        System.out.println("Raaaaaaaaaaaaaaaaa");
    }

    public int noOfDoors(){
        return 4;
    }

    @Override
    public void start() {
        System.out.println(super.getNoOfTires());
        System.out.println("Starting...");
    }
}

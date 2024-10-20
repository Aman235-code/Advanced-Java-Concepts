package in.kgcoding.polymorphism;

public abstract class Vehicle {

    private int noOfTires;

    Vehicle(){
        this.noOfTires = 90;
        System.out.println("yaaaaaaaaaa");
    }

    Vehicle(int noOfTires){
        this.noOfTires = noOfTires;
        System.out.println("Naaaaaaaaaaaaaa");
    }

    public int getNoOfTires(){
        System.out.println("hereeeeeeeeeeee");
        return this.noOfTires;
    }

    public void start(){
        System.out.println("Vehicle is started");
    }
}

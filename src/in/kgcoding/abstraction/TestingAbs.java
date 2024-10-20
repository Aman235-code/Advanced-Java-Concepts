package in.kgcoding.abstraction;

public class TestingAbs {
    public static void main(String[] args) {
//        Vehicle vehicle = new Vehicle(7);
        Car c = new Car();
        c.commute();
        c.makeStartSound();
    }
}

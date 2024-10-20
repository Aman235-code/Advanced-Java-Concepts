package in.kgcoding.polymorphism;

public class TestTransP {
    public static void main(String[] args) {
        Car car = new Car();
//        Vehicle vehicle = new Vehicle();
        Plane plane = new Plane();
        car.start();
        plane.start();

//        castTest(vehicle);
//        castTest(car);
//        castTest(plane);

//        Vehicle vCar = new Car(); // upcasting
//        Car car1 = (Car) new Vehicle();
//        Object ref = new Vehicle();
    }

    private static void castTest(Vehicle vehicle){
//        vehicle.start();
        Car car1 = (Car) vehicle;
//        ((Car) vehicle).noOfDoors();
        car1.start();
        car1.noOfDoors();
    }
}

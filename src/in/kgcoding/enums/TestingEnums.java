package in.kgcoding.enums;

public class TestingEnums {

    public static void main(String[] args) {
        TrafficLight color = TrafficLight.RED;
        Grade grade = Grade.valueOf("D");
        System.out.println(grade);
        for (Grade value : Grade.values()) {
            System.out.println(value);
        }
    }
}

package in.kgcoding.methodReferences;

import java.util.List;

public class TestingMethodInterface {
    public static void main(String[] args) {
        List<Integer> number = List.of(1,3,5,3,9,2,5);
//        number.stream().filter(num -> num%2==1).forEach(num -> System.out.println(num));

        number.stream().filter(num -> num%2==1).forEach(System.out::println);



        int newsum2 = number.stream()
                .reduce(0, Integer::sum);
        System.out.println(newsum2);
    }
}

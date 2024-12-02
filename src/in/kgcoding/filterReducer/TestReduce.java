package in.kgcoding.filterReducer;

import java.util.List;
import java.util.function.BinaryOperator;

public class TestReduce {
    public static void main(String[] args) {
        List<Integer> number = List.of(1,3,5,3,9,5);
        int sum = 0;
        for (Integer num: number){
            sum+= num;
        }
//        System.out.println(sum);

        int newsum = number.stream()
                .reduce(0, new BinaryOperator<Integer>() {
                    @Override
                    public Integer apply(Integer integer, Integer integer2) {
                        return integer + integer2;
                    }
                });
//        System.out.println(newsum);

        int newsum2 = number.stream()
                .reduce(0, (a,b) -> a+b);
        System.out.println(newsum2);
    }
}

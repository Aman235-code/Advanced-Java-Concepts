package in.kgcoding.optional;

import java.util.List;
import java.util.Optional;

public class TestingOptional {
    public static void main(String[] args) {
        List<Integer> number = List.of(1,3,5,3,9,2,5);

        Optional<Integer> newsum2 = number.stream()
                .reduce((a,b) -> a+b);
        if(newsum2.isPresent()){
            System.out.println(newsum2.get());
        }
        else{
            System.out.println("Empty");
        }
    }
}

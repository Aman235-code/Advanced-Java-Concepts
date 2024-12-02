package in.kgcoding.filterReducer;

import java.util.List;
import java.util.function.Consumer;

public class FilterReducer {
    public static void main(String[] args) {
        List<String> fruits = List.of("Apple","Banana","Mango","Cherry","date");
        System.out.println(fruits.size());
//        for (String fruit: fruits){
//            System.out.println(fruit);
//        }

//        fruits.stream().forEach(new Consumer<String>() {
//            @Override
//            public void accept(String fruit) {
//                System.out.println(fruit);
//            }
//        });

        fruits.stream().filter(fruit -> fruit.endsWith("e")).forEach(fruit -> System.out.println(fruit));
    }
}

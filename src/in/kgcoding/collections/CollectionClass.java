package in.kgcoding.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionClass {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();
        numList.add(5);
        numList.add(2);
        numList.add(8);
        numList.add(-76);
        Utility.print(numList);
        Collections.sort(numList);
        Utility.print(numList);
        Collections.reverse(numList);
        Utility.print(numList);

        List<Integer> unmodifieable = Collections.unmodifiableList(numList);
//        unmodifieable.add(78);
    }
}

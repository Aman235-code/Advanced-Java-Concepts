package in.kgcoding.collections;

import java.util.HashSet;
import java.util.Set;

public class SetInterface {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        System.out.println(names.add("Aman"));
        System.out.println(names.add("Ayan"));
        System.out.println(names.add("Java"));
        Utility.print(names);

        System.out.println(names.add("Aman"));
        System.out.println(names.size());
        Utility.print(names);
        System.out.println(names.contains("Ayan"));
        System.out.println(names.remove("Ayan"));
        Utility.print(names);
        System.out.println(names.remove("Ayan"));
    }
}

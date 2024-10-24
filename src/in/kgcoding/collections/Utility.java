package in.kgcoding.collections;

import java.util.Collection;

public class Utility {
    public static <E> void print(Collection<E> collection){
        for (E object : collection) {
            System.out.printf("%s ",object);
        }
        System.out.println();
    }
}

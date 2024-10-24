package in.kgcoding.collections;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("Aman");
        strList.add("Ahamed");
        System.out.println(strList.get(0));
        for (int i = 0; i < strList.size() ; i++) {
            System.out.println(strList.get(i));
        }
        strList.add(1,"Hola");
        System.out.println(strList);
        strList.remove(0);
        System.out.println(strList);
        if(strList.contains("Ahamed")){
            System.out.println("Exists");
            System.out.println(strList.indexOf("Ahamed"));
        }

        for(String str: strList){
            System.out.println(str);
        }
    }
}

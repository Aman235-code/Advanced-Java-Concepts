package in.kgcoding.map;

import java.util.HashMap;
import java.util.Map;

class MapInterface {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Aman",30);
        map.put("Ayan",100);
        map.put("Ram",100);
        map.put("Sohan",0);
        System.out.println(map.size());
        System.out.println(map.get("Ram"));
        System.out.println(map.containsKey("Aman"));
        System.out.println(map.containsKey("Geeta"));
        System.out.println(map.remove("Sohan"));
        System.out.println(map.size());

        for (String key : map.keySet()) {
            System.out.println(key);
            System.out.println(map.get(key));
        }
    }
}

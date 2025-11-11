package map;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cat");
        map.put(4, "Dog");
        map.put(5, "Elephant");

        // Get single value
        System.out.println("Single Value via key : " + map.get(2));
        // Get All Key form map
        System.out.println("All keys :" + map.keySet());

        for (Map.Entry<Integer, String> e : map.entrySet()){
            System.out.println("All Entries : " + e);
        }
    }
}

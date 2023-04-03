package CodingBat.Map1;

import java.util.HashMap;
import java.util.Map;

public class Topping1 {
    public static void main(String[] args) {
        Map<String, String> myMap = createMap();
        System.out.println("Map Produced for topping1Logic is::" + topping1Logic(myMap));
    }

    private static Map<String, String> topping1Logic(Map<String, String> myMap) {
        if (myMap.size() > 0) {
            if (myMap.get("ice-cream") != null) {
                myMap.put("ice-cream", "cherry");
            } else {
                myMap.put("bread", "butter");
            }
        } else {
            myMap.put("bread", "butter");
        }
        return myMap;
    }


    private static Map<String, String> createMap() {
        Map<String, String> myMap = new HashMap<>();
        return myMap;
    }
}

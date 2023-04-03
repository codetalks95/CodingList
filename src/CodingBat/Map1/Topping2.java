package CodingBat.Map1;

import java.util.HashMap;
import java.util.Map;

public class Topping2 {
    public static void main(String[] args) {
        Map<String, String> myMap = createMap();
        System.out.println("Map Produced for topping2Logic is::" + topping2Logic(myMap));
    }

    private static Map<String, String> topping2Logic(Map<String, String> myMap) {
        if (myMap.size() > 0) {
            if (myMap.get("ice-cream") != null && myMap.get("spinach") != null) {
                myMap.put("yogurt", myMap.get("ice-cream"));
                myMap.put("spinach","nuts");
            } else if (myMap.get("spinach") != null) {
                myMap.put("nuts", myMap.get("spinach"));
            } else if (myMap.get("ice-cream") != null) {
                myMap.put("yogurt", myMap.get("ice-cream"));
            }
        }
        return myMap;
    }

    private static Map<String, String> createMap() {
        Map<String, String> myMap = new HashMap<>();
        myMap.put("spinach", "dirt");
        myMap.put("ice-cream", "cherry");
        return myMap;
    }
}

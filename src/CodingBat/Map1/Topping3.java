package CodingBat.Map1;

import java.util.HashMap;
import java.util.Map;

public class Topping3 {
    public static void main(String[] args) {
        Map<String, String> myMap = createMap();
        System.out.println("Map Produced for topping3Logic is::" + topping3Logic(myMap));
    }

    private static Map<String, String> topping3Logic(Map<String, String> myMap) {
        if (myMap.size() > 0) {
            if (myMap.get("salad") != null && myMap.get("potato") != null) {
                myMap.put("fries", myMap.get("potato"));
                myMap.put("spinach", myMap.get("salad"));
            } else if (myMap.get("salad") != null) {
                myMap.put("spinach", myMap.get("salad"));
            } else if (myMap.get("potato") != null) {
                myMap.put("fries", myMap.get("potato"));
            }
        }
        return myMap;
    }

    private static Map<String, String> createMap() {
        Map<String, String> myMap = new HashMap<String, String>();
        myMap.put("salad", "oil");
        myMap.put("potato", "ketchup");
        return myMap;
    }
}

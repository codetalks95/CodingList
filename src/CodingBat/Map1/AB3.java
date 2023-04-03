package CodingBat.Map1;

import java.util.HashMap;
import java.util.Map;

public class AB3 {
    public static void main(String[] args) {
        Map<String, String> myMap = createMap();
        System.out.println("Map Produced for ab3Logic is::" + ab3Logic(myMap));
    }

    private static Map<String, String> ab3Logic(Map<String, String> myMap) {
        if (!myMap.isEmpty()) {
            if ((myMap.containsKey("a") && myMap.containsKey("b"))) {
                return myMap;
            } else {
                if (myMap.containsKey("a") || myMap.containsKey("b")) {
                    if (myMap.containsKey("a")) {
                        myMap.put("b", myMap.get("a"));
                    } else if (myMap.containsKey("b")) {
                        myMap.put("a", myMap.get("b"));
                    }
                }
            }
        }
        return myMap;
    }

    private static Map<String, String> createMap() {
        Map<String, String> myMap = new HashMap<String, String>();
        myMap.put("a", "aaa");
        myMap.put("b", "bbb");
        myMap.put("c", "cake");
        return myMap;
    }
}

package CodingBat.Map1;

import java.util.HashMap;
import java.util.Map;

public class AB2 {
    public static void main(String[] args) {
        Map<String, String> myMap = createMap();
        System.out.println("Map Produced for ab2Logic is::" + ab2Logic(myMap));
    }

    private static Map<String, String> ab2Logic(Map<String, String> myMap) {
        if (!myMap.isEmpty()) {
            if (myMap.get("a") != null && myMap.get("b") != null && myMap.get("a").equals(myMap.get("b"))) {
                myMap.remove("a");
                myMap.remove("b");
            }
        }
        return myMap;
    }

    private static Map<String, String> createMap() {
        Map<String, String> myMap = new HashMap<String, String>();
        myMap.put("a", "aaa");
        myMap.put("b", "aaa");
        myMap.put("c", "cake");
        return myMap;
    }
}

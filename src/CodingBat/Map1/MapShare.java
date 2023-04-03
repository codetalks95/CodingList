package CodingBat.Map1;

import java.util.HashMap;
import java.util.Map;

public class MapShare {
    public static void main(String[] args) {
        Map<String, String> myMap = createMap();
        System.out.println("Map Produced for mapShare is::" + mapShare(myMap));
    }

    private static Map<String, String> mapShare(Map<String, String> myMap) {
        if (!myMap.isEmpty() && myMap.containsKey("c")) {
            if (myMap.containsKey("a")) {
                if (myMap.containsKey("a")) {
                    myMap.put("b", myMap.get("a"));
                    myMap.remove("c");
                }
            } else {
                myMap.remove("c");
            }
        }
        return myMap;
    }

    private static Map<String, String> createMap() {
        Map<String, String> myMap = new HashMap<String, String>();
        myMap.put("a", "aaa");
        myMap.put("b", "bbb");
        myMap.put("c", "ccc");
        return myMap;
    }
}

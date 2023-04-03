package CodingBat.Map1;

import java.util.HashMap;
import java.util.Map;

public class MapBully {
    public static void main(String[] args) {
        Map<String, String> myMap = createMap();
        System.out.println("Map Produced for mapBully is::" + mapBully(myMap));
    }

    private static Map<String, String> mapBully(Map<String, String> myMap) {
        if (!myMap.isEmpty() && myMap.containsKey("a")) {
            if (myMap.containsKey("a")) {
                myMap.put("b", myMap.get("a"));
                myMap.put("a", "");
            }
        }
        return myMap;
    }

    private static Map<String, String> createMap() {
        Map<String, String> myMap = new HashMap<String, String>();
        myMap.put("a", "candy");
        myMap.put("b", "carrot");
        myMap.put("c", "meh");
        return myMap;
    }
}

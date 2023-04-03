package CodingBat.Map1;

import java.util.HashMap;
import java.util.Map;

public class AB2 {
    public static void main(String[] args) {
        Map<String, String> myMap = createMap();
        System.out.println("Map Produced for ab4Logic is::" + ab4Logic(myMap));
    }

    private static Map<String, String> ab4Logic(Map<String, String> myMap) {
        if (myMap.size() >= 3) {
            if (myMap.get("a").length() != myMap.get("b").length()) {
                if (myMap.get("a").length() > myMap.get("b").length()) {
                    myMap.put("c", myMap.get("a"));
                } else if (myMap.get("a").length() < myMap.get("b").length()) {
                    myMap.put("c", myMap.get("b"));
                }
            } else {
                myMap.put("a", " ");
                myMap.put("b"," ");
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

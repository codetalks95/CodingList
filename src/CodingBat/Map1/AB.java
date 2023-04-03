package CodingBat.Map1;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AB {
    public static void main(String[] args) {
        Map<String, String> myMap = createMap();
        System.out.println("Map Produced for abLogic is::" + abLogic(myMap));
    }

    private static Map<String, String> abLogic(Map<String, String> myMap) {
        Map<String, String> newHashMap = new HashMap<>();
        List<String> stringListKey = new ArrayList<>();
        List<String> stringListValue = new ArrayList<>();
        if (myMap.size() >= 2) {
            for (Map.Entry<String, String> entry : myMap.entrySet()) {
                stringListKey.add(entry.getKey());
                stringListValue.add(entry.getValue());
            }
            newHashMap.put(String.join("", stringListKey), String.join("", stringListValue));
            return newHashMap;
        }
        return myMap;
    }

    private static Map<String, String> createMap() {
        Map<String, String> myMap = new HashMap<String, String>();
        myMap.put("a", "hi");
        myMap.put("b", "There");
        return myMap;
    }
}

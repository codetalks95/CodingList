package Arrays;

import java.util.*;

public class SecondLargestAndSmallest {
    public static void main(String[] args) {
        Random random = new Random();
        int[] num = new int[5];
        for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(10);
        }
        System.out.println("The Random Array is" + " " + Arrays.toString(Arrays.stream(num).toArray()));
        System.out.println("Remove Duplicate" + " " + removeDuplicate(num));
        System.out.println(secondLargestAndSmallest(num));
    }

    private static Map<String, Integer> secondLargestAndSmallest(int[] num) {
        Map<String, Integer> map = new HashMap<>();
        List<Integer> integerList = removeDuplicate(num);
        if (integerList.size() <= 2) {
            System.out.println("Doesn't contain much element for Traversing");
        } else {
            map.put("Second Largest Element", integerList.get(integerList.size() - 2));
            map.put("Second Smallest Element", integerList.get(1));
        }
        return map;
    }

    private static List<Integer> removeDuplicate(int[] num) {
        Set<Integer> integerSet = new HashSet<>();
        for (int j : num) {
            integerSet.add(j);
        }
        return List.copyOf(integerSet);
    }
}

package CodingExamples;

import java.util.*;

public class BlackJack {
    public static void main(String[] args) {
        Integer[] num = {19, 22};
        System.out.println("Black Jack Num is::" + "" + blackJack(num));
    }

    private static Integer blackJack(Integer[] num) {
        Map<Integer, Integer> integerList = new HashMap<>();
        for (Integer integer : num) {
            if (integer > 0) {
                integerList.put(integer, 21 - integer);
            }
        }
        List<Integer> ints = integerList.values().stream().toList();
        for (Map.Entry<Integer, Integer> entry : integerList.entrySet()) {
            if (Objects.equals(entry.getValue(), findLowestNumber(ints))) {
                return entry.getKey();
            }
        }
        return null;
    }

    private static Integer findLowestNumber(List<Integer> ints) {
        return Collections.min(ints);
    }
}
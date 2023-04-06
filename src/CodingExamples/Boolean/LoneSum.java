package CodingExamples.Boolean;

import java.util.*;
import java.util.stream.Collectors;

public class LoneSum {
    public static void main(String[] args) {
        int[] num = {3, 2, 3};
        System.out.println("Lone Sum Solution is::" + " " + loneSumSolution(num));
    }

    private static int loneSumSolution(int[] num) {
        List<Integer> list = Arrays.stream(num).boxed().collect(Collectors.toList());
        List<Integer> integerList = new ArrayList<>();
        System.out.println("List is::" + " " + list);
        logicComputation(num, list, integerList);
        int number;
        System.out.println(list);
        number = getNumber(list);
        return number;
    }

    private static void logicComputation(int[] num, List<Integer> list, List<Integer> integerList) {
        logicCalculate(num, list, integerList);
    }

    private static void logicCalculate(int[] num, List<Integer> list, List<Integer> integerList) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (num[i] == num[j]) {
                    integerList.add(num[i]);
                }
            }
        }
        logic(list, integerList);
    }

    private static void logic(List<Integer> list, List<Integer> integerList) {
        if (integerList.size() != 0 && !allSameLogic(integerList)) {
            for (Integer integer : integerList) {
                list.remove(integer);
            }
        } else {
            list.removeAll(integerList);
        }
    }

    private static boolean allSameLogic(List<Integer> list) {
        return list.stream().distinct().limit(2).count() <= 1;
    }

    private static int getNumber(List<Integer> list) {
        return list.stream().mapToInt(integer -> integer).sum();
    }
}

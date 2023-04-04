package CodingBat.Arrays1;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Double23 {
    public static void main(String[] args) {
        int[] num = {2, 2, 3, 2, 1, 5, 1};
        System.out.println("Double23 Logic result is::" + double23Logic(num));
    }

    private static Map<Integer, Long> double23Logic(int[] num) {
        return Arrays.stream(num).boxed().collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()));
    }
}

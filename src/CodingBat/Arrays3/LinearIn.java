package CodingBat.Arrays3;

public class LinearIn {
    public static void main(String[] args) {
        int[] inner = {1, 2, 4, 6};
        int[] outer = {2, 4};
        System.out.println("LinearIn result Logic is::" + linearInLogic(inner, outer));
    }

    private static Boolean linearInLogic(int[] inner, int[] outer) {
        int i = 0;
        int j = 0;
        while (i < inner.length && j < outer.length) {
            if (inner[i] > outer[j]) {
                j++;
            } else if (inner[i] < outer[j]) {
                return false;
            } else {
                i++;
            }
        }
        return i == inner.length;
    }
}


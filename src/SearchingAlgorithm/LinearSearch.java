package SearchingAlgorithm;

public class LinearSearch {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 8, 9};
        System.out.println("Linear Search Number Index is " + "  " + linearSearch(numbers, 9));
    }

    public static int linearSearch(int[] numbers, int numberToFind) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == numberToFind) {
                return i;
            }

        }
        return -1;
    }
}
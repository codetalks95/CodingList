package SearchingAlgorithm;

public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 8, 9};
        System.out.println("Binary Search Index Number is  " + "  " + binarySearch(numbers, 9));
    }

    public static int binarySearch(int[] numbers, int number) {
        int low = 0;
        int high = numbers.length - 1;
        while (low <= high) {
            int middle = low + high / 2;
            int middleNumber = numbers[middle];
            if (middleNumber == number) {
                return middle;
            }
            if (number < middleNumber) {
                high = middle + 1;
            } else {
                low = middle - 1;
            }
        }
        return -1;
    }
}

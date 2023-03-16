package SimpleJavaPrograms;

import java.util.Random;

public class PrimeNumber {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("The Random Number Generated is" + " " + random.nextInt(100));
        if (primeNumber(random.nextInt(100)) != 0) {
            System.out.println(primeNumber(random.nextInt(100)) + " " + "It is not a Prime Number");
        } else {
            System.out.println("It is a Prime Number");
        }
    }

    private static int primeNumber(int number) {
        int flag = 0;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                flag = 0;
                break;
            } else {
                flag = 1;
            }
        }
        if (flag == 1) {
            return number;
        }
        return 0;
    }
}

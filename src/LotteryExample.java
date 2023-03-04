import java.util.*;

public class LotteryExample {
    public static void main(String[] args) {
        verifyWinner();
    }

    public static List<Integer> winningNumberSection() {
        List<Integer> winningNumber = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            while (true) {
                int number = random.nextInt(49) + 1;
                winningNumber.add(number);
                break;
            }
        }
        System.out.println(winningNumber);
        return winningNumber;
    }

    public static List<Integer> customerSelection() {
        List<Integer> customerSelection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            while (true) {
                System.out.println("Enter the" + "  " + (i+1)+ " " + "Number");
                int number = scanner.nextInt();
                if (number > 0 && number <= 49) {
                    customerSelection.add(number);
                    break;
                } else {
                    System.out.println("Wrong Entry , Try Number Between 0 to 49");
                }
            }
            System.out.println(customerSelection);
        }
        return customerSelection;
    }

    public static void verifyWinner() {
        List<Integer> winningNumberSection = winningNumberSection();
        List<Integer> customerSelection = customerSelection();
        if (new HashSet<>(winningNumberSection).containsAll(customerSelection)) {
            System.out.println("Hurray you Did it,Lottery Selection Passed.");
        } else {
            System.out.println("Lottery selection failed.");
        }
    }
}
import java.util.Random;
import java.util.Scanner;

public class RockNScissor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            char[] sequence = {'r', 'p', 's'};
            Random random = new Random();
            char result = sequence[random.nextInt(sequence.length)];
            System.out.println(result);
            System.out.println("Enter the Character");
            char ch = scanner.next().charAt(0);
            if (ch == 'r' || ch == 'p' || ch == 's') {
                if (match(result, ch)) {
                    System.out.println("You Win");
                } else {
                    System.out.println("You Lose");
                }
            } else {
                System.out.println("Your Character doesn't match with r,p or s");
            }
            System.out.println("Do You Want to Quit the Game Y/N");
            char chs = scanner.next().charAt(0);
            if (chs == 'y') {
                break;
            }
        }
    }

    public static boolean match(char randomChar, char ch) {
        return randomChar == ch;
    }
}

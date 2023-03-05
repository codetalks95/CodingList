import java.util.Random;
import java.util.Scanner;

public class TicTacToeGame {
    public static void main(String[] args) {
        char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
        while (true) {
            playerMove(board);
            if (hasContestantWon(board, 'X')) {
                winningNotes(board, 'X', "Player");
                break;
            }
            computerMove(board);
            if (hasContestantWon(board, 'O')) {
                winningNotes(board, 'O', "Computer");
                break;
            }
            printBoard(board);
        }
    }

    private static void winningNotes(char[][] board, char symbol, String player) {
        winningOrLosingNotes(board, symbol, player);
    }

    private static void computerMove(char[][] board) {
        Random random = new Random();
        while (true) {
            int numberInBoard = random.nextInt(9) + 1;
            if (isValidMove(board, numberInBoard)) {
                placeMove(board, String.valueOf(numberInBoard), 'O');
                break;
            }
        }
    }

    private static boolean isValidMove(char[][] board, int numberInBoard) {
        return switch (String.valueOf(numberInBoard)) {
            case "1" -> board[0][0] == ' ';
            case "2" -> board[0][1] == ' ';
            case "3" -> board[0][2] == ' ';
            case "4" -> board[1][0] == ' ';
            case "5" -> board[1][1] == ' ';
            case "6" -> board[1][2] == ' ';
            case "7" -> board[2][0] == ' ';
            case "8" -> board[2][1] == ' ';
            case "9" -> board[2][2] == ' ';
            default -> false;
        };
    }

    private static void playerMove(char[][] board) {
        System.out.println("Enter the Place for Input?");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (isValidMove(board, number)) {
            placeMove(board, String.valueOf(number), 'X');
        } else {
            System.out.println("Invalid Move , Please Try Again");
        }
    }

    private static void printBoard(char[][] board) {
        System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("-+-+-");
        System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("-+-+-");
        System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
    }

    public static void placeMove(char[][] board, String position, char symbol) {
        switch (position) {
            case "1" -> board[0][0] = symbol;
            case "2" -> board[0][1] = symbol;
            case "3" -> board[0][2] = symbol;
            case "4" -> board[1][0] = symbol;
            case "5" -> board[1][1] = symbol;
            case "6" -> board[1][2] = symbol;
            case "7" -> board[2][0] = symbol;
            case "8" -> board[2][1] = symbol;
            case "9" -> board[2][2] = symbol;
            default -> System.out.println(":(");
        }
    }

    private static void winningOrLosingNotes(char[][] board, char symbol, String player) {
        if (hasContestantWon(board, symbol)) {
            System.out.println("Yay" + " " + player + " " + "You Have Won");
        } else if (isBoardFull(board)) {
            System.out.println("Sorry" + player + " " + "Match is Draw Please try Again");
        }
        printBoard(board);
    }

    private static boolean hasContestantWon(char[][] board, char symbol) {
        return (board[0][0] == symbol && board[0][1] == symbol && board[0][2] == symbol) ||
                (board[1][0] == symbol && board[1][1] == symbol && board[1][2] == symbol) ||
                (board[2][0] == symbol && board[2][1] == symbol && board[2][2] == symbol) ||

                (board[0][0] == symbol && board[1][0] == symbol && board[2][0] == symbol) ||
                (board[0][1] == symbol && board[1][1] == symbol && board[2][1] == symbol) ||
                (board[0][2] == symbol && board[1][2] == symbol && board[2][2] == symbol) ||

                (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) ||
                (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol);
    }

    private static boolean isBoardFull(char[][] seats) {
        final char EMPTY_SEAT = ' ';
        for (char[] seat : seats) {
            for (char c : seat) {
                if (c != EMPTY_SEAT) {
                    return false;
                }
            }
        }
        return true;
    }
}

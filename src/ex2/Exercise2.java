package ex2;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert a number:");
        int input = scanner.nextInt();
        System.out.println("Result: " + numToWord(input));

        scanner.close();
    }

    public static String numToWord(int num) {
        return switch (num) {
            case 0 -> "zero";
            case 1 -> "one";
            case 2 -> "two";
            case 3 -> "three";
            default -> "Invalid number (allowed: 0, 1, 2, 3).";
        };
    }
}

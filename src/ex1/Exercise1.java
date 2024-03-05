package ex1;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== evenOddString() =====");
        System.out.println("Insert a word:");
        String word = scanner.nextLine();
        System.out.println("Is \"" + word + "\" character length even? -> " + evenOddString(word));
        System.out.println("===== isLeap() =====");
        System.out.println("Insert a year:");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.println("Is year \"" + year + "\" leap? -> " + isLeap(year));

        scanner.close();
    }

    public static boolean evenOddString(String word) {
        return word.length() % 2 == 0;
    }

    public static boolean isLeap(int year) {
        if (year % 100 == 0) {
            return year % 400 == 0;
        } else return year % 4 == 0;
    }
}
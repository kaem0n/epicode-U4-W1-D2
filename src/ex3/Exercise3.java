package ex3;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String word;
        while (true) {
        System.out.println("Insert a word:");
        word = scanner.nextLine();
        if (word.equals(":q")) break;
        System.out.println("Result: " + divideInChars(word));
        }

        scanner.close();
    }

    public static String divideInChars(String word) {
        StringBuilder value = new StringBuilder();
        String[] wordSplit = word.split("");
        for (int i = 0; i < wordSplit.length; i++) {
            if (i == wordSplit.length - 1) value.append(wordSplit[i]);
            else value.append(wordSplit[i]).append(",");
        }
        return value.toString();
    }
}

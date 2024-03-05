package ex4;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Start a countdown from:");
        int num = scanner.nextInt();
        for (int i = num; i >= 0; i--) {
            System.out.println("Countdown: " + i);
        }

        scanner.close();
    }
}

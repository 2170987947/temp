package org.example.java21_0709;

import java.util.Random;
import java.util.Scanner;

public class guessNumGame {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random random = new Random();
        int toGuess = random.nextInt(100) + 1;
        while (s.hasNextInt()) {
            int num = s.nextInt();
            if (toGuess > num) {
                System.out.println("猜低了");
            } else if (toGuess < num) {
                System.out.println("猜高了");
            } else {
                System.out.println("猜对了");
            }
        }

    }
}

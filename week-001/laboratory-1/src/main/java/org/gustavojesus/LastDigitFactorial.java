package org.gustavojesus;

import java.util.Scanner;

public class LastDigitFactorial {

    // Method to compute the last digit of a factorial
    public static int lastDigitOfFactorial(int n) {
        if (n >= 5) {
            return 0; // All factorials from 5! onward end in 0
        } else {
            int[] lastDigits = {1, 1, 2, 6, 4}; // Precomputed last digits for 0! to 4!
            return lastDigits[n];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading the number of test cases
        System.out.print("Enter the number of test cases (1 < T < 10): ");
        int t = scanner.nextInt();

        if (t <= 1 || t >= 10) {
            System.out.println("Invalid number of test cases. T must be between 1 and 10.");
            return;
        }

        int[] results = new int[t];

        // Reading and processing each test case
        for (int i = 0; i < t; i++) {
            System.out.print("Enter a positive integer N: ");
            int n = scanner.nextInt();
            if (n < 0) {
                System.out.println("Invalid input. N must be positive.");
                return;
            }
            results[i] = lastDigitOfFactorial(n);
        }

        // Outputting the results
        System.out.println("Last digits of factorials:");
        for (int result : results) {
            System.out.println(result);
        }

        scanner.close();
    }
}

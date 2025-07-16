package org.gustavojesus;

import java.util.Scanner;

public class QuadrantSelection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading input coordinates
        System.out.print("Enter coordinate x (-1000 < x < 1000, x != 0): ");
        int x = scanner.nextInt();

        System.out.print("Enter coordinate y (-1000 < y < 1000, y != 0): ");
        int y = scanner.nextInt();

        // Validating coordinate range
        if (x <= -1000 || x >= 1000 || y <= -1000 || y >= 1000) {
            System.out.println("Invalid input: x and y must be between -1000 and 1000.");
        } else {
            // Determining the quadrant
            if (x > 0 && y > 0) {
                System.out.println("Quadrant 2");
            } else if (x < 0 && y > 0) {
                System.out.println("Quadrant 1");
            } else if (x < 0 && y < 0) {
                System.out.println("Quadrant 3");
            } else if (x > 0 && y < 0) {
                System.out.println("Quadrant 4");
            } else {
                System.out.println("Invalid input: coordinates cannot be zero.");
            }
        }

        scanner.close();
    }
}

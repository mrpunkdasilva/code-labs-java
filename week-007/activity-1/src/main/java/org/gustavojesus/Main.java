package org.gustavojesus;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

/**
 * This is the main class of the application, responsible for handling user input and displaying the distances based on the selected option.
 */
public class Main {

    /**
     * The main method that runs the application.
     *
     * @param args Command line arguments (not used in this application).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter display option using Streams:");
        System.out.println("1 - Simple");
        System.out.println("2 - Five Odd Distances");
        System.out.println("3 - Ascending Order");
        System.out.println("4 - Descending Order (show only distances)");

        int option = scanner.nextInt();
        try {
            List<Distance> distances = Utils.readDataset("src/main/resources/cidades.csv");

            switch (option) {
                case 1:
                    distances.forEach(System.out::println);
                    break;
                case 2:
                    distances.stream()
                            .filter(d -> d.getDistance() % 2 != 0)
                            .limit(5)
                            .forEach(System.out::println);
                    break;
                case 3:
                    distances.stream()
                            .sorted()
                            .forEach(System.out::println);
                    break;
                case 4:
                    distances.stream()
                            .sorted((d1, d2) -> Double.compare(d2.getDistance(), d1.getDistance()))
                            .map(Distance::getDistance)
                            .forEach(System.out::println);
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
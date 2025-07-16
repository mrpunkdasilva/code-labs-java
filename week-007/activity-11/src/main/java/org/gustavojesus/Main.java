package org.gustavojesus;

import java.util.*;

/**
 * The main class of the COVID-19 Data Analysis program.
 * It provides a menu-driven interface for users to interact with the CovidDataManager.
 */
public class Main {
    
     /**
      * The entry point of the program.
      */
     public static void main(String[] args) {
        // Create a CovidDataManager instance with the data file path
        CovidDataManager manager = new CovidDataManager("src/main/resources/covid_data.csv");
        
        // Create a Scanner instance for user input
        Scanner scanner = new Scanner(System.in);
        
        // Infinite loop for the menu
        while (true) {
            System.out.println("\nCOVID-19 Data Analysis - Rio de Janeiro");
            System.out.println("1. Show statistics");
            System.out.println("2. Add new record");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            // Read the user's choice
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            // Switch statement to handle the user's choice
            switch (choice) {
                case 1:
                    // Show statistics of COVID-19 data
                    manager.showStatistics();
                    break;
                case 2:
                    // Add a new record of COVID-19 data
                    manager.addNewRecord(scanner);
                    break;
                case 3:
                    // Exit the program
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;
                default:
                    // Invalid option, prompt the user to try again
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
    
}

package org.gustavojesus;

import java.util.*;

/**
 * Manages COVID-19 data for neighborhoods.
 */
class CovidDataManager {
    private List<Neighborhood> neighborhoods;
    private FileManager fileManager;

    /**
     * Constructs a new CovidDataManager object and initializes the neighborhoods list by loading data from the specified file.
     *
     * @param filePath The path to the file containing the COVID-19 data for neighborhoods.
     */
    public CovidDataManager(String filePath) {
        this.fileManager = new FileManager(filePath);
        this.neighborhoods = fileManager.loadFile();
    }

    /**
     * Displays statistics about the COVID-19 data for neighborhoods.
     * If no data is available, it prints a message indicating so.
     * Otherwise, it finds the neighborhood with the highest fatality rate and prints its name.
     */
    public void showStatistics() {
        if (neighborhoods.isEmpty()) {
            System.out.println("No data available.");
            return;
        }
        Neighborhood highestFatality = Collections.max(neighborhoods, Comparator.comparingDouble(Neighborhood::getFatalityRate));
        System.out.println("Neighborhood with highest fatality rate: " + highestFatality);
    }

    /**
     * Adds a new record of COVID-19 data for a neighborhood to the list and saves it to the file.
     * Prompts the user to enter the neighborhood name, confirmed cases, deaths, and date.
     *
     * @param scanner The Scanner object used to read user input.
     */
    public void addNewRecord(Scanner scanner) {
        System.out.print("Enter neighborhood name: ");
        String name = scanner.nextLine();

        System.out.print("Enter confirmed cases: ");
        int cases = scanner.nextInt();

        System.out.print("Enter deaths: ");
        int deaths = scanner.nextInt();

        scanner.nextLine(); // Consume newline

        System.out.print("Enter date (YYYY-MM-DD): ");
        String date = scanner.nextLine();

        Neighborhood newNeighborhood = new Neighborhood(name, cases, deaths, date);
        neighborhoods.add(newNeighborhood);
        fileManager.saveToFile(newNeighborhood);
        System.out.println("Record added successfully!");
    }
}
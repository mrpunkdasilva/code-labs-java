package org.gustavojesus;

import java.util.HashMap;

/**
 * The main entry point of the Brazilian Age Average application.
 * It initializes the necessary components and orchestrates their interactions.
 */
public class Main {
    public static void main(String[] args) {
        // Define the path to the research data file
        String filePath = "src/main/resources/research.csv";

        // Create an instance of LifeExpectancyCalculator to process the research data
        LifeExpectancyCalculator calculator = new LifeExpectancyCalculator(filePath);

        // Calculate the average life expectancy for each state
        HashMap<String, Double> lifeExpectancyMap = calculator.calculateAverages();

        // Create an instance of LifeExpectancyReport to generate a report based on the calculated averages
        LifeExpectancyReport report = new LifeExpectancyReport(lifeExpectancyMap);

        // Display the report
        report.displayReport();
    }
}
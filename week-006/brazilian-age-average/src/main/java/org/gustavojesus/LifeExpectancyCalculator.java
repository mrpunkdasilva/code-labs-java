package org.gustavojesus;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

/**
 * This class is responsible for calculating the average life expectancy for different regions.
 * The data for the life expectancy is read from a CSV file.
 */
class LifeExpectancyCalculator {
    private String filePath;

    /**
     * Constructor for the LifeExpectancyCalculator class.
     *
     * @param filePath The path to the CSV file containing the life expectancy data.
     */
    public LifeExpectancyCalculator(String filePath) {
        this.filePath = filePath;
    }

    /**
     * Calculates the average life expectancy for each region in the CSV file.
     *
     * @return A HashMap containing the region names as keys and their corresponding average life expectancy as values.
     */
    public HashMap<String, Double> calculateAverages() {
        HashMap<String, Double> lifeExpectancyMap = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line = br.readLine(); // Read the header and ignore it

            while ((line = br.readLine()) != null) {
                String[] data = line.split(";");
                String region = data[0];
                double sum = 0;
                int years = 0;

                for (int i = 1; i < data.length; i++) {
                    sum += Double.parseDouble(data[i]);
                    years++;
                }

                double average = sum / years;
                lifeExpectancyMap.put(region, average);
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }

        return lifeExpectancyMap;
    }
}
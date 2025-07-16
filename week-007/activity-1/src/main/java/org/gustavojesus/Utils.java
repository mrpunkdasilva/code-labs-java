package org.gustavojesus;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Reads a dataset from a CSV file and returns a list of Distance objects.
 *
 * @param fileName The path to the CSV file containing the dataset.
 *                 The CSV file should have three columns: origin, destination, and distance.
 *                 Each row represents a distance between two locations.
 *
 * @return A list of Distance objects, where each object represents a distance between two locations.
 *
 * @throws IOException If an error occurs while reading the file.
 */
public class Utils {
    public static List<Distance> readDataset(String fileName) throws IOException {
        List<Distance> distances = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String origin = parts[0].trim();
                String destination = parts[1].trim();
                double distance = Double.parseDouble(parts[2].trim());
                distances.add(new Distance(origin, destination, distance));
            }
        }
        return distances;
    }
}
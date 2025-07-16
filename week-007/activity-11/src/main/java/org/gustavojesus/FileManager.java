package org.gustavojesus;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * This class manages file operations related to neighborhood data.
 */
class FileManager {
    private String filePath;

    /**
     * Constructs a new FileManager object with the given file path.
     *
     * @param filePath The path to the file where neighborhood data is stored.
     */
    public FileManager(String filePath) {
        this.filePath = filePath;
    }

    /**
     * Loads neighborhood data from the file specified by the filePath.
     *
     * @return A list of Neighborhood objects containing the loaded data.
     */
    public List<Neighborhood> loadFile() {
        List<Neighborhood> neighborhoods = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 4) {
                    neighborhoods.add(new Neighborhood(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]), data[3]));
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return neighborhoods;
    }

    /**
     * Saves neighborhood data to the file specified by the filePath.
     *
     * @param neighborhood The Neighborhood object to be saved.
     */
    public void saveToFile(Neighborhood neighborhood) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true))) {
            bw.write(neighborhood.getName() + "," + neighborhood.getFatalityRate());
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Error saving file: " + e.getMessage());
        }
    }
}
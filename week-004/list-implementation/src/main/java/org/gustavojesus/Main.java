package org.gustavojesus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DuplicateList duplicateList = new DuplicateList();

        // Read input
        System.out.println("Enter the elements of the list (separated by space):");
        String input = scanner.nextLine();

        // Adding elements to the original list
        String[] elements = input.split(" ");
        for (String element : elements) {
            duplicateList.addElement(element);
        }

        // Process lists to remove duplicates
        duplicateList.processLists();

        // Print results
        System.out.println("Result (List 1): " + String.join(" ", duplicateList.getFilteredList()));
        System.out.println("Filtered (List 2): " + String.join(" ", duplicateList.getDuplicatesList()));

        scanner.close();
    }
}
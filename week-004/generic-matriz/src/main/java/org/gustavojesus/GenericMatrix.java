package org.gustavojesus;

import java.util.ArrayList;

class GenericMatrix<T> {
    private final ArrayList<ArrayList<T>> matrix;

    public GenericMatrix(int size) {
        matrix = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            matrix.add(new ArrayList<>());
            for (int j = 0; j < size; j++) {
                matrix.get(i).add(null); // Initialize with null
            }
        }
    }

    public void setElement(int row, int col, T value) {
        matrix.get(row).set(col, value);
    }

    public void displayMatrix() {
        System.out.println("Original Matrix:");
        for (ArrayList<T> row : matrix) {
            for (T element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public void displayMainDiagonal() {
        System.out.print("Main Diagonal: ");
        for (int i = 0; i < matrix.size(); i++) {
            System.out.print(matrix.get(i).get(i) + " ");
        }
        System.out.println();
    }

    public void displayTransposedMatrix() {
        System.out.println("Transposed Matrix:");
        int size = matrix.size();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix.get(j).get(i) + " ");
            }
            System.out.println();
        }
    }

    public int getSize() {
        return matrix.size();
    }
}
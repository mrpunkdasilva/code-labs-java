package org.gustavojesus;

public class Main {
    public static void main(String[] args) {
        // Example 1: Character Matrix
        System.out.println("Example 1: Character Matrix");
        GenericMatrix<Character> charMatrix = new GenericMatrix<>(3);
        Character[] charElements = {'a', 'b', 'c', 'd', 'r', 'f', 'g', 'h', 'i'};
        MatrixUtils.fillMatrix(charMatrix, charElements);

        charMatrix.displayMatrix();
        charMatrix.displayMainDiagonal();
        charMatrix.displayTransposedMatrix();

        System.out.println();

        // Example 2: Integer Matrix
        System.out.println("Example 2: Integer Matrix");
        GenericMatrix<Integer> intMatrix = new GenericMatrix<>(3);
        Integer[] intElements = {2, 3, 5, 7, 8, 9, 1, 5, 4};
        MatrixUtils.fillMatrix(intMatrix, intElements);

        intMatrix.displayMatrix();
        intMatrix.displayMainDiagonal();
        intMatrix.displayTransposedMatrix();
    }
}

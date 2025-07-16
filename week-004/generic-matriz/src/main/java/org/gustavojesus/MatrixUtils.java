package org.gustavojesus;

class MatrixUtils {
    public static <T> void fillMatrix(GenericMatrix<T> matrix, T[] elements) {
        int size = matrix.getSize();
        int index = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix.setElement(i, j, elements[index++]);
            }
        }
    }
}
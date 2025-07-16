package org.gustavojesus;

public class Main {
    public static void main(String[] args) {
        // Testing IntArray
        IntArray intArray = new IntArray(new Integer[]{2, 1, 6, 8, 3});
        intArray.sort();
        intArray.list(); // Output: [8, 6, 3, 2, 1]

        // Testing FloatArray
        FloatArray floatArray = new FloatArray(new Float[]{0.2f, 0.5f, 1.2f, 2.5f});
        floatArray.sort();
        floatArray.list(); // Output: [2.5, 1.2, 0.5, 0.2]

        // Testing DoubleArray
        DoubleArray doubleArray = new DoubleArray(new Double[]{0.1, 0.2});
        doubleArray.sort();
        doubleArray.list(); // Output: [0.2, 0.1]

        // Testing CharArray
        CharArray charArray = new CharArray(new Character[]{'n', 'v', 'd', 'a'});
        charArray.sort();
        charArray.list(); // Output: [v, n, d, a]
    }
}
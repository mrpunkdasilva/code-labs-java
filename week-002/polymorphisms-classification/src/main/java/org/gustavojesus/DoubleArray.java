package org.gustavojesus;

import java.util.Arrays;

class DoubleArray extends Array<Double> {
    public DoubleArray(Double[] elements) {
        super(elements);
    }

    @Override
    public void sort() {
        Arrays.sort(elements, (a, b) -> b.compareTo(a)); // Descending order
    }
}
package org.gustavojesus;

import java.util.Arrays;

class IntArray extends Array<Integer> {
    public IntArray(Integer[] elements) {
        super(elements);
    }

    @Override
    public void sort() {
        Arrays.sort(elements, (a, b) -> b.compareTo(a)); // Descending order
    }
}
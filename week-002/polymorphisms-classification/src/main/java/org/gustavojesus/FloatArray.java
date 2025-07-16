package org.gustavojesus;

import java.util.Arrays;

class FloatArray extends Array<Float> {
    public FloatArray(Float[] elements) {
        super(elements);
    }

    @Override
    public void sort() {
        Arrays.sort(elements, (a, b) -> b.compareTo(a)); // Descending order
    }
}

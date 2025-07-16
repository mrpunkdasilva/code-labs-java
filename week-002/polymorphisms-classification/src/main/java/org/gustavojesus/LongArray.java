package org.gustavojesus;

import java.util.Arrays;

class LongArray extends Array<Long> {
    public LongArray(Long[] elements) {
        super(elements);
    }

    @Override
    public void sort() {
        Arrays.sort(elements, (a, b) -> b.compareTo(a)); // Descending order
    }
}
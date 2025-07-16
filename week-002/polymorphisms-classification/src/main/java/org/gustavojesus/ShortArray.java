package org.gustavojesus;

import java.util.Arrays;

class ShortArray extends Array<Short> {
    public ShortArray(Short[] elements) {
        super(elements);
    }

    @Override
    public void sort() {
        Arrays.sort(elements, (a, b) -> b.compareTo(a)); // Descending order
    }
}

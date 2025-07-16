package org.gustavojesus;

import java.util.Arrays;

class ByteArray extends Array<Byte> {
    public ByteArray(Byte[] elements) {
        super(elements);
    }

    @Override
    public void sort() {
        Arrays.sort(elements, (a, b) -> b.compareTo(a)); // Descending order
    }
}
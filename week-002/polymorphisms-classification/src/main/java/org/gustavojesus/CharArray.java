package org.gustavojesus;

import java.util.Arrays;

class CharArray extends Array<Character> {
    public CharArray(Character[] elements) {
        super(elements);
    }

    @Override
    public void sort() {
        Arrays.sort(elements, (a, b) -> b.compareTo(a)); // Descending order
    }
}
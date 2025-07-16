package org.gustavojesus;

import java.util.Arrays;

abstract class Array<T extends Comparable<T>> {
    protected T[] elements;

    public Array(T[] elements) {
        this.elements = elements;
    }

    // Abstract method to sort
    public abstract void sort();

    // Method to list the elements
    public void list() {
        System.out.println(Arrays.toString(elements));
    }
}
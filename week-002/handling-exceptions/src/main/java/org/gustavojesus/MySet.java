package org.gustavojesus;

class MySet {
    private int[] elements;
    private int count;

    public MySet() {
        elements = new int[100]; // max 100 elements
        count = 0;
    }

    public void add(int value) throws ValueAlreadyExistsException, InvalidValueException {
        if (value < 0) {
            throw new InvalidValueException("Valor não pode ser negativo.");
        }

        if (count >= 100) {
            throw new InvalidValueException("A matriz já contém 100 elementos.");
        }

        for (int i = 0; i < count; i++) {
            if (elements[i] == value) {
                throw new ValueAlreadyExistsException("Este valor já existe: " + value);
            }
        }

        if (value > Short.MAX_VALUE) {
            throw new InvalidValueException("Valor é muito grande.");
        }

        // adiciona o novo valor ao conjunto
        elements[count++] = value;
    }
}
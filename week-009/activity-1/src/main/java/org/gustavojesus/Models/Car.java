package org.gustavojesus.Models;

import org.gustavojesus.Abstract.Vehicle;

/**
 * Represents a Car object, which is a type of Vehicle.
 */
public class Car extends Vehicle {

    /**
     * Constructs a new Car object with default values.
     */
    public Car() {
        super("Car", 500, 120);
    }
}
package org.gustavojesus.Models;

import org.gustavojesus.Abstract.Vehicle;

/**
 * Represents a motorcycle, which is a type of vehicle.
 *
 */
public class Motorcycle extends Vehicle {

    /**
     * Constructs a new Motorcycle object with default values.
     *
     * @see Vehicle#Vehicle(String, int, int)
     */
    public Motorcycle() {
        super("Motorcycle", 150, 150);
    }
}

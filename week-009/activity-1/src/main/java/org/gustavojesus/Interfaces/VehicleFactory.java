package org.gustavojesus.Interfaces;


import org.gustavojesus.Abstract.Vehicle;

/**
 * Factory Method: Interface for the vehicle factory.
 * This interface defines the contract for creating vehicles using the Factory Method pattern.
 */
public interface VehicleFactory {
    /**
     * Creates a new vehicle instance.
     *
     * @return A new {@link Vehicle} object.
     */
    Vehicle createVehicle();
}

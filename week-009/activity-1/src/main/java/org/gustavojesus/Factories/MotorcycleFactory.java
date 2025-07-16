package org.gustavojesus.Factories;

import org.gustavojesus.Abstract.Vehicle;
import org.gustavojesus.Interfaces.VehicleFactory;
import org.gustavojesus.Models.Motorcycle;

/**
 * Implementation of the factory for creating motorcycles.
 * This class implements the VehicleFactory interface to provide
 * a specific factory for creating Motorcycle objects.
 */
public class MotorcycleFactory implements VehicleFactory {
    
    /**
     * Creates a new Motorcycle object.
     * This method implements the createVehicle method from the VehicleFactory interface.
     *
     * @return A new instance of the Motorcycle class, which is a subclass of Vehicle.
     */
    @Override
    public Vehicle createVehicle() {
        return new Motorcycle();
    }
}
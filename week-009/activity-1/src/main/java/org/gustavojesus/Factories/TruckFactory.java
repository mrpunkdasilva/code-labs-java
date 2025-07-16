package org.gustavojesus.Factories;


import org.gustavojesus.Abstract.Vehicle;
import org.gustavojesus.Interfaces.VehicleFactory;
import org.gustavojesus.Models.Truck;

/**
 * Implementation of the factory for creating trucks.
 * This class implements the VehicleFactory interface to provide
 * a specific factory for creating Truck objects.
 */
public class TruckFactory implements VehicleFactory {
    
    /**
     * Creates a new Vehicle object of type Truck.
     * This method overrides the createVehicle method from the VehicleFactory interface.
     *
     * @return A new instance of the Truck class, which is a subclass of Vehicle.
     */
    @Override
    public Vehicle createVehicle() {
        return new Truck();
    }
}
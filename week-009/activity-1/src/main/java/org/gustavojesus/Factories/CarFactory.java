package org.gustavojesus.Factories;


import org.gustavojesus.Abstract.Vehicle;
import org.gustavojesus.Interfaces.VehicleFactory;
import org.gustavojesus.Models.Car;

/**
 * Implementation of the factory for creating cars.
 * This class implements the VehicleFactory interface to provide
 * a specific factory for creating Car objects.
 */
public class CarFactory implements VehicleFactory {
    
    /**
     * Creates a new Vehicle object of type Car.
     * This method overrides the createVehicle method from the VehicleFactory interface.
     *
     * @return A new instance of the Car class, which is a subclass of Vehicle.
     */
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}
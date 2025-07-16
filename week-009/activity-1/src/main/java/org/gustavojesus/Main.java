package org.gustavojesus;


import org.gustavojesus.Abstract.Vehicle;
import org.gustavojesus.Factories.CarFactory;
import org.gustavojesus.Factories.MotorcycleFactory;
import org.gustavojesus.Factories.TruckFactory;
import org.gustavojesus.Interfaces.VehicleFactory;
import org.gustavojesus.Strategies.FastNavigation;
import org.gustavojesus.Strategies.SafeNavigation;

public class Main {
     public static void main(String[] args) {
        // Creating vehicles using the Factory Method
        VehicleFactory truckFactory = new TruckFactory();
        Vehicle truck = truckFactory.createVehicle();

        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.createVehicle();

        VehicleFactory motorcycleFactory = new MotorcycleFactory();
        Vehicle motorcycle = motorcycleFactory.createVehicle();

        // Displaying vehicle information
        System.out.println("Truck Information:");
        truck.displayInformation();

        System.out.println("\nCar Information:");
        car.displayInformation();

        System.out.println("\nMotorcycle Information:");
        motorcycle.displayInformation();

        // Setting navigation strategies for the vehicles
        truck.setStrategy(new SafeNavigation());
        car.setStrategy(new FastNavigation());
        motorcycle.setStrategy(new FastNavigation());

        // Calculating routes
        String origin = "City A";
        String destination = "City B";

        System.out.println("\nTruck Route: " + truck.calculateRoute(origin, destination));
        System.out.println("Car Route: " + car.calculateRoute(origin, destination));
        System.out.println("Motorcycle Route: " + motorcycle.calculateRoute(origin, destination));
    }
}
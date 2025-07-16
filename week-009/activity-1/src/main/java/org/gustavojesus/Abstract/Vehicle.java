package org.gustavojesus.Abstract;


import org.gustavojesus.Interfaces.NavigationStrategy;

/**
 * Base class for vehicles.
 */
public abstract class Vehicle {
    private String type;
    private int cargoCapacity;
    private int maxSpeed;
    private NavigationStrategy strategy;

    /**
     * Constructs a new Vehicle with the specified type, cargo capacity, and maximum speed.
     *
     * @param type          The type of the vehicle.
     * @param cargoCapacity The cargo capacity of the vehicle.
     * @param maxSpeed      The maximum speed of the vehicle.
     */
    public Vehicle(String type, int cargoCapacity, int maxSpeed) {
        this.type = type;
        this.cargoCapacity = cargoCapacity;
        this.maxSpeed = maxSpeed;
    }

    /**
     * Returns the type of the vehicle.
     *
     * @return The type of the vehicle.
     */
    public String getType() {
        return type;
    }

    /**
     * Returns the cargo capacity of the vehicle.
     *
     * @return The cargo capacity of the vehicle.
     */
    public int getCargoCapacity() {
        return cargoCapacity;
    }

    /**
     * Returns the maximum speed of the vehicle.
     *
     * @return The maximum speed of the vehicle.
     */
    public int getMaxSpeed() {
        return maxSpeed;
    }

    /**
     * Sets the navigation strategy for the vehicle.
     *
     * @param strategy The navigation strategy to be set.
     */
    public void setStrategy(NavigationStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Calculates the route between the origin and destination using the set navigation strategy.
     *
     * @param origin      The starting point of the route.
     * @param destination The end point of the route.
     * @return A string representation of the calculated route, or a message if no strategy is defined.
     */
    public String calculateRoute(String origin, String destination) {
        if (strategy != null) {
            return strategy.calculateRoute(origin, destination);
        } else {
            return "No navigation strategy defined.";
        }
    }

    /**
     * Displays the basic information of the vehicle including type, cargo capacity, and maximum speed.
     */
    public void displayInformation() {
        System.out.println("Type: " + type);
        System.out.println("Cargo Capacity: " + cargoCapacity);
        System.out.println("Max Speed: " + maxSpeed);
    }
}
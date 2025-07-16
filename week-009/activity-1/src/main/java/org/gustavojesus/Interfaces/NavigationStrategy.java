package org.gustavojesus.Interfaces;

/**
 * Strategy interface for navigation strategies.
 * This interface defines the contract for calculating routes between two points.
 */
public interface NavigationStrategy {
    /**
     * Calculates a route between the given origin and destination.
     *
     * @param origin      The starting point of the route.
     * @param destination The end point of the route.
     * @return A String representation of the calculated route.
     */
    String calculateRoute(String origin, String destination);
}
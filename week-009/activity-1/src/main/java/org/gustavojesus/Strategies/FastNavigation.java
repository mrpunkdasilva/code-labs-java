package org.gustavojesus.Strategies;


import org.gustavojesus.Interfaces.NavigationStrategy;

/**
 * This class implements the {@link NavigationStrategy} interface and provides a strategy for calculating the fastest route.
 */
public class FastNavigation implements NavigationStrategy {

    /**
     * Calculates the fastest route from the given origin to the destination.
     *
     * @param origin      The starting point of the route.
     * @param destination The end point of the route.
     * @return A string representing the fastest route from the origin to the destination.
     */
    @Override
    public String calculateRoute(String origin, String destination) {
        return "Fastest route from " + origin + " to " + destination;
    }
}
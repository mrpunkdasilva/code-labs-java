package org.gustavojesus.Strategies;

import org.gustavojesus.Interfaces.NavigationStrategy;

/**
 * This class implements the {@link NavigationStrategy} interface and provides a safe navigation strategy.
 */
public class SafeNavigation implements NavigationStrategy {

    /**
     * Calculates the safest route between the given origin and destination.
     *
     * @param origin      The starting point of the route.
     * @param destination The end point of the route.
     * @return A string representing the safest route from the origin to the destination.
     */
    @Override
    public String calculateRoute(String origin, String destination) {
        return "Safest route from " + origin + " to " + destination;
    }
}
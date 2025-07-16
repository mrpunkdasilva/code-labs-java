package org.gustavojesus;

import java.util.Objects;

/**
 * Represents a distance between two locations.
 */
public class Distance implements Comparable<Distance> {
    private String origin;
    private String destination;
    private double distance;

    /**
     * Constructs a new Distance object.
     *
     * @param origin      the starting location
     * @param destination the ending location
     * @param distance    the distance between the two locations in kilometers
     */
    public Distance(String origin, String destination, double distance) {
        this.origin = origin;
        this.destination = destination;
        this.distance = distance;
    }

    /**
     * Returns the starting location.
     *
     * @return the origin
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Returns the ending location.
     *
     * @return the destination
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Returns the distance between the two locations in kilometers.
     *
     * @return the distance
     */
    public double getDistance() {
        return distance;
    }

    /**
     * Compares this object with the specified object for order.
     *
     * @param other the object to be compared
     * @return a negative integer, zero, or a positive integer as this object is less than, equal to, or greater than the specified object
     */
    @Override
    public int compareTo(Distance other) {
        return Double.compare(this.distance, other.distance);
    }

    /**
     * Returns a string representation of this object.
     *
     * @return a string representation of this object in the format "origin -> destination : distance km"
     */
    @Override
    public String toString() {
        return origin + " -> " + destination + " : " + distance + " km";
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     *
     * @param o the reference object with which to compare
     * @return {@code true} if this object is the same as the {@code o} argument; {@code false} otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Distance distanceObj = (Distance) o;
        return Double.compare(distanceObj.distance, distance) == 0 &&
                Objects.equals(origin, distanceObj.origin) &&
                Objects.equals(destination, distanceObj.destination);
    }

    /**
     * Returns a hash code value for the object.
     *
     * @return a hash code value for this object
     */
    @Override
    public int hashCode() {
        return Objects.hash(origin, destination, distance);
    }
}
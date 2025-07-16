package org.gustavojesus;

/**
 * Represents a data entry for life expectancy in a specific region.
 */
class LifeExpectancyData {
    private String region;
    private double average;

    /**
     * Constructs a new LifeExpectancyData object.
     *
     * @param region The name of the region.
     * @param average The average life expectancy in the region.
     */
    public LifeExpectancyData(String region, double average) {
        this.region = region;
        this.average = average;
    }

    /**
     * Returns the name of the region.
     *
     * @return The name of the region.
     */
    public String getRegion() {
        return region;
    }

    /**
     * Returns the average life expectancy in the region.
     *
     * @return The average life expectancy in the region.
     */
    public double getAverage() {
        return average;
    }
}
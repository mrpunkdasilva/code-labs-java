package org.gustavojesus;

/**
 * Represents a neighborhood with COVID-19 statistics.
 */
class Neighborhood {
    private String name;
    private int confirmedCases;
    private int deaths;
    private String date;

    /**
     * Constructs a new Neighborhood object.
     *
     * @param name The name of the neighborhood.
     * @param confirmedCases The number of confirmed COVID-19 cases.
     * @param deaths The number of deaths due to COVID-19.
     * @param date The date of the statistics.
     */
    public Neighborhood(String name, int confirmedCases, int deaths, String date) {
        this.name = name;
        this.confirmedCases = confirmedCases;
        this.deaths = deaths;
        this.date = date;
    }

    /**
     * Returns the name of the neighborhood.
     *
     * @return The name of the neighborhood.
     */
    public String getName() {
        return name;
    }

    /**
     * Calculates and returns the fatality rate of COVID-19 cases in the neighborhood.
     *
     * @return The fatality rate as a percentage. If there are no confirmed cases, returns 0.
     */
    public double getFatalityRate() {
        return confirmedCases == 0 ? 0 : (double) deaths / confirmedCases * 100;
    }

    /**
     * Returns a string representation of the neighborhood's COVID-19 statistics.
     *
     * @return A string in the format: "Neighborhood: Cases=X, Deaths=Y, Fatality Rate=Z.zz%"
     */
    @Override
    public String toString() {
        return name + ": Cases=" + confirmedCases + ", Deaths=" + deaths + ", Fatality Rate=" + String.format("%.2f", getFatalityRate()) + "%";
    }
}
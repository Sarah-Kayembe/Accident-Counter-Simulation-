/**
 * Assignment 4: Task 1
 * This file contains the definition of the AccidentReport class, which represents an accident report
 * with various attributes such as severity, location, weather conditions, etc.
 * 
 * DISCLAIMER: I utilized ChatGPT, Stack Overflow, GeeksforGeeks, and various other online resources
 * to develop this program and generate comments.
 * 
 * @author sarahkayembe
 * @version 1.0
 * 
 */

package accidentpack;

import java.time.LocalDateTime;

public class AccidentReport {
    private String ID;
    private int severity;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String street;
    private String city;
    private String county;
    private String state;
    private double temperature;
    private double humidity;
    private double visibility;
    private String weatherCondition;
    private boolean crossing;
    private String sunriseSunset;
    
   
    /**
     * Constructs an AccidentReport object with the specified attributes.
     *
     * @param ID               the ID of the accident report
     * @param severity         the severity of the accident
     * @param startTime        the start time of the accident
     * @param endTime          the end time of the accident
     * @param street           the street where the accident occurred
     * @param city             the city where the accident occurred
     * @param county           the county where the accident occurred
     * @param state            the state where the accident occurred
     * @param temperature      the temperature at the time of the accident
     * @param humidity         the humidity at the time of the accident
     * @param visibility       the visibility at the time of the accident
     * @param weatherCondition the weather condition at the time of the accident
     * @param crossing         whether there was a crossing involved in the accident
     * @param sunriseSunset    the sunrise/sunset time at the time of the accident
     */
    public AccidentReport(String ID, int severity, LocalDateTime startTime, LocalDateTime endTime, String street, String city, String county, String state, double temperature, double humidity, double visibility, String weatherCondition, boolean crossing, String sunriseSunset) {
        this.ID = ID;
        this.severity = severity;
        this.startTime = startTime;
        this.endTime = endTime;
        this.street = street;
        this.city = city;
        this.county = county;
        this.state = state;
        this.temperature = temperature;
        this.humidity = humidity;
        this.visibility = visibility;
        this.weatherCondition = weatherCondition;
        this.crossing = crossing;
        this.sunriseSunset = sunriseSunset;
    }

    /**
     * Retrieves the ID of the accident report.
     *
     * @return The ID of the accident report.
     */
    public String getID() {
        return ID;
    }

    /**
     * Sets the ID of the accident report.
     *
     * @param ID The ID to be set for the accident report.
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Retrieves the severity level of the accident.
     *
     * @return The severity level of the accident.
     */
    public int getSeverity() {
        return severity;
    }

    /**
     * Sets the severity level of the accident.
     *
     * @param severity The severity level to be set for the accident.
     */
    public void setSeverity(int severity) {
        this.severity = severity;
    }

    /**
     * Retrieves the start time of the accident.
     *
     * @return The start time of the accident.
     */
    public LocalDateTime getStartTime() {
        return startTime;
    }

    /**
     * Sets the start time of the accident.
     *
     * @param startTime The start time to be set for the accident.
     */
    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    /**
     * Retrieves the end time of the accident.
     *
     * @return The end time of the accident.
     */
    public LocalDateTime getEndTime() {
        return endTime;
    }

    /**
     * Sets the end time of the accident.
     *
     * @param endTime The end time to be set for the accident.
     */
    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    /**
     * Retrieves the street where the accident occurred.
     *
     * @return The street where the accident occurred.
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the street where the accident occurred.
     *
     * @param street The street to be set for the accident.
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * Retrieves the city where the accident occurred.
     *
     * @return The city where the accident occurred.
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the city where the accident occurred.
     *
     * @param city The city to be set for the accident.
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Retrieves the county where the accident occurred.
     *
     * @return The county where the accident occurred.
     */
    public String getCounty() {
        return county;
    }

    /**
     * Sets the county where the accident occurred.
     *
     * @param county The county to be set for the accident.
     */
    public void setCounty(String county) {
        this.county = county;
    }

    /**
     * Retrieves the state where the accident occurred.
     *
     * @return The state where the accident occurred.
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the state where the accident occurred.
     *
     * @param state The state to be set for the accident.
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Retrieves the temperature at the time of the accident.
     *
     * @return The temperature at the time of the accident.
     */
    public double getTemperature() {
        return temperature;
    }

    /**
     * Sets the temperature at the time of the accident.
     *
     * @param temperature The temperature to be set for the accident.
     */
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    /**
     * Retrieves the humidity at the time of the accident.
     *
     * @return The humidity at the time of the accident.
     */
    public double getHumidity() {
        return humidity;
    }

    /**
     * Sets the humidity at the time of the accident.
     *
     * @param humidity The humidity to be set for the accident.
     */
    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    /**
     * Retrieves the visibility at the time of the accident.
     *
     * @return The visibility at the time of the accident.
     */
    public double getVisibility() {
        return visibility;
    }

    /**
     * Sets the visibility at the time of the accident.
     *
     * @param visibility The visibility to be set for the accident.
     */
    public void setVisibility(double visibility) {
        this.visibility = visibility;
    }

    /**
     * Retrieves the weather condition at the time of the accident.
     *
     * @return The weather condition at the time of the accident.
     */
    public String getWeatherCondition() {
        return weatherCondition;
    }

    /**
     * Sets the weather condition at the time of the accident.
     *
     * @param weatherCondition The weather condition to be set for the accident.
     */
    public void setWeatherCondition(String weatherCondition) {
        this.weatherCondition = weatherCondition;
    }

    /**
     * Checks if there was a crossing involved in the accident.
     *
     * @return {@code true} if there was a crossing involved, {@code false} otherwise.
     */
    public boolean isCrossing() {
        return crossing;
    }

    /**
     * Sets whether there was a crossing involved in the accident.
     *
     * @param crossing {@code true} if there was a crossing involved, {@code false} otherwise.
     */
    public void setCrossing(boolean crossing) {
        this.crossing = crossing;
    }

    /**
     * Retrieves the sunrise/sunset time at the time of the accident.
     *
     * @return The sunrise/sunset time at the time of the accident.
     */
    public String getSunriseSunset() {
        return sunriseSunset;
    }

    /**
     * Sets the sunrise/sunset time at the time of the accident.
     *
     * @param sunriseSunset The sunrise/sunset time to be set for the accident.
     */
    public void setSunriseSunset(String sunriseSunset) {
        this.sunriseSunset = sunriseSunset;
    }

}


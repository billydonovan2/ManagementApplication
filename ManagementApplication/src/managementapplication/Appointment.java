/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managementapplication;

/**
 *
 * @author billy
 */
public class Appointment {
    private String description;
    int month;
    int day;
    int year;

    /**
     * Initializes appointment for a given date.
     *
     * @param year the year
     * @param month the month
     * @param day the day
     * @param description the text description of the appointment
     */
    public Appointment(String description, int month, int day, int year) {
        this.description = description;
        this.month = month;
        this.day = day;
        this.year = year;
    }

    /**
     * Returns the year of the appointment.
     *
     * @return the year
     */
   

    /**
     * Returns the month of the appointment.
     *
     * @return the month
     */
   

    /**
     * Returns the day of the appointment.
     *
     * @return the day
     */
    

    /**
     * Determines if the appointment is on the date given.
     *
     * @param year the year to check
     * @param month the month to check
     * @param day the day to check
     * @return true if the appointment matches all three parameters
     */
    public boolean occursOn(int month, int day, int year) {
         return (this.month == month && this.day == day && this.year == year);
    }
    public String returnDescription()
    {
        return description;

    /**
     * Converts appointment to string description.
     */
   
    }
}
    
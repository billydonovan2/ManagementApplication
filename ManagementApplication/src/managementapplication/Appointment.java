/* *******************************************************
* Student: [Nelson Costa]
* Email: [nvc5183@psu.edu]
* Project: [Management Application]
* *******************************************************/
package managementapplication;


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

    
    public boolean occursOn(int month, int day, int year) {
         return (this.month == month && this.day == day && this.year == year);
    }
    /**
     * Returns the year of the appointment.
     *
     * return the year
     
     /** Returns the month of the appointment.
     *
     * return the month
    
     /** Returns the day of the appointment.
     *
     * return the day
     
     /** Determines if the appointment is on the date given.
     * @return true if the appointment matches all three parameters
     /*/
    public String returnDescription()
    {
        return description;

    /**
     * Converts appointment to string description.
     /*/
   
    }
}


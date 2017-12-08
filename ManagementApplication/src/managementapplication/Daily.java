/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managementapplication;
import java.util.GregorianCalendar;
/**
 *
 * @author billy
 */
public class Daily extends Appointment {
    GregorianCalendar calendar = new GregorianCalendar();
    /**
     * Initializes appointment for a given date.
     *
     * @param year the year
     * @param month the month
     * @param day the day
     * @param description the text description of the appointment
     */
    public Daily(String description, int month, int day, int year) {
        super(description, month, day, year);
    }

    /**
     * Determines if the date is later than the appointment date
     *
     * @param year the year
     * @param month the month
     * @param day the day
     * @return true if base appointment is earlier than the appointment date
     */
    @Override
    public boolean occursOn(int month, int day, int year) {
         boolean print = false;
 
            if (this.year == year)
            {
                if (this.month <= month)
                {
                    if (this.month == month)
                    {
                        if (this.day <= day)
                        {
                            print = true;
                        }
                    }
                    else
                    {
                        print = true;
                    }
                }
                else
                {
                    print = true;
                }
            }
            else
            {
                print = true;
            }
        
        return print;
    
    }
}

/* *******************************************************
* Student: [Bill Donovan]
* Email: [wfd5035@psu.edu]
* Project: [Management Application]
* *******************************************************/
package managementapplication;
import java.util.GregorianCalendar;

public class Monthly extends Appointment {
     GregorianCalendar calendar = new GregorianCalendar();
    /**
     * Initializes appointment for a given date.
     *
     * @param year the year
     * @param month the month
     * @param day the day
     * @param description the text description of the appointment
     */
    public Monthly(String description, int month, int day, int year) {
        super(description, month, day, year);
    }
     public boolean occursOn(int month, int day, int year)
    {
        boolean print = false;
        if (this.day == day && this.year <= year)
        {
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
        }
        return print;
    }
}


    /**
     * Determines if the appointment occurs on the same day of the month.
     *
     * @param year the year
     * @param month the month
     * @param day the day
     * @return true if day matches the appointment date and is later than the
     * base appointment
     */
    
    

/* *******************************************************
* Student: [Bill Donovan]
* Email: [wfd5035@psu.edu]
* Project: [Management Application]
* *******************************************************/
package managementapplication;
import java.util.GregorianCalendar;

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

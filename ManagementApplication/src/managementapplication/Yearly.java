/* *******************************************************
* Student: [Nelson Costa]
* Email: [nvc5183@psu.edu]
* Project: [Management Application]
* *******************************************************/
package managementapplication;
import java.util.GregorianCalendar;
public class Yearly extends Appointment
{
        GregorianCalendar calendar = new GregorianCalendar();
    public Yearly(String description, int month, int day, int year)
    {
        super(description, month, day, year);
    }

    public boolean occursOn(int month, int day, int year)
    {
        return (this.day == day && this.month == month && year >= calendar.get(calendar.YEAR));
    }
}

/* *******************************************************
* Student: [Andrew Kim]
* Project: [Management Application]
* *******************************************************/
package managementapplication;
import java.util.GregorianCalendar;
public class OneTime extends Appointment
{
    GregorianCalendar calendar = new GregorianCalendar();
    public OneTime(String description, int month, int day, int year)
    {
        super(description, month, day, year);
    }

    public boolean occursOn(int month, int day, int year)
    {
        return (this.month == month && this.day == day && this.year == year && calendar.get(calendar.YEAR) >= year);
    }
}


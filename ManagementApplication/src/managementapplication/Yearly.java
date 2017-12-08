/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

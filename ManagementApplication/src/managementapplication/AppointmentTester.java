/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managementapplication;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
import java.util.GregorianCalendar;
/**
 *
 * @author billy
 */
public class AppointmentTester {
     public static void main(String[]args)
    {
        ArrayList<Appointment> list = new ArrayList<>();
         GregorianCalendar evansBirthday = new GregorianCalendar(8, 17, 2016);
        
        Scanner in = new Scanner(System.in);
        GregorianCalendar calendar = new GregorianCalendar();
        

        String command = "y";
        do
        {
            if (command.equals("y"))
            {
                System.out.println("--YOUR APPOINTMENT CALENDAR-- \n");// can use \n and ln a the same time !!!
                System.out.println("Please give date(mm dd yyyy): ");
                int month1 = in.nextInt();
                int day1 = in.nextInt();
                int year1 = in.nextInt();
                while (year1 < calendar.get(calendar.YEAR))
                {
                    System.out.println("Error, please try again: ");
                    month1 = in.nextInt();
                    day1 = in.nextInt();
                    year1 = in.nextInt();
                    while (month1 > 12 || month1 < 1 || day1 > 31 || day1 < 1)
                    {
                        System.out.println("Error, please try again: ");
                        month1 = in.nextInt();
                        day1 = in.nextInt();
                        year1 = in.nextInt();
                    }
                }

                System.out.println("Please give type (one time, daily, monthly, yearly): ");
                String type = in.next();
                System.out.println("Please give description of appointment: ");
                String text = in.next();
                if (type.equals("one time"))
                {
                    OneTime one = new OneTime(text, month1, day1, year1);
                    list.add(one);
                }
                if (type.equals("daily"))
                {
                    Daily one = new Daily(text, month1, day1, year1);
                    list.add(one);
                }
                if (type.equals("monthly"))
                {
                    Monthly one = new Monthly(text, month1, day1, year1);
                    list.add(one);
                }
                if (type.equals("yearly"))
                {
                    Yearly one = new Yearly(text, month1, day1, year1);
                    list.add(one);
                }
            }
            else
            {
                System.out.println("Please give date you want to check(mm dd yyyy): ");
                int month2 = in.nextInt();
                int day2 = in.nextInt();
                int year2 = in.nextInt();
                System.out.println("\n---------------------------\nAppointments for " + month2 + "/" + day2 + "/" + year2);
                int num = 1;
                for (int i = 0; i < list.size(); i++)
                {
                    if (list.get(i).occursOn(month2, day2, year2))
                    {
                        System.out.println(num + ". " + list.get(i).returnDescription());
                        num++;
                    }
                }
                System.out.println("---------------------------");
            }
            System.out.println("\nPress (y) to continue adding to list.\nPress (b) to browse.\nPress any othe key to quit: ");
            command = in.next();
            System.out.print('\f');
        }
        while (command.equals("y") || command.equals("b"));
    }
}
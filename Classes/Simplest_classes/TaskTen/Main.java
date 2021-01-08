package Classes.Simplest_classes.TaskTen;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static Classes.Simplest_classes.TaskTen.Airline.Aircraft.*;
import static Classes.Simplest_classes.TaskTen.Airline.DaysOfWeek.*;
import static Classes.Simplest_classes.TaskTen.AirlinesHolder.*;

public class Main {
    public static void main(String[] args) {
        Airline airline = new Airline("Talin", 842, Ty154, new GregorianCalendar(2021, Calendar.JANUARY, 25, 14, 27), Monday);
        Airline airline1 = new Airline("Talin", 916, AirbusA320, new GregorianCalendar(2021, Calendar.FEBRUARY , 2, 12,54), Tuesday);
        Airline airline2 = new Airline("Stockholm", 750, AirbusA320, new GregorianCalendar(2021, Calendar.JANUARY , 19,8,11), Monday);
        Airline airline3 = new Airline("Paris", 698, Boeing737, new GregorianCalendar(2021, Calendar.JANUARY , 18,11,14), Sunday);
        Airline airline4 = new Airline("London", 762, Boeing737, new GregorianCalendar(2021, Calendar.JANUARY , 18,12,18), Sunday);
        Airline airline5 = new Airline("Milan", 279, Ty154, new GregorianCalendar(2021, Calendar.JANUARY , 18,19,1), Sunday);
        getFlightByDestination("Talin");
        System.out.println();
        getFlightByDay(Monday);
        System.out.println();
        getFlightByDayAndTime(Sunday, new GregorianCalendar(2021,Calendar.JANUARY,18,12,0));


    }
}

package OOP.TaskThree;

import OOP.TaskThree.Almanac.DayOff;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static OOP.TaskThree.Almanac.DayOff.removeDayOff;
import static OOP.TaskThree.Almanac.DayOff.rescheduleDayOff;

public class Main {
    public static void main(String[] args) {
        DayOff day1 = new Almanac.Holiday(new GregorianCalendar(2021, Calendar.JANUARY,7), "Christmas");
        DayOff day2 = new Almanac.Holiday(new GregorianCalendar(2021, Calendar.FEBRUARY,14), "Valentines day");
        DayOff day3 = new Almanac.Holiday(new GregorianCalendar(2021, Calendar.MARCH,8), "Lady's day");
        DayOff day4 = new Almanac.Holiday(new GregorianCalendar(2021, Calendar.MAY,9), "WWII win day");
        DayOff day5 = new Almanac.Holiday(new GregorianCalendar(2021,Calendar.DECEMBER,31), "New Year");
        DayOff day6 = new Almanac.Weekend(new GregorianCalendar(2021, Calendar.JANUARY,23));
        DayOff day7 = new Almanac.Weekend(new GregorianCalendar(2021, Calendar.JANUARY,24));
        DayOff day8 = new Almanac.Weekend(new GregorianCalendar(2021, Calendar.JANUARY,30));
        DayOff day9 = new Almanac.Weekend(new GregorianCalendar(2021, Calendar.JANUARY,31));
        Almanac almanac = new Almanac(2021);
        almanac.getDaysOffInfo();
        removeDayOff(day4);
        rescheduleDayOff(day6, new Almanac.Weekend(new GregorianCalendar(2021, Calendar.MARCH, 6)));
        System.out.println();
        almanac.getDaysOffInfo();
    }
}

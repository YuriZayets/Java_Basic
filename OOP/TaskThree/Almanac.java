package OOP.TaskThree;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

public class Almanac {
    private int year;
    private static final DateFormat df = new SimpleDateFormat("dd MMM yyy");

    public static final HashMap<DayOff, Boolean> almanac = new HashMap<>();
    private static final ArrayList<DayOff> holidays = new ArrayList<>();
    private static final ArrayList<DayOff> weekends = new ArrayList<>();

    public Almanac(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void getDaysOffInfo() {
        for (DayOff dayOff : holidays) {
            almanac.put(dayOff, true);
        }
        for (DayOff dayOff : weekends) {
            almanac.put(dayOff, false);
        }
        for (HashMap.Entry<DayOff, Boolean> entry : almanac.entrySet()) {
            if (entry.getValue()) {
                System.out.println("Праздничный день " + df.format(entry.getKey().date.getTime()) + " : " + (entry.getKey().cause));
            } else System.out.println("Выходной " + df.format(entry.getKey().date.getTime()));
        }
        almanac.clear();
    }


    public static class DayOff {
        Calendar date;
        String cause;

        private DayOff(Calendar date) {
            this.date = date;
            addDayOff(this);
        }

        private DayOff(Calendar date, String cause) {
            this.date = date;
            this.cause = cause;
            addDayOff(this);
        }

        public static void addDayOff(DayOff dayOff) {
            if (dayOff instanceof Weekend) {
                weekends.add(dayOff);
            } else holidays.add(dayOff);
        }

        public static void rescheduleDayOff(DayOff oldDayOff, DayOff newDayOff) {
            if (oldDayOff instanceof Weekend && newDayOff instanceof Weekend) {
                weekends.set(weekends.indexOf(oldDayOff), newDayOff);
            } else if (oldDayOff instanceof Holiday && newDayOff instanceof Holiday) {
                holidays.set(holidays.indexOf(oldDayOff), newDayOff);
            } else if (oldDayOff instanceof Holiday && newDayOff instanceof Weekend) {
                holidays.remove(oldDayOff);
                weekends.add(newDayOff);
            } else {
                weekends.remove(oldDayOff);
                holidays.add(newDayOff);
            }
        }

        public static void removeDayOff(DayOff dayOff) {
            if (dayOff instanceof Weekend) {
                weekends.remove(dayOff);
            } else holidays.remove(dayOff);
        }
    }

    public static class Holiday extends DayOff {

        public Holiday(Calendar date, String cause) {
            super(date, cause);
        }

        public String getCause() {
            return cause;
        }
    }

    public static class Weekend extends DayOff {

        public Weekend(Calendar date) {
            super(date);
        }
    }

}

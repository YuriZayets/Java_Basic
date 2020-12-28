package Classes.Simplest_classes.TaskTen;

import java.util.Arrays;
import java.util.Calendar;

public class AirlinesHolder {
    public static Airline[] airlines;
    private static int size = 0;

    static public void add(Airline airline) {
        if (size > 0) {
            size++;
            airlines = Arrays.copyOf(airlines, size);
            airlines[size - 1] = airline;
        } else {
            airlines = new Airline[1];
            airlines[0] = airline;
            size++;
        }
    }

    static public void remove(int index) {
        if (index > 0 && index < airlines.length - 1) {
            System.arraycopy(airlines, index + 1, airlines, index, size - 1);
            size--;
        }
    }

    static public void remove(Airline airline) {
        for (int i = 0; i < airlines.length; i++) {
            if (airlines[i].equals(airline)) {
                remove(i);
            }
        }
    }

    static public Airline get(int index) {
        return airlines[index];
    }

    static public void set(int index, Airline airline) {
        airlines[index] = airline;
    }

    static public void getFlightByDestination (String target){
        for (Airline airline : airlines){
            if (airline.getDestination().equals(target)){
                System.out.println(airline);
            }
        }
    }

    static public void getFlightByDay (Airline.DaysOfWeek targetDay){
        for (Airline airline : airlines){
            if (airline.getDaysOfWeek().equals(targetDay)){
                System.out.println(airline);
            }
        }
    }

    static public void getFlightByDayAndTime (Airline.DaysOfWeek targetDay, Calendar time){
        for (Airline airline : airlines){
            if (airline.getDaysOfWeek().equals(targetDay)){
                if (time.before(airline.getDepartTime())){
                    System.out.println(airline);
                }
            }
        }
    }


}

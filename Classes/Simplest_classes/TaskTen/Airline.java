package Classes.Simplest_classes.TaskTen;

import java.util.Calendar;

public class Airline {

    public enum Aircraft {
        Ty154, AirbusA320, Boeing737
    }
    public enum DaysOfWeek {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
    }
    private String destination;
    private int flightNumber;
    private Aircraft aircraft;
    private Calendar departTime;
    private DaysOfWeek daysOfWeek;


    public Airline(String destination, int flightNumber, Aircraft aircraft, Calendar departTime, DaysOfWeek daysOfWeek) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.aircraft = aircraft;
        this.departTime = departTime;
        this.daysOfWeek = daysOfWeek;
        AirlinesHolder.add(this);
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    public Calendar getDepartTime() {
        return departTime;
    }

    public void setDepartTime(Calendar departTime) {
        this.departTime = departTime;
    }

    public DaysOfWeek getDaysOfWeek() {
        return daysOfWeek;
    }

    public void setDaysOfWeek(DaysOfWeek daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }

    @Override
    public String toString() {
        return "Airline " +
                "destination='" + destination + '\'' +
                ", flightNumber=" + flightNumber +
                ", aircraft=" + aircraft +
                ", departTime=" + departTime.getTime() +
                ", daysOfWeek=" + daysOfWeek +
                '}';
    }
}

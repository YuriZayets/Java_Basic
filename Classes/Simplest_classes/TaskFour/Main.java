package Classes.Simplest_classes.TaskFour;


import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Train[] trains = new Train[5];
        trains[0] = new Train("Колыма", 44, new GregorianCalendar(2021, Calendar.JULY, 25));
        trains[1] = new Train("Саранск", 18, new GregorianCalendar(2021, Calendar.JUNE, 19));
        trains[2] = new Train("Сызрань", 27, new GregorianCalendar(2021, Calendar.MARCH, 11));
        trains[3] = new Train("Саранск", 4, new GregorianCalendar(2021, Calendar.JANUARY, 4));
        trains[4] = new Train("Саранск", 15, new GregorianCalendar(2021, Calendar.SEPTEMBER, 7));
        System.out.println(Arrays.toString(trains));
        Train.sortByNumber(trains);
        System.out.println(Arrays.toString(trains));
    }
}

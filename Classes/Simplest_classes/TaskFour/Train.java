package Classes.Simplest_classes.TaskFour;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;

public class Train {
    String destination;
    int number;
    Calendar departTime;

    public Train(String destination, int number, Calendar departTime) {
        this.destination = destination;
        this.number = number;
        this.departTime = departTime;
    }

    static public Train[] sortByNumber(Train... trains) {
        Arrays.sort(trains, Comparator.comparing(t -> t.number));
        return trains;
    }

    static public Train[] sortByDestination(Train... trains) {
        Arrays.sort(trains, Comparator.comparing(t -> t.destination));
        Train temp;
        for (int i = 0; i < trains.length - 1; i++) {
            for (int j = 0; j < trains.length - i - 1; j++) {
                if (trains[j].destination.equals(trains[j + 1].destination)) {
                    if (trains[j].departTime.getTime().compareTo(trains[j + 1].departTime.getTime()) > 0) {
                        temp = trains[j + 1];
                        trains[j + 1] = trains[j];
                        trains[j] = temp;
                    }
                }
            }
        }
        return trains;
    }

    public void getInfoByNumber(int number, Train... trains) {
        for (Train train : trains) {
            if (train.number == number) {
                System.out.println(train);
            }
        }
    }

    @Override
    public String toString() {
        return "\nПоезд под номером " + number + " отправится в " + destination + " в " + departTime.getTime();
    }
}

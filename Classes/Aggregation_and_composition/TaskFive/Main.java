package Classes.Aggregation_and_composition.TaskFive;

import static Classes.Aggregation_and_composition.TaskFive.Holder.*;
import static Classes.Aggregation_and_composition.TaskFive.Tour.Feeding.*;
import static Classes.Aggregation_and_composition.TaskFive.Tour.Type.*;
import static Classes.Aggregation_and_composition.TaskFive.Tour.Direction.*;
import static Classes.Aggregation_and_composition.TaskFive.Tour.Days.*;
import static Classes.Aggregation_and_composition.TaskFive.Tour.Transport.*;

public class Main {
    public static void main(String[] args) {
        Filler.fill(); //заполнение списка туров 5000 случайных
        getToursByVariousParameters(FRANCE, SHOPPING, THREE_MEALS, Six);
    }
}

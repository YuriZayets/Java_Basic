package Classes.Aggregation_and_composition.TaskFive;

import static Classes.Aggregation_and_composition.TaskFive.Tour.*;

import java.util.Random;

public class Filler {
    private static boolean isFilled;
    static Random random = new Random();

    public static void fill() {
        if (!isFilled) {
            for (int i = 0; i < 5000; i++) {
                Tour tour = new Tour(
                        getRandomDirection(),
                        getRandomType(),
                        getRandomTransport(),
                        getRandomFeeding(),
                        getRandomDays()
                );
                Holder.add(tour);
            }
            isFilled = true;
        } else System.out.println("Already filled");
    }


    private static Direction getRandomDirection() {
        return Direction.values()[random.nextInt(Direction.values().length)];
    }

    private static Type getRandomType() {
        return Type.values()[random.nextInt(Type.values().length)];
    }

    private static Transport getRandomTransport() {
        return Transport.values()[random.nextInt(Transport.values().length)];
    }

    private static Feeding getRandomFeeding() {
        return Feeding.values()[random.nextInt(Feeding.values().length)];
    }

    private static Days getRandomDays() {
        return Days.values()[random.nextInt(Days.values().length)];
    }
}

package Classes.Aggregation_and_composition.TaskFive;

import static Classes.Aggregation_and_composition.TaskFive.Tour.*;

import java.util.ArrayList;

public class Holder {
    private static final ArrayList<Tour> tours = new ArrayList<>();

    public static void add(Tour tour) {
        tours.add(tour);
    }

    public static void getToursByDestination(Direction direction) {
        for (Tour tour : tours) {
            if (tour.direction == direction) {
                System.out.println(tour);
            }
        }
    }

    public static void getToursByType(Type type) {
        for (Tour tour : tours) {
            if (tour.type == type) {
                System.out.println(tour);
            }
        }
    }

    public static void getToursByTransport(Transport transport) {
        for (Tour tour : tours) {
            if (tour.transport == transport) {
                System.out.println(tour);
            }
        }
    }

    public static void getToursByFeeding(Feeding feeding) {
        for (Tour tour : tours) {
            if (tour.feeding == feeding) {
                System.out.println(tour);
            }
        }
    }

    public static void getToursByDays(Days days) {
        for (Tour tour : tours) {
            if (tour.days == days) {
                System.out.println(tour);
            }
        }
    }

    public static void getToursByVariousParameters(Direction direction, Type type, Transport transport, Feeding feeding, Days days) {
        for (Tour tour : tours) {
            if (tour.direction == direction &&
                    tour.type == type &&
                    tour.transport == transport &&
                    tour.feeding == feeding &&
                    tour.days == days) {
                System.out.println(tour);
            }
        }
    }

    public static void getToursByVariousParameters(Direction direction, Transport transport, Feeding feeding, Days days) {
        for (Tour tour : tours) {
            if (tour.direction == direction &&
                    tour.transport == transport &&
                    tour.feeding == feeding &&
                    tour.days == days) {
                System.out.println(tour);
            }
        }
    }

    public static void getToursByVariousParameters(Direction direction, Type type, Feeding feeding, Days days) {
        for (Tour tour : tours) {
            if (tour.direction == direction &&
                    tour.type == type &&
                    tour.feeding == feeding &&
                    tour.days == days) {
                System.out.println(tour);
            }
        }
    }

    public static void getToursByVariousParameters(Direction direction, Feeding feeding, Days days) {
        for (Tour tour : tours) {
            if (tour.direction == direction &&
                    tour.feeding == feeding &&
                    tour.days == days) {
                System.out.println(tour);
            }
        }
    }

    public static void getToursByVariousParameters(Type type, Feeding feeding, Days days) {
        for (Tour tour : tours) {
            if (tour.type == type &&
                    tour.feeding == feeding &&
                    tour.days == days) {
                System.out.println(tour);
            }
        }
    }
}

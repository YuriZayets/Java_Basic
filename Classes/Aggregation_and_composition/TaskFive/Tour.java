package Classes.Aggregation_and_composition.TaskFive;

public class Tour {

    enum Direction {
        TURKEY("Turkey"),
        EGYPT("Egypt"),
        BULGARIA("Bulgaria"),
        FRANCE("France"),
        THAILAND("Thailand");

        private final String direction;

        Direction(String direction) {
            this.direction = direction;
        }

        public String getDirection() {
            return direction;
        }
    }

    enum Type {
        REST("Rest"),
        EXCURSION("Excursion"),
        TREATMENT("Treatment"),
        SHOPPING("Shopping"),
        CRUISE("Cruise"),
        ALCOTOURISM("Alcotourism");

        private final String type;

        Type(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }
    }

    enum Transport {
        BUS("Bus"),
        TRAIN("Train"),
        PLAIN("Plain"),
        SHIP("Ship");

        private final String transport;

        Transport(String transport) {
            this.transport = transport;
        }

        public String getTransport() {
            return transport;
        }
    }

    enum Feeding {
        BUFFET("Buffet"),
        THREE_MEALS("Three meals"),
        TWO_MEALS("Two meals"),
        BREAKFAST_ONLY("Breakfast only"),
        NO_FOOD_INCLUDED("No food included");

        private final String feeding;

        Feeding(String feeding) {
            this.feeding = feeding;
        }

        public String getFeeding() {
            return feeding;
        }
    }

    enum Days {
        Two(2),
        Six(6),
        Ten(10),
        Twelve(12),
        Fourteen(14);

        private final int days;

        Days(int days) {
            this.days = days;
        }

        public int getDays() {
            return days;
        }
    }

    Direction direction;
    Type type;
    Transport transport;
    Feeding feeding;
    Days days;
    int number;
    static int count = 0;


    public Tour(Direction direction, Type type, Transport transport, Feeding feeding, Days days) {
        this.direction = direction;
        this.type = type;
        this.transport = transport;
        this.feeding = feeding;
        this.days = days;
        this.number = count;
        count++;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "#" + number +
                ", " + direction.getDirection() +
                ", " + type.getType() +
                ", by " + transport.getTransport() +
                ", " + feeding.getFeeding() +
                ", days: " + days.getDays() +
                '}';
    }
}

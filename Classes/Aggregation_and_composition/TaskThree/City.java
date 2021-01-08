package Classes.Aggregation_and_composition.TaskThree;

public class City {
    String name;
    int citizens;

    public City(String name, int citizens) {
        this.name = name;
        this.citizens = citizens;
    }

    @Override
    public String toString() {
        return name;
    }
}

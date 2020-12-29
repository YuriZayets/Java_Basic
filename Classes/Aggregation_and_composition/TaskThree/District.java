package Classes.Aggregation_and_composition.TaskThree;

public class District {
    City[] cities;
    double area;


    public District(double area, City ... cities) {
        this.cities = cities;
        this.area = area;
    }
}

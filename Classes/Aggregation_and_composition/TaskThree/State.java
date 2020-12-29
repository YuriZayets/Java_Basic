package Classes.Aggregation_and_composition.TaskThree;

public class State {
    Region[] regions;
    City capital;
    double area;

    public State(City capital, Region... regions) {
        this.regions = regions;
        this.capital = capital;
        for (Region region : regions) {
            area += region.area;
        }
    }

    public void printCapital() {
        System.out.println("Столица " + capital);
    }

    public void printRegionsNumber() {
        System.out.println("Количество областных центров " + regions.length);
    }

    public void printArea() {
        System.out.println(area);
    }

    public void printRegions() {
        System.out.println("Областные центры :");
        for (Region region : regions){
            System.out.println(region.regional_center + " с населением " + region.regional_center.citizens);
        }
    }
}

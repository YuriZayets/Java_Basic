package Classes.Aggregation_and_composition.TaskThree;

public class Region {
    String name;
    District[] districts;
    City regional_center;
    double area;

    public Region(String name, City regional_center, District... districts) {
        this.name = name;
        this.districts = districts;
        this.regional_center = regional_center;
        for (District district : districts){
            area += district.area;
        }
    }
}

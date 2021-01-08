package Classes.Aggregation_and_composition.TaskThree;

public class Main {
    public static void main(String[] args) {
        City city = new City("Ночьск", 800);
        City city1 = new City("Улицск", 836);
        City city2 = new City("Фонарьск", 120);
        City city3 = new City("Бессмесленск", 777);
        City city4 = new City("Тусклосветск", 438);
        City city5 = new City("Живетск", 208);
        City city6 = new City("Четвертьветск", 567);
        City city7 = new City("Всёбудеттацс", 423);
        City city8 = new City("Исходанетск", 345);
        District district = new District(597, city, city1, city2);
        District district1 = new District(358, city3, city4, city5);
        District district2 = new District(831, city6, city7, city8);
        Region region = new Region("Аптекский", city, district, district1);
        Region region1 = new Region("Улицкий", city3, district1, district2);
        Region region2 = new Region("Фонарский", city6, district2, district);
        State state = new State(city3, region, region1, region2);
        state.printArea();
        System.out.println();
        state.printCapital();
        System.out.println();
        state.printRegions();
        System.out.println();
        state.printRegionsNumber();


    }
}

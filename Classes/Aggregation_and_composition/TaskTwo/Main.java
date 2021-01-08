package Classes.Aggregation_and_composition.TaskTwo;

import static Classes.Aggregation_and_composition.TaskTwo.Car.wheelPosition.*;

public class Main {
    public static void main(String[] args) {
        Wheel wheel1 = new Wheel(16, false);
        Wheel wheel2 = new Wheel(16, false);
        Wheel wheel3 = new Wheel(16, false);
        Wheel wheel4 = new Wheel(16, false);
        Engine engine = new Engine(2.2, 180, 9.6);
        Car car = new Car("Volvo", 60, 20,wheel1, wheel2, wheel3, wheel4, engine);
        car.move(10);
        car.refuel(47);
        car.getBrand();
        Wheel extraWheel = new Wheel(16, true);
        car.changeWheel(extraWheel, BL);
        car.move(200);

    }
}

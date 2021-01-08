package Classes.Aggregation_and_composition.TaskTwo;

public class Car {
    public enum wheelPosition {FL, FR, BL, BR}
    String brand;
    double gas_capacity;
    double gas_level;
    Wheel wheelFL;
    Wheel wheelFR;
    Wheel wheelBL;
    Wheel wheelBR;
    Engine engine;

    public Car(String brand, double gas_capacity, double gas_level, Wheel wheelFL, Wheel wheelFR, Wheel wheelBL, Wheel wheelBR, Engine engine) {
        this.brand = brand;
        this.gas_capacity = gas_capacity;
        this.gas_level = gas_level;
        this.wheelFL = wheelFL;
        this.wheelFR = wheelFR;
        this.wheelBL = wheelBL;
        this.wheelBR = wheelBR;
        this.engine = engine;
    }

    public void move (double distance){
         while ( distance > 0 && gas_level > 0){
           gas_level -= engine.gas_mileage / 100;
           distance -= 1;
         }
         if (distance <=0 ) {
             System.out.println("Приехали! Осталось " + gas_level + " литров топлива");
         } else System.out.println("Топлива не хватило, не доехали " + distance + " километров");
    }

    public void refuel (double amount) {
        if ((gas_level + amount) > gas_capacity){
            double excess = gas_capacity - gas_level - amount;
            System.out.printf("В бак не поместилось %.2f литров бензина, он вылился из бака и загрязнил природу, Вы плохой человек\n", Math.abs(excess));
        } else {
            gas_level += amount;
            System.out.println("Бак успешно заправлен, текущий уровень " + gas_level);
        }
    }

    public void getBrand () {
        System.out.println(brand);
    }

    public void changeWheel (Wheel wheel, wheelPosition wheelPosition){
        switch (wheelPosition){
            case FR:
                wheelFR = wheel;
                System.out.println("Заменено переднее правое колесо");
                break;
            case FL:
                wheelFL = wheel;
                System.out.println("Заменено переднее левое колесо");
                break;
            case BR:
                wheelBR = wheel;
                System.out.println("Заменено заднее правое колесо");
                break;
            case BL:
                wheelBL = wheel;
                System.out.println("Заменено заднее левое колесо");
                break;
        }
    }


}

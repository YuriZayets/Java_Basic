package Classes.Simplest_classes.TaskEight;

import static Classes.Simplest_classes.TaskEight.CustomerHolder.*;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Ivanov", "Ivan", "Ivanovich", "Minsk", 2020327, 1546564);
        Customer customer1 = new Customer("Fedorov", "Fedor", "Fedorovich", "Minsk", 2020326, 15454344);
        Customer customer2 = new Customer("Petrov", "Petr", "Petrovich", "Minsk", 2020325, 1548664);
        Customer customer3 = new Customer("Alexin", "Evgenii", "Evgenovitch", "Minsk", 2020324, 154634534);
        Customer customer4 = new Customer("Einstein", "Anjela", "Vnezapnovna", "Minsk", 2020323, 1546324364);
        Customer customer5 = new Customer("Vodovorot", "Ivan", "H2ovich", "Minsk", 2020322, 154876564);
        getCustomersSortedByName();
        System.out.println();
        getCustomersWithCardInRange(2020325, 2020326);
    }
}

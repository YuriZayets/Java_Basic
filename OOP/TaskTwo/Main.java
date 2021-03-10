package OOP.TaskTwo;

import OOP.TaskTwo.Products.Household;
import OOP.TaskTwo.Products.Product;
import OOP.TaskTwo.Products.Renovation;
import OOP.TaskTwo.Products.Technics;

import static OOP.TaskTwo.Payment.*;
import static OOP.TaskTwo.ProductHolder.addToTheStock;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Technics("Vacuum cleaner", 37);
        addToTheStock(product1, 10);
        Product product2 = new Technics("Washing machine", 67);
        addToTheStock(product2, 2);
        Product product3 = new Technics("Refrigerator", 87);
        addToTheStock(product3, 1);
        Product product4 = new Household("Grill", 74);
        addToTheStock(product4, 4);
        Product product5 = new Household("Curbstone", 63);
        addToTheStock(product5, 2);
        Product product6 = new Household("Painting", 16);
        addToTheStock(product6, 1);
        Product product7 = new Renovation("Roller", 4);
        addToTheStock(product7, 8);
        Product product8 = new Renovation("Wall paper", 23);
        addToTheStock(product8, 7);
        Product product9 = new Renovation("Concrete", 14);
        addToTheStock(product9, 2);
        Payment payment = new Payment(product4, product6, product8);
    }
}

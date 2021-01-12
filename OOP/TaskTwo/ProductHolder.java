package OOP.TaskTwo;

import OOP.TaskTwo.Products.Household;
import OOP.TaskTwo.Products.Product;
import OOP.TaskTwo.Products.Renovation;
import OOP.TaskTwo.Products.Technics;

import java.util.HashMap;
import java.util.Map;

public class ProductHolder {

    public static final Map<Product, Integer> products = new HashMap<>();

    public static void addToTheStock(Product product, int quantity) {
        products.put(product, quantity);
    }

    public static void decreaseAmountInTheStock(Product product, int quantity) {
        products.put(product, (Math.max((products.get(product) - quantity), 0)));
        if (products.get(product) == 0) System.out.println("Message for staff :" + "Товар " + product.getTag() + " закончился, пополните запас");
    }

}



package Classes.Simplest_classes.TaskEight;

import java.util.Arrays;
import java.util.Comparator;

public class CustomerHolder {
    public static Customer[] customers;
    private static int size = 0;

    static public void add(Customer customer) {
        if (size > 0) {
            size++;
            customers = Arrays.copyOf(customers, size);
            customers[size-1] = customer;
        } else {
            customers = new Customer[1];
            customers[0] = customer;
            size++;
        }
    }

    static public void remove(int index) {
        if (index > 0 && index < customers.length - 1) {
            System.arraycopy(customers, index + 1, customers, index, size - 1);
            size--;
        }
    }

    static public void remove(Customer customer) {
        for (int i = 0; i < customers.length; i++) {
            if (customers[i].equals(customer)) {
                remove(i);
            }
        }
    }

    static public Customer get(int index) {
        return customers[index];
    }

    static public void set(int index, Customer customer) {
        customers[index] = customer;
    }

    static public void getCustomersSortedByName (){
        Customer[] sortedCustomers = Arrays.copyOf(customers, size);
        Arrays.sort(sortedCustomers, Comparator.comparing(Customer::getSurname));
        for (Customer customer: sortedCustomers) {
            System.out.println(customer);
        }
    }

    static public void getCustomersWithCardInRange (int min, int max){
        for (Customer customer: customers) {
            if (customer.getCardNumber() >= min && customer.getCardNumber() <= max)
            System.out.println(customer);
        }
    }
}

package OOP.TaskTwo;

import OOP.TaskTwo.Products.Product;

import static OOP.TaskTwo.Payment.Transaction.makeTransaction;

public class Payment {
    private static int purchase;

    public Payment(Product ... products){
        System.out.println("Вы приобретаете следующие товары");
        for (Product product : products){
            System.out.println(product);
            purchase += product.getPrice();
        }
        System.out.println("Вы будете перенаправлены на страницу оплаты");
        if (makeTransaction(purchase)){
            System.out.println("Оплата успешно произведена");
            for (Product product : products){
                ProductHolder.decreaseAmountInTheStock(product, 1);
            }
        } else {
            System.out.println("Оплата не была произведена, попробуйте снова");
        }
        purchase = 0;
    }

    static class Transaction {

        public static boolean makeTransaction (int price) {
            System.out.println("Отправляем запрос в банк");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                return false;
            }
            return true;
        }
    }
}

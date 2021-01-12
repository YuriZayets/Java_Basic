package OOP.TaskTwo.Products;

public class Product {
    private String tag;
    private int price;

    protected Product(String tag, int price) {
        this.tag = tag;
        this.price = price;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        if (tag != null && !tag.equals("")) {
            this.tag = tag;
        } else this.tag = "Please contact manager";
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price > 0) {
            this.price = price;
        } else this.price = 1;
    }

    @Override
    public String toString() {
        return tag + " стоимостью " + price;
    }
}

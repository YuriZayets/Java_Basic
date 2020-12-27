package Classes.Simplest_classes.TaskNine;

import java.util.Arrays;
import java.util.UUID;

public class Book {

    public enum Binding{
        hardcover, softcover, integral_binding
    }

    private String id;
    private String title;
    private String[] authors;
    private String publisher;
    private int yearOfPublish;
    private int pages;
    private int price;
    private Binding binding;

    public Book(String title, String[] authors, String publisher, int yearOfPublish, int pages, int price, Binding binding) {
        this.id = UUID.randomUUID().toString();
        this.title = title;
        this.authors = authors;
        this.publisher = publisher;
        this.yearOfPublish = yearOfPublish;
        this.pages = pages;
        this.price = price;
        this.binding = binding;
        BookHolder.add(this);
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYearOfPublish() {
        return yearOfPublish;
    }

    public void setYearOfPublish(int yearOfPublish) {
        this.yearOfPublish = yearOfPublish;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Binding getBinding() {
        return binding;
    }

    public void setBinding(Binding binding) {
        this.binding = binding;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", publisher='" + publisher + '\'' +
                ", yearOfPublish='" + yearOfPublish + '\'' +
                ", pages=" + pages +
                ", price=" + price +
                ", binding='" + binding + '\'' +
                '}';
    }
}

package Classes.Simplest_classes.TaskNine;

import java.util.Arrays;

import static Classes.Simplest_classes.TaskNine.Book.Binding.*;
import static Classes.Simplest_classes.TaskNine.BookHolder.*;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Happy Potter", new String[]{"Rowling"}, "idk", 1996, 308, 50, integral_binding);
        Book book1 = new Book("War and Peace", new String[]{"Tolstoy"}, "idk", 1850, 561, 60, hardcover);
        Book book2 = new Book("Burn", new String[]{"Rowling"}, "Unity", 1900, 273, 55, hardcover);
        Book book3 = new Book("Random book", new String[]{"Dostoevsky", "Tolstoy"}, "idk", 1888, 222, 40, softcover);
        Book book4 = new Book("Not even a real book", new String[]{"FakeWriter"}, "Unity", 1999, 314, 37, softcover);
        getBookOfAuthor("Rowling");
        System.out.println();
        getBooksPublishedAfter(1901);
        System.out.println();
        getPublisherBooks("Unity");
    }
}

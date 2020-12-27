package Classes.Simplest_classes.TaskNine;

import java.util.Arrays;

public class BookHolder {

    public static Book[] books;
    private static int size = 0;

    static public void add(Book book) {
        if (size > 0) {
            size++;
            books = Arrays.copyOf(books, size);
            books[size - 1] = book;
        } else {
            books = new Book[1];
            books[0] = book;
            size++;
        }
    }

    static public void remove(int index) {
        if (index > 0 && index < books.length - 1) {
            System.arraycopy(books, index + 1, books, index, size - 1);
            size--;
        }
    }

    static public void remove(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].equals(book)) {
                remove(i);
            }
        }
    }

    static public Book get(int index) {
        return books[index];
    }

    static public void set(int index, Book book) {
        books[index] = book;
    }

    static public void getBookOfAuthor(String writer) {
        for (Book book : books) {
            for (String author : book.getAuthors()) {
                if (author.equals(writer)) {
                    System.out.println(book);
                }
            }
        }
    }

    static public void getPublisherBooks(String publisher) {
        for (Book book : books) {
            if (book.getPublisher().equals(publisher)) {
                System.out.println(book);
            }
        }
    }

    static public void getBooksPublishedAfter(int year) {
        for (Book book : books) {
            if (book.getYearOfPublish() >= year) {
                System.out.println(book);
            }
        }
    }

}

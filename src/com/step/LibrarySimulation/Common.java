package com.step.LibrarySimulation;

import java.util.ArrayList;
import java.util.List;

public class Common {
    private final List<Book> books = new ArrayList<>();

    public Common() {

    }

    protected Book getBookByName(String nameOfBook) {
        for (Book book : this.books) {
            if (isSameBook(nameOfBook, book)) {
                return book;
            }
        }
        return null;
    }

    private boolean isSameBook(String nameOfBook, Book book) {
        return book.getName().equals(nameOfBook);
    }

    private boolean isSameBook(Book book, String nameOfBook) {
        return book.getName().equals(nameOfBook);
    }

    public boolean hasBook(Book book) {
        return this.books.contains(book);
    }

    public void addNewBook(Book newBook) {
        this.books.add(newBook);
    }

//    public void removeBook(String nameOfBook) {
//        if (searchByName(nameOfBook)) {
//            Book book = getBookByName(nameOfBook);
//            this.books.remove(book);
//            return;
//        }
//        System.out.printf("Book %s does not exist", nameOfBook);
//    }

    public void removeBook(Book book) {
        if (hasBook(book)) {
            this.books.remove(book);
            return;
        }
        System.out.printf("Book %s does not exist", book.getName());
    }

    public boolean searchByName(String nameOfBook) {
        for (Book book : this.books) {
            if (isSameBook(book, nameOfBook)) {
                return true;
            }
        }
        return false;
    }

    public List<Book> getBooks() {
        List<Book> copyOfBooks = new ArrayList<>(this.books);
        return copyOfBooks;
    }
}

package com.step.LibrarySimulation;

import java.util.ArrayList;
import java.util.List;

public class Common {
    private List<Book> books = new ArrayList<>();

    public Common() {

    }

    private Book getBookByName(String nameOfBook) {
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

    protected boolean hasBook(Book book) {
        return this.books.contains(book);
    }

    protected void addNewBook(Book newBook) {
        this.books.add(newBook);
    }

    protected void removeBook(String nameOfBook) {
        if (searchByName(nameOfBook)) {
            Book book = getBookByName(nameOfBook);
            this.books.remove(book);
            return;
        }
        System.out.printf("Book %s does not exist", nameOfBook);
    }


    protected void removeBook(Book book) {
        if (this.books.contains(book)) {
            this.books.remove(book);
            return;
        }
        System.out.printf("Book %s does not exist", book.getName());
    }

    protected boolean searchByName(String nameOfBook) {
        for (Book book : this.books) {
            if (isSameBook(book, nameOfBook)) {
                return true;
            }
        }
        return false;
    }

    protected List<Book> getBooks() {
        return this.books;
    }
}

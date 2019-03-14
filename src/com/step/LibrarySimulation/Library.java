package com.step.LibrarySimulation;

import java.util.ArrayList;
import java.util.List;

public class Library extends Common {
    private final List<BookReader> bookReaders = new ArrayList<>();
    private final List<Book> removedBooks = new ArrayList<>();

    public Library() {}

    @Override
    public void removeBook(Book book) {
        super.removeBook(book);
        this.removedBooks.add(book);
    }

    public void transferBook(Book book){
        super.removeBook(book);
    }

    public void addReader(BookReader reader) {
        this.bookReaders.add(reader);
    }

    public List<BookReader> getBookReaders() {
        return this.bookReaders;
    }

    public List<Book> getRemovedBooks() {
        return this.removedBooks;
    }

    public void removePermanently(Book book){
        this.removedBooks.remove(book);
    }
}

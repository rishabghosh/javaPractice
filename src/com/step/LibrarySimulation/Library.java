package com.step.LibrarySimulation;

import java.util.ArrayList;
import java.util.List;

public class Library extends Common {
    private final List<BookReader> bookReaders = new ArrayList<>();
    private final List<Book> removedBooks = new ArrayList<>();

    public Library() {}

    private boolean isReaderValid(BookReader candidate) {
        return this.bookReaders.contains(candidate);
    }

    public void addReader(BookReader reader) {
        this.bookReaders.add(reader);
    }

    public void giveBookToReader(BookReader reader, Book book) {
        if (isReaderValid(reader) && hasBook(book)) {
            super.removeBook(book);
            reader.addNewBook(book);
            return;
        }
        System.out.println("Invalid Reader or book name");
    }

    public void returnBookFromReader(BookReader reader, Book book){
        if(isReaderValid(reader) && reader.hasBook(book)){
            System.out.println(book);
            reader.removeBook(book);
            super.addNewBook(book);
            return;
        }
        System.out.println("Invalid Reader or reader don't have this book");
    }

    public BookReader currentReaderOfBook(Book book){
        for (BookReader reader:this.bookReaders) {
            if(reader.hasBook(book)){
                return reader;
            }
        }
        return null;
    }

    public List<Book> checkAllBooksOfReader(BookReader reader){
        return reader.getBooks();
    }

    @Override
    public void removeBook(Book book) {
        super.removeBook(book);
        this.removedBooks.add(book);
    }

    public boolean isRemoved(Book book){
        return removedBooks.contains(book);
    }

    public List<Book> getRemovedBooks() {
        return this.removedBooks;
    }

    public void bringBack(Book book){
        if(this.removedBooks.contains(book)){
            this.removedBooks.remove(book);
            super.addNewBook(book);
            return;
        }
        System.out.println("Book does not exist in removed list");
    }
}

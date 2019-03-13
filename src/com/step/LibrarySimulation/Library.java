package com.step.LibrarySimulation;

import java.util.ArrayList;
import java.util.List;

public class Library extends Common {
    private List<BookReader> bookReaders = new ArrayList<>();

    public Library() {}

    private boolean isReaderValid(BookReader requiredReader) {
        return this.bookReaders.contains(requiredReader);
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
}

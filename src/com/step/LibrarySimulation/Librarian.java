package com.step.LibrarySimulation;

import java.util.List;

public class Librarian {
    private final Library library;

    public Librarian(Library library) {
        this.library = library;
    }

    public boolean isBookRemoved(Book book){
        return library.getRemovedBooks().contains(book);
    }

    public BookReader currentReaderOfBook(Book book){
        for (BookReader reader:library.getBookReaders()) {
            if(reader.hasBook(book)){
                return reader;
            }
        }
        return null;
    }

    public List<Book> checkAllBooksOfReader(BookReader reader){
        return reader.getBooks();
    }

    public void bringBack(Book book){
        if(isBookRemoved(book)){
            library.removePermanently(book);
            library.addNewBook(book);
            return;
        }
        System.out.println("Book does not exist in removed list");
    }

    public void addBookToLibrary(Book book) {
        library.addNewBook(book);
    }

    public void removeBookFromLibrary(Book book) {
        library.removeBook(book);
    }
}

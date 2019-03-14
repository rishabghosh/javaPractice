package com.step.LibrarySimulation;

import java.util.List;

public class Librarian {
    private final Library library;

    public Librarian(Library library) {
        this.library = library;
    }

    private boolean isReaderValid(BookReader candidate) {
        return library.getBookReaders().contains(candidate);
    }

    private boolean isBookRemoved(Book book){
        return library.getRemovedBooks().contains(book);
    }



    public void giveBookToReader(BookReader reader, Book book) {
        if (isReaderValid(reader) && library.hasBook(book)) {
            library.removeBook(book);
            reader.addNewBook(book);
            return;
        }
        System.out.println("Invalid Reader or book name");
    }

    public void returnBookFromReader(BookReader reader, Book book){
        if(isReaderValid(reader) && reader.hasBook(book)){
            reader.removeBook(book);
            library.addNewBook(book);
            return;
        }
        System.out.println("Invalid Reader or reader don't have this book");
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
}

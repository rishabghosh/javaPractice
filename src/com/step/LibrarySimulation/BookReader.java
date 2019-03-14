package com.step.LibrarySimulation;

public class BookReader extends Common {
    private final String name;
    private final Library library;

    public BookReader(String name, Library library) {
        this.name = name;
        this.library = library;
    }

    public String getName() {
        return this.name;
    }

    public void take(Book book) {
        library.removeBook(book);
        library.removePermanently(book);
        super.addNewBook(book);
    }

    public void returnBookToLibrary(Book book) {
        library.addNewBook(book);
        super.removeBook(book);
    }

    public void borrowBookFromLibrary(Book book) {
        library.removeBook(book);
        library.removePermanently(book);
        super.addNewBook(book);
    }

    public boolean searchBookInLibrary(String nameOfBook) {
        return library.searchByName(nameOfBook);

    }

    /**
     * Add new method adds a book from library
     * SearchByName method should check the reader has borrowed any book
     *
     */
}

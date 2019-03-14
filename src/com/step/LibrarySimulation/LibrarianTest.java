package com.step.LibrarySimulation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibrarianTest {

    private final Book book1 = new Book("Harry Potter", 1123456L);
    private final Book book2 = new Book("Hunger Games", 1123457L);
    private final Book book3 = new Book("How To Kill A Mockingbird", 1234568L);

    @Test
    @DisplayName("should remove the book from library list and add it to readers list")
    void giveBookToReader() {
        BookReader john = new BookReader("John");

        Library library = new Library();
        library.addReader(john);
        library.addNewBook(book1);
        library.addNewBook(book2);
        library.addNewBook(book3);

        Librarian librarian = new Librarian(library);

        librarian.giveBookToReader(john, book1);

        List<Book> actual = library.getBooks();
        List<Book> expected = Arrays.asList(book2, book3);
        assertTrue(expected.containsAll(actual) && actual.containsAll(expected));
    }

    @Test
    @DisplayName("should remove the book from library list and add it to readers list")
    void returnBookFromReader() {
        BookReader john = new BookReader("John");
        john.addNewBook(book1);

        Library library = new Library();
        library.addReader(john);
        library.addNewBook(book2);
        library.addNewBook(book3);

        Librarian librarian = new Librarian(library);

        librarian.returnBookFromReader(john, book1);

        List<Book> actual = library.getBooks();
        List<Book> expected = Arrays.asList(book1, book2, book3);
        assertTrue(expected.containsAll(actual) && actual.containsAll(expected));
    }

    @Test
    @DisplayName("should return the reader when the reader has the particular book")
    void currentReaderOfBook1() {
        BookReader john = new BookReader("John");
        john.addNewBook(book1);

        Library library = new Library();
        library.addReader(john);
        library.addNewBook(book2);
        library.addNewBook(book3);

        Librarian librarian = new Librarian(library);

        BookReader actual = librarian.currentReaderOfBook(book1);
        BookReader expected = john;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("should return null if there is no reader of the book")
    void currentReaderOfBook2() {
        BookReader john = new BookReader("John");

        Library library = new Library();
        library.addReader(john);
        library.addNewBook(book2);
        library.addNewBook(book3);

        Librarian librarian = new Librarian(library);

        BookReader actual = librarian.currentReaderOfBook(book1);
        assertEquals(null, actual);
    }

    @Test
    @DisplayName("should return a list of all books the reader has")
    void checkAllBooksOfReader() {
        BookReader john = new BookReader("John");
        john.addNewBook(book1);
        john.addNewBook(book2);
        john.addNewBook(book3);

        Library library = new Library();
        library.addReader(john);

        Librarian librarian = new Librarian(library);

        List<Book> actual = librarian.checkAllBooksOfReader(john);
        List<Book> expected = Arrays.asList(book1, book2, book3);
        assertEquals(expected, actual);
    }


    @Test
    @DisplayName("should remove the book from removed books list")
    void bringBack1() {
        Library library = new Library();
        library.addNewBook(book1);
        library.addNewBook(book2);
        library.addNewBook(book3);
        library.removeBook(book1);
        library.removeBook(book2);

        Librarian librarian = new Librarian(library);
        librarian.bringBack(book1);

        List<Book> actual = library.getRemovedBooks();
        List<Book> expected = Arrays.asList(book2);
        assertTrue(expected.containsAll(actual) && actual.containsAll(expected));
    }

    @Test
    @DisplayName("should add the book to library")
    void bringBack2() {
        Library library = new Library();
        library.addNewBook(book1);
        library.addNewBook(book2);
        library.addNewBook(book3);
        library.removeBook(book1);

        Librarian librarian = new Librarian(library);
        librarian.bringBack(book1);

        List<Book> actual = library.getBooks();
        List<Book> expected = Arrays.asList(book1, book2, book3);
        assertTrue(expected.containsAll(actual) && actual.containsAll(expected));
    }
}
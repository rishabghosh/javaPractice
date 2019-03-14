package com.step.LibrarySimulation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    private final Book book1 = new Book("Harry Potter", 1123456L);
    private final Book book2 = new Book("Hunger Games", 1123457L);
    private final Book book3 = new Book("How To Kill A Mockingbird", 1234568L);

    @Test
    @DisplayName("should be able to add a new book")
    void addNewBook() {
        Library library = new Library();
        library.addNewBook(book1);

        List<Book> actual = library.getBooks();
        List<Book> expected = Arrays.asList(book1);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("should be able remove a book when given the book object")
    void removeBook1() {
        Library library = new Library();

        library.addNewBook(book1);
        library.addNewBook(book2);

        library.removeBook(book1);

        List<Book> actual = library.getRemovedBooks();
        List<Book> expected = Arrays.asList(book1);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("should add the removed book to the removed book list")
    void removeBook2() {
        Library library = new Library();

        library.addNewBook(book1);
        library.addNewBook(book2);

        library.removeBook(book1);

        List<Book> actual = library.getBooks();
        List<Book> expected = Arrays.asList(book2);
        assertEquals(expected, actual);
    }


    @Test
    @DisplayName("should return true if any book of that name exists")
    void searchByName() {
        Library library = new Library();

        library.addNewBook(book1);
        library.addNewBook(book2);

        assertTrue(library.searchByName("Harry Potter"));
    }

    @Test
    @DisplayName("should return false if none of the book of that name exists")
    void searchByName2() {
        Library library = new Library();

        library.addNewBook(book1);
        library.addNewBook(book2);

        assertFalse(library.searchByName("Bad Book"));
    }


    @Test
    @DisplayName("should remove the book from library list and add it to readers list")
    void giveBookToReader() {
        BookReader john = new BookReader("John");

        Library library = new Library();
        library.addReader(john);
        library.addNewBook(book1);
        library.addNewBook(book2);
        library.addNewBook(book3);

        library.giveBookToReader(john, book1);

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

        library.returnBookFromReader(john, book1);

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

        BookReader actual = library.currentReaderOfBook(book1);
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

        BookReader actual = library.currentReaderOfBook(book1);
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

        List<Book> actual = library.checkAllBooksOfReader(john);
        List<Book> expected = Arrays.asList(book1, book2, book3);
        assertEquals(expected, actual);
    }
}
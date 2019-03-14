package com.step.LibrarySimulation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    private final Book book1 = new Book("Harry Potter", 1123456L);
    private final Book book2 = new Book("Hunger Games", 1123457L);
    private final Book book3 = new Book("How To Kill A Mockingbird", 1234568L);

    private Library library;


    @BeforeEach
    void setup() {
        library = new Library();
        library.addNewBook(book1);
        library.addNewBook(book2);
        library.addNewBook(book3);
    }


    /* ======= Testing Parent's Methods ======== */


    @Test
    @DisplayName("should be able to add a new book")
    void addNewBook() {
        List<Book> actual = library.getBooks();
        List<Book> expected = Arrays.asList(book1, book2, book3);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("should return true if any book of that name exists")
    void searchByName() {
        assertTrue(library.searchByName("Harry Potter"));
    }

    @Test
    @DisplayName("should return false if none of the book of that name exists")
    void searchByName2() {
        assertFalse(library.searchByName("Bad Book"));
    }


    /* ========= Testing Overridden Methods ========== */


    @Test
    @DisplayName("should be able remove a book when given the book object")
    void removeBook1() {
        library.removeBook(book1);

        List<Book> actual = library.getRemovedBooks();
        List<Book> expected = Arrays.asList(book1);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("should add the removed book to the removed book list")
    void removeBook2() {
        library.removeBook(book1);

        List<Book> actual = library.getBooks();
        List<Book> expected = Arrays.asList(book2, book3);
        assertEquals(expected, actual);
    }


    /* ========== Testing New Methods =========== */


    @Test
    @DisplayName("should remove book from removed books list")
    void removePermanently() {
        library.removeBook(book1);

        library.removePermanently(book1);

        List<Book> actual = library.getRemovedBooks();
        List<Book> expected = Arrays.asList();
        assertEquals(expected, actual);
    }


}
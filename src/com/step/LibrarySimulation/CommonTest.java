package com.step.LibrarySimulation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CommonTest {
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
    @DisplayName("should be able to remove a new book for given a book object")
    void removeBook() {
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



}
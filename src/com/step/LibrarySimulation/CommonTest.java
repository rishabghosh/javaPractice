package com.step.LibrarySimulation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CommonTest {
    private final Book book1 = new Book("Harry Potter", 1123456L);
    private final Book book2 = new Book("Hunger Games", 1123457L);
    private final Book book3 = new Book("How To Kill A Mockingbird", 1234568L);

    private Common common;

    @BeforeEach
    void setup() {
        common = new Library();
        common.addNewBook(book1);
        common.addNewBook(book2);
        common.addNewBook(book3);
    }

    @Test
    @DisplayName("should be able to add a new book")
    void addNewBook() {
        List<Book> actual = common.getBooks();
        List<Book> expected = Arrays.asList(book1, book2, book3);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("should be able to remove a new book for given a book object")
    void removeBook() {
        common.removeBook(book1);

        List<Book> actual = common.getBooks();
        List<Book> expected = Arrays.asList(book2, book3);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("should return true if any book of that name exists")
    void searchByName() {
        assertTrue(common.searchByName("Harry Potter"));
    }

    @Test
    @DisplayName("should return false if none of the book of that name exists")
    void searchByName2() {
        assertFalse(common.searchByName("Bad Book"));
    }

}
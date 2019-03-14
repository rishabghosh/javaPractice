package com.step.LibrarySimulation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookReaderTest {
    private final Book book1 = new Book("Harry Potter", 1123456L);
    private final Book book2 = new Book("Hunger Games", 1123457L);
    private final Book book3 = new Book("How To Kill A Mockingbird", 1234568L);

    private BookReader reader;


    @BeforeEach
    void setup() {
        reader = new BookReader("John");
        reader.addNewBook(book1);
        reader.addNewBook(book2);
        reader.addNewBook(book3);
    }


    /* ======= Testing Unchanged Methods ======== */


    @Test
    @DisplayName("should be able to add a new book")
    void addNewBook() {
        List<Book> actual = reader.getBooks();
        List<Book> expected = Arrays.asList(book1, book2, book3);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("should return true if any book of that name exists")
    void searchByName() {
        assertTrue(reader.searchByName("Harry Potter"));
    }

    @Test
    @DisplayName("should return false if none of the book of that name exists")
    void searchByName2() {
        assertFalse(reader.searchByName("Bad Book"));
    }

    /* ======== Testing New Methods ========= */

    @Test
    @DisplayName("should return the name of the reader")
    void getName(){
        assertEquals("John", reader.getName());
    }

}
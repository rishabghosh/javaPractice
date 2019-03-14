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
    private final Book book4 = new Book("Sherlock Homes", 1234569L);
    private final Book book5 = new Book("Kite Runner", 1234570L);

    private BookReader reader;
    private Library library;


    @BeforeEach
    void setup() {
        library = new Library();
        library.addNewBook(book1);
        library.addNewBook(book2);
        library.addNewBook(book3);

        reader = new BookReader("John", library);
        reader.addNewBook(book4);
        reader.addNewBook(book5);
    }


    /* ======= Testing Unchanged Methods ======== */


    @Test
    @DisplayName("should be able to add a new book")
    void addNewBook() {
        List<Book> actual = reader.getBooks();
        List<Book> expected = Arrays.asList(book4, book5);
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

    @Test
    @DisplayName("should return true if already has the book of this name")
    void hasBook() {
        assertTrue(reader.hasBook(book4));
    }

    @Test
    @DisplayName("should return false if does not have any book of this name")
    void hasBook2() {
        assertFalse(reader.hasBook(book1));
    }


    /* ======== Testing New Methods ========= */


    @Test
    @DisplayName("should return the name of the reader")
    void getName() {
        assertEquals("John", reader.getName());
    }

    @Test
    @DisplayName("should remove the book from library list")
    void take() {
        reader.take(book1);

        List<Book> actual = library.getBooks();
        List<Book> expected = Arrays.asList(book2, book3);
        assertTrue(expected.containsAll(actual) && actual.containsAll(expected));
    }

    @Test
    @DisplayName("should not add the book to removed list of library")
    void take2() {
        reader.take(book1);

        List<Book> actual = library.getRemovedBooks();
        List<Book> expected = Arrays.asList();
        assertTrue(expected.containsAll(actual) && actual.containsAll(expected));
    }


    @Test
    @DisplayName("should add the book to readers list")
    void take3() {
        reader.take(book1);

        List<Book> actual = reader.getBooks();
        List<Book> expected = Arrays.asList(book1, book4, book5);
        assertTrue(expected.containsAll(actual) && actual.containsAll(expected));
    }


    @Test
    @DisplayName("should add the book to libraries list")
    void returnBookToLibrary() {
        reader.returnBookToLibrary(book4);

        List<Book> actual = library.getBooks();
        List<Book> expected = Arrays.asList(book1, book2, book3, book4);
        assertTrue(expected.containsAll(actual) && actual.containsAll(expected));
    }

    @Test
    @DisplayName("should remove the book from readers list")
    void returnBookToLibrary2() {
        reader.returnBookToLibrary(book4);

        List<Book> actual = reader.getBooks();
        List<Book> expected = Arrays.asList(book5);
        assertTrue(expected.containsAll(actual) && actual.containsAll(expected));
    }

    @Test
    @DisplayName("should remove the book from library")
    void borrowBookFromLibrary(){
        reader.borrowBookFromLibrary(book3);

        List<Book> actual = library.getBooks();
        List<Book> expected = Arrays.asList(book1, book2);
        assertTrue(expected.containsAll(actual) && actual.containsAll(expected));
    }

    @Test
    @DisplayName("should remove the book from library and not add it to remove list")
    void borrowBookFromLibrary2(){
        reader.borrowBookFromLibrary(book3);

        List<Book> actual = library.getRemovedBooks();
        List<Book> expected = Arrays.asList();
        assertTrue(expected.containsAll(actual) && actual.containsAll(expected));
    }

    @Test
    @DisplayName("should add the book to readers list")
    void borrowBookFromLibrary3(){
        reader.borrowBookFromLibrary(book3);

        List<Book> actual = reader.getBooks();
        List<Book> expected = Arrays.asList(book3, book4, book5);
        assertTrue(expected.containsAll(actual) && actual.containsAll(expected));
    }

    @Test
    @DisplayName("should return true if the name of the book exists in library")
    void searchBookInLibrary(){
        assertTrue(reader.searchBookInLibrary("Hunger Games"));
    }

    @Test
    @DisplayName("should return false if the name of the book does not exists in library")
    void searchBookInLibrary2(){
        assertFalse(reader.searchBookInLibrary("Bad Book"));
    }
}
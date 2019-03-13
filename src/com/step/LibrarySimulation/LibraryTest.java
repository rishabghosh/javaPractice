package com.step.LibrarySimulation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test
    @DisplayName("should be able to add a new book")
    void addNewBook() {
        Book book1 = new Book("Harry Potter", 1123456L);
        Library library = new Library();
        library.addNewBook(book1);
        List<Book> actual = library.getBooks();
        List<Book> expected = Arrays.asList(book1);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("should be able to remove a new book")
    void removeBook() {
        Book book1 = new Book("Harry Potter", 1123456L);
        Book book2 = new Book("Hunger Games", 1123457L);

        Library library = new Library();

        library.addNewBook(book1);
        library.addNewBook(book2);

        library.removeBook("Harry Potter");

        List<Book> actual = library.getBooks();
        List<Book> expected = Arrays.asList(book2);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("should return true if any book of that name exists")
    void searchByName() {
        Book book1 = new Book("Harry Potter", 1123456L);
        Book book2 = new Book("Hunger Games", 1123457L);

        Library library = new Library();

        library.addNewBook(book1);
        library.addNewBook(book2);


        boolean actual = library.searchByName("Harry Potter");
        assertTrue(actual);
    }

    @Test
    @DisplayName("should return false if none of the book of that name exists")
    void searchByName2() {
        Book book1 = new Book("Harry Potter", 1123456L);
        Book book2 = new Book("Hunger Games", 1123457L);

        Library library = new Library();

        library.addNewBook(book1);
        library.addNewBook(book2);


        boolean actual = library.searchByName("Maze Runner");
        assertFalse(actual);
    }


    @Test
    @DisplayName("should remove the book from library list and add it to readers list")
    void giveBookToReader() {
        Book book1 = new Book("Harry Potter", 1123456L);
        Book book2 = new Book("Hunger Games", 1123457L);
        Book book3 = new Book("How To Kill A Mockingbird", 1234568L);

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
        Book book1 = new Book("Harry Potter", 1123456L);
        Book book2 = new Book("Hunger Games", 1123457L);
        Book book3 = new Book("How To Kill A Mockingbird", 1234568L);

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
}
package com.step.LibrarySimulation;

public class BookReader extends Common {
    private final String name;

    public BookReader(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    /**
     * Add new method adds a book from library
     * SearchByName method should check the reader has borrowed any book
     *
     */
}

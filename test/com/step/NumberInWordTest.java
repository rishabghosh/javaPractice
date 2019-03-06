package com.step;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class NumberInWordTest {
  private ByteArrayOutputStream outContent = new ByteArrayOutputStream();
  private PrintStream originalOut = System.out;
  private PrintStream customOut = new PrintStream(outContent);

  @BeforeEach
  void setUp() {
    System.setOut(customOut);
  }

  @AfterEach
  void tearDown() {
    System.setOut(originalOut);
  }

  @Test
  void printNumberInWords_for_negetive_number() {
    NumberInWord.printNumberInWord(-1);
    String expected = "OTHER\n";
    String actual = outContent.toString();
    assertEquals(expected, actual);
  }

  @Test
  void printNumberInWords_for_number_greater_than_9() {
    NumberInWord.printNumberInWord(10);
    String expected = "OTHER\n";
    String actual = outContent.toString();
    assertEquals(expected, actual);
  }

  @Test
  void printNumberInWords_for_number_0() {
    NumberInWord.printNumberInWord(0);
    String expected = "ZERO\n";
    String actual = outContent.toString();
    assertEquals(expected, actual);
  }

  @Test
  void printNumberInWords_for_number_9() {
    NumberInWord.printNumberInWord(9);
    String expected = "NINE\n";
    String actual = outContent.toString();
    assertEquals(expected, actual);
  }

  @Test
  void printNumberInWords_for_number_between_0_to_9() {
    NumberInWord.printNumberInWord(5);
    String expected = "FIVE\n";
    String actual = outContent.toString();
    assertEquals(expected, actual);
  }
}
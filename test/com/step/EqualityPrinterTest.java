package com.step;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class EqualityPrinterTest {

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
  void printEqual_for_all_3_args_are_same() {
    EqualityPrinter.printEqual(1, 1, 1);
    String expected = "All numbers are equal\n";
    String actual = outContent.toString();
    assertEquals(expected, actual);
  }

  @Test
  void printEqual_default_cases() {
    EqualityPrinter.printEqual(1, 1, 2);
    String expected = "Neither all are equal or different\n";
    String actual = outContent.toString();
    assertEquals(expected, actual);
  }

  @Test
  void printEqual_for_invalid_value() {
    EqualityPrinter.printEqual(-1, -1, -1);
    String expected = "Invalid Value\n";
    String actual = outContent.toString();
    assertEquals(expected, actual);
  }

  @Test
  void printEqual_for_all_3_args_are_different() {
    EqualityPrinter.printEqual(1, 2, 3);
    String expected  = "All numbers are different\n";
    String actual = outContent.toString();
    assertEquals(expected, actual);
  }
}
package com.step;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * ======= ByteArrayOutputStream =======
 * output stream is something where you can write to
 * like file, web page and screen
 * a byte array is an array of elements of byte data-types
 */

class MinutesToYearsAndDaysCalculatorTest {

  private ByteArrayOutputStream outContent = new ByteArrayOutputStream();

  /**
   * here outContent is a custom created outputStream
   */

  private PrintStream originalOut = System.out;
  private PrintStream customOut = new PrintStream(outContent);

  /**
   * ======= PrintStream =======
   * out(System.out) is a variable of type PrintStream in class System
   * println is a method in PrintStream class
   * since originalOut points to System.out it will also have a println method
   * customOut is a new instance of printStream
   * now what ever is printed (System.out.println) will be passed to outContent
   */

  @BeforeEach
  void setUp() {
    System.setOut(customOut);
    /*
      this will set the System.out to customOut
     */
  }

  @AfterEach
  void tearDown() {
    System.setOut(originalOut);
  }

  @Test
  void printYearsAndDays() {
    MinutesToYearsAndDaysCalculator.printYearsAndDays(-1);
    assertEquals("Invalid Value\n", outContent.toString());
    /*
      outContent.toString() is because of matching type with expected
     */
  }
}
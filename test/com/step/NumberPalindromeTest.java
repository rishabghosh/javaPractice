package com.step;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberPalindromeTest {

  @Test
  void isPalindrome_for_a_negative_palindrome() {
    assertTrue(NumberPalindrome.isPalindrome(-1221));
  }

  @Test
  void isPalindrome_for_a_positive_palindrome() {
    assertTrue(NumberPalindrome.isPalindrome(707));
  }

  @Test
  void isPalindrome_for_a_number_which_is_not_a_palindrome() {
    assertTrue(NumberPalindrome.isPalindrome(11212));
  }

}
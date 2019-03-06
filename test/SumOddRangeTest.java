import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOddRangeTest {

  @Test
  void sumOdd_form_1_to_100() {
    int actual = SumOddRange.sumOdd(1, 100);
    assertEquals(2500, actual);
  }

  @Test
  void sumOdd_for_invalid_start_value() {
    int actual = SumOddRange.sumOdd(-1, 100);
    assertEquals(-1, actual);
  }

  @Test
  void sumOdd_for_both_start_and_end_range_is_same_and_even() {
    int actual = SumOddRange.sumOdd(100, 100);
    assertEquals(0, actual);
  }

  @Test
  void sumOdd_for_both_start_and_end_range_is_same_but_odd() {
    int actual = SumOddRange.sumOdd(13, 13);
    assertEquals(13, actual);
  }

  @Test
  void sumOdd_for_invalid_end_value() {
    int actual = SumOddRange.sumOdd(100, -100);
    assertEquals(-1, actual);
  }

  @Test
  void sumOdd_for_valid_start_and_end() {
    int actual = SumOddRange.sumOdd(100, 1000);
    assertEquals(247500, actual);
  }
}
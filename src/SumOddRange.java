public class SumOddRange {
  public static boolean isOdd(int number) {
    if (number <= 0) {
      return false;
    }
    return number % 2 != 0;
  }

  public static int sumOdd(int start, int end) {
    int sumOfOdds = 0;
    if (!(end >= start && start > 0)) {
      return -1;
    }
    for (int currentNumber = start; currentNumber <= end; currentNumber++) {
      if (isOdd(currentNumber)) {
        sumOfOdds += currentNumber;
      }
    }
    return sumOfOdds;
  }
}

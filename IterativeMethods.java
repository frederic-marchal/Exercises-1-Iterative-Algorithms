public class IterativeMethods {

  // 1.
  public static int sum(int n) {
      int sum = 0;
      for (int i = 0; i <= n; i++) {
          sum += i;
      }
      return sum;
  }

  // 2.
  public static int factorial(int n) {
      int fact = 1;
      for (int i = 2; i <= n; i++) {
          fact *= i;
      }
      return fact;
  }

  // 3.
  public static int power(int base, int exponent) {
      int result = 1;
      for (int i = 0; i < exponent; i++) {
          result *= base;
      }
      return result;
  }

  // 4.
  public static int sumList(int[] list) {
      int sum = 0;
      for (int num : list) {
          sum += num;
      }
      return sum;
  }

  // 5.
  public static double mean(int[] list) {
      return (double) sumList(list) / list.length;
  }

  // 6.
  public static double standardDeviation(int[] list) {
      double mean = mean(list);
      double sumSquaredDiff = 0;
      for (int num : list) {
          sumSquaredDiff += Math.pow(num - mean, 2);
      }
      return Math.sqrt(sumSquaredDiff / list.length);
  }

  // 7.
  public static int sumEven(int n) {
      int sum = 0;
      for (int i = 2; i <= n; i += 2) {
          sum += i;
      }
      return sum;
  }

  // 8.
  public static int sumEvenList(int[] list) {
      int sum = 0;
      for (int num : list) {
          if (num % 2 == 0) sum += num;
      }
      return sum;
  }

  // 9.
  public static int[] getEvenList(int[] list) {
      return java.util.Arrays.stream(list).filter(num -> num % 2 == 0).toArray();
  }

  // 10.
  public static int[] evenList(int n) {
      int[] evens = new int[n / 2];
      for (int i = 0, num = 2; num <= n; i++, num += 2) {
          evens[i] = num;
      }
      return evens;
  }

  // 11.
  public static int computeDotProduct(int[] list1, int[] list2) {
      int product = 0;
      for (int i = 0; i < list1.length; i++) {
          product += list1[i] * list2[i];
      }
      return product;
  }
}

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sum (0 to 5): " + IterativeMethods.sum(5));
        System.out.println("Factorial (5!): " + IterativeMethods.factorial(5));
        System.out.println("Power (3^4): " + IterativeMethods.power(3, 4));

        int[] list = {1, 2, 3, 4, 5};
        System.out.println("Sum of list: " + IterativeMethods.sumList(list));
        System.out.println("Mean of list: " + IterativeMethods.mean(list));
        System.out.println("Standard Deviation of list: " + IterativeMethods.standardDeviation(list));

        System.out.println("Sum of first even numbers up to 10: " + IterativeMethods.sumEven(10));
        System.out.println("Sum of even elements in list: " + IterativeMethods.sumEvenList(list));

        System.out.println("Even numbers from list: " + Arrays.toString(IterativeMethods.getEvenList(list)));
        System.out.println("List of first even numbers up to 10: " + Arrays.toString(IterativeMethods.evenList(10)));

        int[] list1 = {1, 2, 3}, list2 = {2, 4, 6};
        System.out.println("Dot product: " + IterativeMethods.computeDotProduct(list1, list2));
    }
}

import java.util.Scanner;
public class ArrayStatistics {

    static int sum(int[] values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum = sum + values[i];
        }

        return sum;
    }

    static double average(int[] values) {
        if (values.length == 0) {
            return 0;
        }

        return (double) sum(values) / values.length;
    }

    static int minimum(int[] values) {
        int min = values[0];

        for (int i = 1; i < values.length; i++) {
            if (values[i] < min) {
                min = values[i];
            }
        }

        return min;
    }

    static int maximum(int[] values) {
        int max = values[0];

        for (int i = 1; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
            }
        }

        return max;
    }

    static int countEven(int[] values) {
        int count = 0;

        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    static void printSignCounts(int[] values) {
        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int i = 0; i < values.length; i++) {
            if (values[i] > 0) {
                positive++;
            }
            else if (values[i] < 0) {
                negative++;
            }
            else {
                zero++;
            }
        }

        System.out.println("Positive count = " + positive);
        System.out.println("Negative count = " + negative);
        System.out.println("Zero count = " + zero);
}
   public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("Array is empty.");
        }
        else {
            int[] values = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Enter element " + (i + 1) + ": ");
                values[i] = sc.nextInt();
            }
            System.out.println();
            System.out.println("Sum = " + sum(values));
            System.out.println("Average = " + average(values));
            System.out.println("Minimum = " + minimum(values));
            System.out.println("Maximum = " + maximum(values));

            int even = countEven(values);
            int odd = values.length - even;

            System.out.println("Even count = " + even);
            System.out.println("Odd count = " + odd);

            printSignCounts(values);
        }
        sc.close();
    }
}

import java.util.Scanner;
public class LinearSearchToolkit {

    static boolean contains(int[] values, int target) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] == target) {
                return true;
            }
        }

        return false;
    }

    static int firstIndexOf(int[] values, int target) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] == target) {
                return i;
            }
        }

        return -1;
    }

    static int lastIndexOf(int[] values, int target) {
        int lastIndex = -1;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == target) {
                lastIndex = i;
            }
        }

        return lastIndex;
    }

    static int countOccurrences(int[] values, int target) {
        int count = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == target) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] values = new int[n];

        if (n == 0) {
            System.out.println("Array is empty.");
        }
        else {
            for (int i = 0; i < n; i++) {
                System.out.print("Enter element " + (i + 1) + ": ");
                values[i] = sc.nextInt();
            }

            System.out.print("Enter target: ");
            int target = sc.nextInt();
            System.out.println();
            System.out.println("Contains = " + contains(values, target));
            System.out.println("First index = " + firstIndexOf(values, target));
            System.out.println("Last index = " + lastIndexOf(values, target));
            System.out.println("Occurrences = " + countOccurrences(values, target));
        }
        sc.close();
    }
}

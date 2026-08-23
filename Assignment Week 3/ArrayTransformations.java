import java.util.Scanner;
public class ArrayTransformations {

    static void reverseInPlace(int[] values) {
        int left = 0;
        int right = values.length - 1;

        while (left < right) {
            int temp = values[left];
            values[left] = values[right];
            values[right] = temp;

            left++;
            right--;
        }
    }

    static int[] reversedCopy(int[] values) {
        int[] result = new int[values.length];

        for (int i = 0; i < values.length; i++) {
            result[i] = values[values.length - 1 - i];
        }

        return result;
    }

    static int removeValue(int[] values, int target) {
        int newLength = 0;

        for (int i = 0; i < values.length; i++) {
            if (values[i] != target) {
                values[newLength] = values[i];
                newLength++;
            }
        }

        return newLength;
    }

    static int[] runningSum(int[] values) {

        int[] result = new int[values.length];
        if (values.length > 0) {
            result[0] = values[0];
        }

        for (int i = 1; i < values.length; i++) {
            result[i] = result[i - 1] + values[i];
        }

        return result;
    }

    static void printArray(int[] values) {

        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] values = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            values[i] = sc.nextInt();
        }

        System.out.println();
        System.out.print("Original array: ");
        printArray(values);
        int[] copy = reversedCopy(values);
        System.out.print("Reversed copy: ");
        printArray(copy);
        reverseInPlace(values);
        System.out.print("After reverse in place: ");
        printArray(values);
        int[] sums = runningSum(values);
        System.out.print("Running sum: ");
        printArray(sums);
        System.out.print("Enter value to remove: ");
        int target = sc.nextInt();
        int newLength = removeValue(values, target);
        System.out.print("After removing " + target + ": ");

        for (int i = 0; i < newLength; i++) {
            System.out.print(values[i] + " ");
        }
        System.out.println();
        System.out.println("Original array length = " + values.length);
        System.out.println("Logical length = " + newLength);
        sc.close();
    }
}

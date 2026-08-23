import java.util.Scanner;
public class BitMaskUtility {

    static boolean isBitSet(int number, int position) {
        int mask = 1 << position;
        if ((number & mask) != 0) {
            return true;
        }

        return false;
    }

    static int setBit(int number, int position) {
        int mask = 1 << position;

        return number | mask;
    }

    static int clearBit(int number, int position) {
        int mask = 1 << position;

        return number & ~mask;
    }

    static int toggleBit(int number, int position) {
        int mask = 1 << position;

        return number ^ mask;
    }

    static String toBinary32(int number) {
        String result = "";

        for (int i = 31; i >= 0; i--) {
            if ((number & (1 << i)) != 0) {
                result = result + "1";
            }
            else {
                result = result + "0";
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        System.out.print("Enter bit position (0-31): ");
        int position = sc.nextInt();
        if (position < 0 || position > 31) {
            System.out.println("Invalid bit position.");
        }
        else {

            System.out.println();
            System.out.println("Before:");
            System.out.println("Decimal = " + number);
            System.out.println("Binary  = " + toBinary32(number));
            System.out.println();
            System.out.println("1. Check bit");
            System.out.println("2. Set bit");
            System.out.println("3. Clear bit");
            System.out.println("4. Toggle bit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Bit is set = " +
                        isBitSet(number, position));
            }

            else if (choice == 2) {
                int result = setBit(number, position);
                System.out.println("After setting bit:");
                System.out.println("Decimal = " + result);
                System.out.println("Binary  = " + toBinary32(result));
            }

            else if (choice == 3) {
                int result = clearBit(number, position);
                System.out.println("After clearing bit:");
                System.out.println("Decimal = " + result);
                System.out.println("Binary  = " + toBinary32(result));
            }

            else if (choice == 4) {
                int result = toggleBit(number, position);
                System.out.println("After toggling bit:");
                System.out.println("Decimal = " + result);
                System.out.println("Binary  = " + toBinary32(result));
            }

            else {
                System.out.println("Invalid choice.");
            }
        }
        sc.close();
    }
}

import java.util.Scanner;
public class MathsOperations {
    
    public static void main(String[]args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter First Number:");
        int a = scn.nextInt();

        System.out.print("Enter second number:" );
        int b = scn.nextInt();
        System.out.println("Numbers: " + a +" " + b);
        scn.close();
        int sum = a+b;
        int difference = a-b;
        int product = a*b;
        float quotient = a/b;
        int remainder = a%b;
        System.out.print("Sum is "+sum+"\nDifference is "+difference+"\nProduct is "+product+"\nQuotient is "+quotient+"\nRemainder is "+remainder);
    }
}

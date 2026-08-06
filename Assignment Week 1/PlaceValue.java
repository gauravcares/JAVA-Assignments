import java.util.Scanner;
public class PlaceValue {
    
     public static void main(String[]args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a three digit integer : ");
        int n = scn.nextInt();

        int H = n/100;
        int T = (n%100) / 10;
        int U = n%10;

        System.out.println("Hundreds:" + H);
        System.out.println("Tens:" + T);
        System.out.println("Units" + U);

        scn.close();
}}

import java.util.Scanner;

public class CalcSimpleInterest {
       public static void main(String[]args) {
        Scanner scn = new Scanner(System.in);
        System.out.print ("Enter Principal Amount:");
        float P = scn.nextFloat();
        System.out.print ("Enter Interest:");
        float I = scn.nextFloat();
        System.out.print ("Enter Tenure in years:");
        int T = scn.nextInt();
        

        float S = (P*I*T)/100f;
        float F = P+S;
        System.out.println("Interest: "+ S);
        System.out.println("Final Amount: " +F);
        scn.close();
    }}

import java.util.Scanner;
public class CelsiusToFahrenhite {
    
    public static void main(String[]args) {
        Scanner scn = new Scanner(System.in);
        System.out.print ("Enter Temp in Celsius:");
        float a = scn.nextFloat();

        float F= ((a*9.0f) / 5.0f) + 32.0f;
        System.out.println("Fahrenheit is "+ F);
        scn.close();
    }} 

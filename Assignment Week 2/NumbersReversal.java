import java.util.Scanner;
public class NumbersReversal 
{
 static int reverseNumber(int number)
 {
  int reversed = 0;
  while(number>0)
  {
    int digit = number % 10;
    reversed = reversed * 10 + digit;
    number = number / 10;
  }
  return reversed;
 }
 public static void main(String[] args)
 {
  Scanner input = new Scanner(System.in);
  System.out.print("enter the number =");
  int number = input.nextInt();
  System.out.println(reverseNumber(number));

 }
}

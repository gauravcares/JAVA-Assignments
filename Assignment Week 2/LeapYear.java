import java.util.Scanner;
public class LeapYear 
{
  public static void main(String[] args) throws Exception 
  {
   Scanner input = new Scanner(System.in);
   System.out.println("enter year");
   int year = input.nextInt();
   System.out.println(isLeapYear(year));
  }
  static boolean isLeapYear(int year)
   {
    return year % 4 == 0;
   }
}

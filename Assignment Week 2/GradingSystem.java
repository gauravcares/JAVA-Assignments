import java.util.Scanner;
public class GradingSystem
{
   public static void main(String[] args) throws Exception 
   {
    Scanner input = new Scanner(System.in);
    System.out.println("ENTER YOUR MARKS");
    int marks = input.nextInt();
    if(marks<=100 && marks>=80)
     {
      System.out.println("Distinction");
     }
    else if(marks<=79 && marks>=70)
     {
      System.out.println("Merit");
     }
     else if(marks<=69 && marks>=50)
     {
      System.out.println("Pass");
     }
     else if(marks<=49 && marks>=0)
     {
      System.out.println("Fail");
     }
     else if(marks<0 || marks>100)
     {
      System.out.println("Invaild");
     }
   }
}

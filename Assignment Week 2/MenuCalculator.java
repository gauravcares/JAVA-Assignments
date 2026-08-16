import java.util.Scanner;
public class MenuCalculator 
{
 
  public static void printMenu() 
  {
   System.out.println("Calculator");
   System.out.println("1-ADD");
   System.out.println("2-SUBTRACT");
   System.out.println("3-DIVIDE");
   System.out.println("4-MULTIPLY");
   System.out.println("5-EXIT");
  }
  public static double calculate(int choice,double a,double b)
  {
  switch(choice)
   {
    case 1:
      return a+b;
    case 2:
      return a-b;
    case 3:
      return a/b;
    case 4:
      return a*b;
    default:
      return 0;
   }
  }
   public static void main(String[] args) 
  {
   Scanner input = new Scanner(System.in);
   int choice;
   do
   {
    printMenu();
    System.out.println("ENTER YOUR CHOICE");
    choice = input.nextInt();
    if(choice < 0 || choice > 4)
      {
       System.out.println("Invalid choice");
       continue;
      }
    if (choice==0)
    {
     System.out.println("exit");
    break;
    }
  
  
  System.out.println("enter the first no= ");
  double a = input.nextInt();
  System.out.println("enter the second  no= ");
  double b = input.nextInt();
  double result =calculate(choice , a,b);
 System.out.println("result "+ result);
 }
 while(choice != 0);

        input.close();

  
  }

}

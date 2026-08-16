import java.util.Scanner;
public class PrimeNumber 
{
 static boolean isPrime(int number)
   {
    if(number<2)
    {
      return false;
    }
       for(int i=2;i*i<=number;i++)
       {
        if(number%i==0)
          return false;
       }
        return true;
   }    
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);
    System.out.println("enter the number");
    int number = input.nextInt();
    if(isPrime(number))
    {
     System.out.println("prime number");
    }
    else
    {
     System.out.println("not a prime number");
    }

  }
}     
 

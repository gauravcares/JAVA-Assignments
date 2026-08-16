import java.util.Scanner;
public class LoopPatterns
{
 public static void patternA(int size)
 {
  for(int i=0;i<size;i++)
  {
    for(int j=0;j<size;j++)
    {
     System.out.print("*");
    }
    System.out.println();
  }
 }
 public static void patternB(int size)
 {
   for(int i=0;i<size;i++)
  {
    for(int j=0;j<=i;j++)
    {
     System.out.print("*");
    }
    System.out.println();
  }
 }
  public static void patternC(int size)
 {
   for(int i=0;i<size;i++)
  {
    for(int j=1;j<=i+1;j++)
    {
     System.out.print(j);
    }
    System.out.println();
  }
}
   public static void patternE(int size)
 {
   for(int i=1;i<=size;i++)
  {
    for(int j=1;j<=i;j++)
    {
     System.out.print(i);
    }
    System.out.println();
  }
 } 
  public static void patternD(int size)
  {
   for(int i=0;i<size;i++)
    {
      for(int j=0;j<size-i;j++)
        {
          System.out.print("*");
        }
    System.out.println();
    }
  }


 
 
 public static void main(String[] args )
 {
  Scanner input = new Scanner(System.in);
  System.out.println("enter size of the pattern");
  int size1 = input.nextInt();
  System.out.println("PATTERN A = ");
  patternA(size1);
  System.out.println("PATTERN B = ");
  patternB(size1);
  System.out.println("PATTERN C = ");
  patternC(size1);
  System.out.println("PATTERN E = ");
  patternE(size1);
  System.out.println("PATTERN D = ");
  patternD(size1);

 }
}

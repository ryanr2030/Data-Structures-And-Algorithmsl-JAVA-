import java.util.Scanner;
public class Question6{
   private static int sum=0;
   public static void main(String args[]){
      Scanner input= new Scanner(System.in);
      System.out.print("Enter an integer to sum its digits:");
      long number=input.nextLong();
      System.out.println("The sum is "+sumDigits(number));
   }

   public static int sumDigits(long n){
      if (n==0){
         return sum;
      }
      sum=sum+(int)(n%10);
      n=n/10;
      return sumDigits(n);
   }
}
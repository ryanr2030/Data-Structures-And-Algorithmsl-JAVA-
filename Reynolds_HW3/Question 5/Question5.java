/*
Please obtain and prove the time complexity of the following programs:
 Find Greater Common Divisor (GCD) using Euclidean Method. Going to use Euclidian recurssive calls using subtraction.
   FIn primes using Sieve of Eratosthenes.
*/

public class Question5{

   public static void main(String [] args){
      
      long resEq1=gcd(10,20);
      System.out.println(resEq1);
      
      resEq1=gcd(112321,2000000);
      System.out.println(resEq1);
   
   }
   
   public static int gcd(int a, int b){
      long start=System.currentTimeMillis();
      if(a%b==0){
         long end=System.currentTimeMillis();
         System.out.println("Euclidean GCD run time "+(end-start)+" milliseconds");
         return b;
         
      }
      else
         return gcd(b,a%b);
      
   
   }

}
   
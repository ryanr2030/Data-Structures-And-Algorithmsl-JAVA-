/* Question 3: Write a program that displays the first 50 prime numbers in descending order. Use a stack
   to store the prime numbers
*/
import java.util.*;
public class Question3{
   public static void main(String[] args){
      Stack<Integer> stack=new Stack<>();
      int numbPrimes=50;
      //add the primes to the stack
      for(int i=2, count=0; count<numbPrimes;i++){
         if(isPrime(i)){
            stack.push(i);
            count++;
         }
      }
      //print the stack
      for(int i=1; !stack.isEmpty();i++){
         System.out.println(stack.pop()+" ");
      }
   }
   
   public static boolean isPrime(int num){
      for(int i=2; i<=num/2;i++){
         if(num%i==0){
            return false;
         }
      }
      return true;
   }

}

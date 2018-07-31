import java.util.Scanner;
public class Homework1 {

  public static void main(String[] args) {
   
   //Question 1
   System.out.println("Question 1:");
   divide();
   
   /*Question 2: The break statement causes the inner loop to be broken when i*j is greater than 2
      The continue statement results in the same output as the break statement in this case
      Instead of breaking the loop the continue statement updates j to the next itteration
      With the break statement the output is 1 2 1 2 2 3 on seperate lines
      With the continue statement the output is the same 1 2 1 2 2 3
   */
   System.out.println("\nQuestion 2:");
   for(int i=1;i<4;i++){
      for(int j=1; j<4; j++){
         if(i*j>2)
            continue;
         System.out.println(i*j);   
      }
      System.out.println(i);
   }
   System.out.println();
   for(int i=1;i<4;i++){
      for(int j=1; j<4; j++){
         if(i*j>2)
            break;
         System.out.println(i*j);   
      }
      System.out.println(i);
   }
   
   //Question 3:
   System.out.println("\nQuestion 3:");
   Scanner input = new Scanner(System.in);
   System.out.print("Enter n: ");
   int n=input.nextInt();
   printMatrix(n);
   
   /*Question 4: Pass by value allocates a memory slot for the actual value of the parameter being passed
      (a) outputs 0 the max method does not return a value. (b) outputs  2 2 4 2 4 8 2 4 8 16 2 4 8 16 32 2 4 8 16 32 64
  */
   System.out.println("\nQuestion 4:");
   System.out.println("Part A:");
   int max=0;
   max(1,2,max);
   System.out.println(max);
   
   System.out.println("Part B:");
   int i=1;
   while(i<=6){
      method1(i,2);
      i++;
   }
   
   System.out.println("\n\nQuestion 5: See attached screenshot");
   
   System.out.println("\nQuestion 6:");
   passwordCheck();
   
   System.out.println("\nQuestion 7:");
   System.out.print("Enter the number to see if it is a palindrome: ");
   int testNum=input.nextInt();
   boolean result= isPalindrome(testNum);
   if (result==true){
      System.out.println(testNum+" is a palindrome.");
   }
   else
      System.out.println(testNum+" is not a palindrome.");
      
   System.out.println("\nQuestion 8: ");
   int sum=0;
   int number;
  do{   
      System.out.print("Enter an integer (the input ends if it is 0): ");
      number=input.nextInt();
      sum+=number;
   } while(number!=0);
}
  
  
  
   public static void passwordCheck(){
      Scanner input = new Scanner(System.in);
      System.out.print("Enter your password: ");
      String password=input.next();  
      
      int countNum=0;
      int countSpecial=0;
      int errors=0;
      
      for(int i=0; i<password.length();i++){
         if(Character.isDigit(password.charAt(i))){
            countNum++;
         }
         char c=password.charAt(i);
         if(c!=32 && (c<48 || c>57) && (c<65||c>90) && (c<97||c>122)){
            countSpecial++;
         }
      }
      if(password.length()<8){
         System.out.println("A password must have at least eight characters.");
         errors++;
      }
      if(countSpecial!=0){
          System.out.println("A password consists of only letters and digits.");
          errors++;
            
      }
      if(countNum<2){
         System.out.println("A password must contain at least two digits.");  
         errors++;   
      }
      if(errors!=0){
         passwordCheck();
      }
      else{
       System.out.println("Valid password");
      }
      
    }
  public static void method1(int i, int num){
   for(int j=1; j<=i; j++){
      System.out.print(num+" ");
      num*=2;
   }
  }
  
  public static void divide(){
      Scanner input = new Scanner(System.in);
      System.out.print("Enter an integer: ");
      int a = input.nextInt();
      System.out.print("Is "+a+" divisibile by 5 and 6? ");
          if(a%5==0 && a%6==0){
            System.out.println("True");
          }
         else{
            System.out.println("False");
         }
      System.out.print("Is "+a+" divisibile by 5 or 6? ");
          if(a%5==0 || a%6==0){
            System.out.println("True");
          }
         else{
            System.out.println("False");
         }
      System.out.print("Is "+a+" divisibile by 5 or 6, but not both? ");
         if(a%5==0 ^ a%6==0){
            System.out.println("True");
          }
         else{
            System.out.println("False");
         }
  }
  
  public static void printMatrix(int n){
      int [][] matrix=new int[n][n];
      for(int i=0; i<n; i++){
         for(int k=0;k<n;k++){
            matrix[i][k]=(int)(2*Math.random());
            System.out.print(matrix[i][k]+" ");
         }
         System.out.println("");
      }
  }
  public static void max( int value1, int value2, int max){
   if(value1>value2)
      max=value1;
   else
      max=value2;
  }
 
  public static int reverse (int num){
   int revNum=0;
   while(num>0){
         revNum=(int)((revNum*10)+num%10);
         num=(int)num/10;
 
      }
   return revNum;
  }
  
  public static boolean isPalindrome(int number){
   int revNumber=reverse(number);
   if(revNumber==number)
      return true;
   else
      return false;
  }
}
  


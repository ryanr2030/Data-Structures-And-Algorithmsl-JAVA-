import java.util.Scanner;
public class Question5{
   private static int occur=0;
   
   public static void main(String args[]){
      Scanner input= new Scanner(System.in);
      System.out.print("Enter a phrase: ");
      String phrase= input.nextLine();
      
      System.out.print("Enter a character to search for: ");
      char key= input.next().charAt(0);
      
      System.out.println("Character \""+key+"\" count="+count(phrase,key));
   }
   
   public static int count(String str, char a){
      if(str.length()>0){
         if(str.charAt(0)==a){
            occur++;
         }
        return count(str.substring(1), a);
      }
      return occur;
   }

}
/*
Write a program to compare two linked lists of strings element by element and add ”Yes” or
”No” strings to the third linked list. First linked list is initialized with string colors ”Red”,
”Green”, ”Black”, ”White”, ”Pink” and the second linked list with ”Red”, ”Green”, ”Black”,
”Orange”. You are allowed to use java.util.* methods.
*/
import java.util.*;
public class Question6{
   public static void main(String [] args){
      LinkedList<String> list1 = new LinkedList<>();
      list1.add("RED");
      list1.add("GREEN");
      list1.add("BLACK");
      list1.add("WHITE");
      list1.add("PINK");
      
      LinkedList<String> list2 = new LinkedList<>();
      list2.add("RED");
      list2.add("GREEN");
      list2.add("BLACK");
      list2.add("ORANGE");

      LinkedList<String> result = new LinkedList<>();
      Iterator itL1= list1.iterator();
      Iterator itL2= list2.iterator();

      while(itL1.hasNext()){
         String eL1=(String) itL1.next();
         if(itL2.hasNext()){
            String eL2=(String)itL2.next();
            if(eL1.contains(eL2)){
               result.add("YES");
            }
            else{
               result.add("NO");
            }
         }
         else{
            result.add("NO");
         }
                  
      }
      Iterator itRe= result.iterator();
      while(itRe.hasNext()){
         System.out.print(itRe.next()+" ");
      }
   }


}
/*
Write a program to get the element in a tree list which is greater than or equal to the given
element. The tree list is initialized with numbers 10, 22, 36, 25, 16, 70, 82, 89, 14. The given
elements are 86, and 29. You are allowed to use java.util.TreeSet and java.util.Iterator.
*/
import java.util.TreeSet;
import java.util.Iterator;
public class Question7{
   public static void main(String [] args){

      TreeSet<Integer> tSet = new TreeSet<>();
      tSet.add(10);
      tSet.add(22);
      tSet.add(36);
      tSet.add(25);
      tSet.add(16);
      tSet.add(70);
      tSet.add(82);
      tSet.add(89);
      tSet.add(14);
      
      int check=29;
      System.out.print("The following numbers in the TreeSet are greater than "+check+": ");
      Iterator iT= tSet.iterator();
      
      while(iT.hasNext()){
         int cur=(int)iT.next();
         if(cur>=check){
            System.out.print(cur+" ");
         }
      }
      System.out.println();
      
      check=86;
      System.out.print("The following numbers in the TreeSet are greater than "+check+": ");
      iT= tSet.iterator();
      
      while(iT.hasNext()){
         int cur=(int)iT.next();
         if(cur>=check){
            System.out.print(cur+" ");
         }
      }
      System.out.println();   }
}
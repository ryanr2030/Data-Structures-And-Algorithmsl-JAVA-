/*
1. Write a test program that stores 5 million integers in a linked list and test the time to traverse
the list using an iterator vs. using the get(index) method.
*/
import java.util.*;
public class Question1{

   public static void main(String[] args){
      
      //generate the list of 5,000,000 integers
      List<Integer> fastAdd = new ArrayList<>();
      int i=0;
      while (i<50000){
         fastAdd.add(((int)(Math.random()*99)));
         i++;
      }
      LinkedList<Integer> testList = new LinkedList<>(fastAdd);

     

      //traverse the list using the itterator
      Iterator testIterator = testList.iterator();
      long startTime = System.currentTimeMillis();
      while(testIterator.hasNext()){
         testIterator.next();
      }
      long endTime = System.currentTimeMillis();
      System.out.println("Iterator time is "+(endTime-startTime)+" milliseconds.");
      
   
      //traverse entire list using get(index)      
      startTime=System.currentTimeMillis();
      i=i-1;
      for(; i>=0; i--){
         testList.get(i);
      }
      endTime=System.currentTimeMillis();
      System.out.println("get(index) time is "+(endTime-startTime)+" milliseconds.");
          
   }

}
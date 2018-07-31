/*
1. Write a program that randomly generates 10,000 integers and sorts them using radix sort.
*/
import java.util.*;
public class Question1{

      
 
    public static void radixSort(int[] test) {
 
          List<Integer>[] buckets = new ArrayList[10];
          for (int i = 0; i < buckets.length; i++) {
              buckets[i] = new ArrayList<Integer>();
          }
         
          // sort by each digit
          boolean trip = false;
          int tmp = -1;
          int exp = 1;
          while (!trip) {
              trip = true;
            for (Integer i : test) {
              tmp = i / exp;
              buckets[tmp % 10].add(i);
              if (trip && tmp > 0) {
                  trip = false;
              }
            }
            // empty buckets into test array
            int a = 0;
            for (int b = 0; b < 10; b++) {
              for (Integer i : buckets[b]) {
                test[a++] = i;
              }
              //clear the bucket
              buckets[b].clear();
            }
            // sort by next digit
            exp *= 10;
          }
        }
 
    
   public static void main(String[] args){
      int i=0;
      int[] test=new int[10000];
      while(i<10000){
         test[i]=(int)(Math.random()*10001);
         i++;
      }
      radixSort(test);
      int count=0;
      for(Integer j:test){
         System.out.print(j+" ");
         if(count>0 && count%10==0){
            System.out.println();
         }
         count++;
      }
   }
   

}


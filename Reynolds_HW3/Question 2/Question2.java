import java.util.Arrays;
import java.util.PriorityQueue;

/*
. Write a program that creates two priority queues, {”George”, ”Jim”, ”John”, ”Blake”, ”Kevin”
, ”M ichael”} and {”George”, ”Katie”, ”Kevin”, ”Michelle”, ”Ryan”}, and finds their union,
difference, and intersection.
*/
public class Question2 {

    public static void main(String[] args) {

        PriorityQueue<String> queue1 = new PriorityQueue<>(Arrays.asList("George", "Jim", "John", "Blake", "Kevin", "Michael"));
        PriorityQueue<String> queue2 = new PriorityQueue<>(Arrays.asList("George", "Katie", "Kevin", "Michelle", "Ryan"));

        PriorityQueue<String> union = new PriorityQueue<>(queue1);
        PriorityQueue<String> temp = new PriorityQueue<>(queue2);

      //create the union set 
        String search;
        //traverses queue2 comparing the values to union(only contains queue1 at the start
        //adds the string to union if it is not already contained within it
        while ((search = temp.poll()) != null) {
            if (!union.contains(search)) {
                union.add(search);
            }
        }
        
        System.out.println("Union: " + union);
      
      //create the difference between the Queues
        PriorityQueue<String> difference = new PriorityQueue<>(queue1);
        difference.removeAll(queue2);
        System.out.println("Difference: " + difference);

     //create the intersection between the queues
        PriorityQueue<String> intersection = new PriorityQueue<>(queue1);
        intersection.retainAll(queue2);
        System.out.println("Intersection: " + intersection);

    }

}
/*
Write a program that repeatedly prompts the user to enter a capital for a state. Upon
receiving the user input, the program reports whether the answer is correct. Assume that 20
states and their capitals are stored in a map structure as shown below. The program prompts
the user to answer all states capitals and displays the total correct count. The users answer
is not case-sensitive. You should use map to store pairs of each state and its capital. Your
program should prompt the user to enter a state and should display the capital for the state.
*/
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question4{
   public static void main(String[] args){
      int correct=0;
      Map<String, String> states= new HashMap<String,String>();
      states.put("ALABAMA","MONTGOMERY");
      states.put("PENNSYLVANIA","HARRISBURG");
      states.put("SOUTH CAROLINA","COLUMBIA");
      states.put("TENNESSEE","NASHVILLE");
      states.put("WYOMING","CHEYENNE");
      states.put("VIRGINIA","RICHMOND");
      states.put("MINNESOTA","ST. PAUL");
      states.put("MICHIGAN","LANSING");
      states.put("OHIO","COLUMBUS");
      states.put("NEW YORK","ALBANY");
      states.put("NEW JERSEY","TRENTON");
      states.put("OKLAHOMA","OKLAHOMA CITY");
      states.put("ILLINOIS","SPRINGFIELD");
      states.put("KANSAS","TOPEKA");
      states.put("MASSACHUSETTS","BOSTON");
      states.put("COLORADO","DENVER");
      states.put("HAWAII","HONOLULU");
      states.put("GEORGIA","ATLANTA");
      states.put("IOWA","DES MOINES");
      states.put("KENTUCKY","FRANKFORT");
      
      Scanner input=new Scanner(System.in);
      String capital="";
      for(Map.Entry c: states.entrySet()){
         System.out.print("What is the capital of "+c.getKey()+"?");
         capital=input.nextLine();
         capital=capital.toUpperCase();
         if(c.getValue().toString().equals(capital)){
            System.out.println("Correct capital");
            correct++;
         }
         else{
            System.out.println("Incorrect capital.");
         }
         
      }
     System.out.println("\nYou got "+correct+" state capitals correct!!");
   }



}
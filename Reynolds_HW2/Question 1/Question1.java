
import java.util.Scanner;
public class Question1{
  public static int[][] hourMatrix(){
    Scanner scan = new Scanner (System.in);
    int[][] timeCard = new int[8][7];
   System.out.print("Enter the weekly hours for your employees (limited to 8 employees 7 day work week):"); 
    for (int i =0;i<timeCard.length;i++){
      for (int j =0;j<timeCard[i].length;j++){
        timeCard[i][j] = scan.nextInt();
      }
    }
    return timeCard;
  }
  public static int[][] sortEmployees(int[][] timeCard){
    int[][] result = new int[8][2];
    for (int i =0;i<timeCard.length;i++){
      result[i][0] =i;
      for (int j=0;j<timeCard[i].length;j++) {
        result[i][1] += timeCard[i][j];
      }
    }
    for (int i =0;i<timeCard.length;i++){
      for (int j =0;j<timeCard.length -1;j++){
        if ( result[j][1] < result[j+1][1] ){
          int temp = result[j][1];
          int temp2 = result[j][0];
          result[j][1] = result[j+1][1];
          result[j][0] = result[j+1][0];
          result[j+1][1] = temp;
          result[j+1][0] = temp2;
        }
     }
    }
    return result;
  }
   
  public static void printEmployees(int[][] result){
    for (int i =0;i<result.length;i++){
        System.out.println("Employee " + result[i][0] +" worked " + result[i][1] + " hours" );
    }
  }
   
  public static void main (String[] args){
    int[][] nums = hourMatrix();
    int[][] nums1 = sortEmployees(nums);
    printEmployees(nums1);
  }
}
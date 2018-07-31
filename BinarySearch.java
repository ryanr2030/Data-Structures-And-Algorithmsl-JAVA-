import java.util.Scanner;
public class BinarySearch {
  /** Main method */
  public static void main(String[] args) {
    int x=1, k;
    int[] y= {2, 4, 5, 8, 9, 10, 15, 16, 18};
    Scanner input = new Scanner(System.in);
    System.out.print("Enter number to search for: ");
    int a=input.nextInt();
    //Invoke Binary search method to find a in list y
    int result=BS(y,a);
    //Print whether the item is there or not
    if(result==1){
      System.out.println(a+" is in the array.");
    }
    else if(result==-1){
      System.out.println(a+" is not in the array.");
    }
    
  }
   public static int BS(int [] list, int key) {
      
      //Write the binary search method
      int low=0, high=(list.length-1);
      while(low<=high){
	      int mid=(low+high)/2;
         
         if(key==list[mid]){
            return 1;
         }
         if (key > list[mid]){
            low=mid+1;
         }
         if (key<list[mid]){
            high=mid-1;
         } 
      }
	   return -1;

   }
  }



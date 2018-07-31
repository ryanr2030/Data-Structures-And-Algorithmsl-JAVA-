import java.util.*;
public class Question2{
 private static int matrixCount=0;
   public static void main(String args[]){

      double[][] a= new double[3][3];
      double[][] b= new double[3][3];
      setMatrix(a);
      setMatrix(b);
      double[][] result=multiplyMatrix(a,b);
      printMatrix(a);
      System.out.println("*");
      printMatrix(b);
      System.out.println("=");
      printMatrix(result);
      
      
      
   }
   
   public static double[][] multiplyMatrix(double[][] a, double[][] b) {
      //Throw exception if matrix a does not have the same number of rows as columns in matrix b
      if (a[0].length != b.length) {
         throw new RuntimeException(
        "The matrices do not have compatible size");
      }

      double[][] resultMatrix = (double[][])new double[a.length][b[0].length];

      // Perform multiplication of two matrices
      for (int i = 0; i < resultMatrix.length; i++) {
       for (int j = 0; j < resultMatrix[0].length; j++) {
         resultMatrix[i][j] = 0;

         for (int k = 0; k < a[0].length; k++) {
               resultMatrix[i][j] = (resultMatrix[i][j]+(a[i][k]*b[k][j]));
        }
      }
    }

      return resultMatrix;
   }
  
   public static void setMatrix(double[][] matrix){
      matrixCount++;
      Scanner input= new Scanner(System.in);
      System.out.print("Enter a "+matrix.length+" by "+matrix[0].length+" matrix to populate matrix"+matrixCount+":");
      
      for (int i = 0; i < matrix.length; i++) {
       for (int j = 0; j < matrix.length; j++) {
         matrix[i][j]=input.nextDouble();
        }
        
       }    
   
   }
   
   public static void printMatrix(double[][] print){
      for (int i = 0; i < print.length; i++) {
       for (int j = 0; j < print[0].length; j++) {
         System.out.format("%.1f ", print[i][j]);
         }
        System.out.println();
       }
   }
}
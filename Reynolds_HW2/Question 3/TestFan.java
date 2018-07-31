public class TestFan{
   public static void main (String args[]){
   
      Fan f1=new Fan();
         f1.setPower(true);
         f1.setSpeed(3);
         f1.setRadius(10);
      
      Fan f2=new Fan(2,5,"blue",false);
      
      System.out.println(f1.toString()+"\n"+f2.toString());
   
   }
   

}
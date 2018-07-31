public class Fan{

   //fan object variables
   private int speed;
      //fan speed constants
      static final int SLOW=1;
      static final int MEDIUM=2;
      static final int FAST=3;
   
   private boolean power;
   private double radius;
   private String color;
   
   //default constructor
   Fan(){
      speed=SLOW;
      power=false;
      radius=5;
      color="blue";
   }
   
   //all arg constructor
   Fan(int speed, double radius, String color, boolean power){
      this.speed=speed;
      this.radius=radius;
      this.color=color;
      this.power=power;
   }
   //getter methods
   public int getSpeed(){
      return speed;
   }
   public boolean getPower(){
      return power;
   }
   public double getRadius(){
      return radius;
   }
   public String getColor(String color){
      return color;
   }
  
  //mutator methods
   public void setSpeed(int speed){
      this.speed=speed;
   }
   public void setPower(boolean power){
      this.power=power;
   }
   public void setRadius(double radius){
      this.radius=radius;
   } 
   public void setColor(){
      this.color=color;
   }
   
   //toString method to display the status of the fan
   
   public String toString(){
      if(power==true){
         return "The fan is set to "+speed+", the fan is "+color+", and the radius is "+radius+".";
         }
      else
         return "The fan is "+color+", the radius is "+radius+", and the fan is off.";
   }



}
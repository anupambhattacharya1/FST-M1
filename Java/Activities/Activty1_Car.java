package Activites;

public class Activty1_Car {

	  String color;
	  String transmission;
	  int make;
	  int tyres = 4;
	  int doors = 4;
	  
	  public Activty1_Car(String color,String transmission, int make ) 
	  {
		  this.color=color;
		  this.transmission= transmission;
		  this.make=make;
	  }

	  public void displaycharacteristics()
	  {
		 System.out.println("Color is " + color); 
		 System.out.println("Color is " + transmission); 
		 System.out.println("Color is " + make); 
		 System.out.println("Color is " + tyres); 
		 System.out.println("Color is " + doors); 
		 
		  
	  }
	  public void accelerate()
	  {
		  System.out.println("Car is moving forward"); 
	  }
	  
	  public void brake()
	  {
		  System.out.println("Car has stopped"); 
	  }
	  
}

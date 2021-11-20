package day01_hello_world;

import java.util.Scanner;

public class VehicleRecall {
	
	  public static void main(String[] args) {
		     // DO NOT CHANGE:
		    Scanner input = new Scanner(System.in);
		    System.out.println("Enter vehicle's year:");
		    int vehicleYear = input.nextInt();

		    //WRITE YOUR CODE HERE:
		    
		    switch (vehicleYear) {
		      
		      case 1995,1996,1997,1998,2001,2002,2004,2055,2006,2015,2016,2017:
		        System.out.println("Your vehicle needs to be recalled!");
		        break;
		      default:
			    System.out.println("Your vehicle is fine, enjoy!");
			    break;

		    }
			
		    input.close();

}
}
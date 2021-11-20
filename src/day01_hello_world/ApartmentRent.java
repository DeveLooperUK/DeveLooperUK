package day01_hello_world;

import java.util.Scanner;

public class ApartmentRent {
	
	
	  public static void main(String[] args) {
		    
		  //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
		    // Variables are already declared and given
		    Scanner scan = new Scanner(System.in);
		    System.out.println("Welcome to Cybertek Apartments!");
		    System.out.println("Number of bedrooms you are interested:");
		    
		    int numberOfBedrooms = scan.nextInt();
		    int startingPrice = 0;
		    
		    //WRITE YOUR CODE HERE:
		    
		    if(numberOfBedrooms==1) {System.out.println("One Bedroom Selected\nStarting Price: 1100");}
		    else if(numberOfBedrooms==2) {System.out.println("Two Bedroom Selected\nStarting Price: 1850");}
		    else if(numberOfBedrooms==3) {System.out.println("Three Bedroom Selected\nStarting Price: 2550");}
		    else System.out.println("No such Bedrooms available");
		    
	  scan.close();
	  }
}

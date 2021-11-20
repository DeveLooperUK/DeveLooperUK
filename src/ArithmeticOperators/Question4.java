package ArithmeticOperators;

import java.util.Scanner;

public class Question4 {
	
	public static void main(String[] args) {

		int quarters, dimes, nickels, price, change;

	    Scanner s = new Scanner(System.in);
	    System.out.print("Enter price: ");
	    price = s.nextInt();
	    System.out.println("Price in cents : " + price);
	    
	    change = 100 - price;

	    	quarters = change/25;
	    	dimes = change%25/10;
	    	nickels = ((change%25)%10)/5;
	    	
	    	
	    	System.out.println("Your change is " + quarters +" quarters, " + dimes + " dimes, " + nickels + " and nickels");
	    	s.close();
	    	}
		
	}



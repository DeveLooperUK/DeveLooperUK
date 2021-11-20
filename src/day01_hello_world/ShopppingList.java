package day01_hello_world;

import java.util.Scanner;

public class ShopppingList {

	
	public static void main(String[] args) {
		
		/*
		 * List of items 
		 * Blanket - 60$ 
		 * Charger - 25$ 
		 * Hat - 25$ 
		 * Headphones - 30$ 
		 * Laptop - 200$ 
		 * Pants - 50$ 
		 * Pillow - 40$ 
		 * Smartphone - 1000$ 
		 * Socks - 5$ 
		 * USB cable - 10$
		 */
		
		int quarters, dimes, nickels, pennies;

	    Scanner s = new Scanner(System.in);
	    //System.out.print("Enter item");
	    String item = s.nextLine();

	    if (item.equalsIgnoreCase("Blanket")){
	    	System.out.println("Thank you for your purchase! ");
	    	System.out.print("Your current balance is: 40");
	    	}
	    else if (item.equalsIgnoreCase("Charger")){
	    	System.out.println("Thank you for your purchase! ");
	    	System.out.print("Your current balance is: 75");
	    	}
	    else if (item.equalsIgnoreCase("Hat")){
	    	System.out.println("Thank you for your purchase! ");
	    	System.out.print("Your current balance is: 75");
	    	}
	    else if (item.equalsIgnoreCase("Headphones")){
	    	System.out.println("Thank you for your purchase! ");
	    	System.out.print("Your current balance is: 70");
	    	}
	    else if (item.equalsIgnoreCase("Laptop")){
	    	System.out.println("Sorry, not enough funds on your gift card!");
	    	}
	    else if (item.equalsIgnoreCase("Pants")){
	    	System.out.println("Thank you for your purchase! ");
	    	System.out.print("Your current balance is: 50");
	    	}
	    else if (item.equalsIgnoreCase("Pillow")){
	    	System.out.println("Thank you for your purchase! ");
	    	System.out.print("Your current balance is: 60");
	    	}
	    else if (item.equalsIgnoreCase("Smartphone")){
	    	System.out.println("Sorry, not enough funds on your gift card!");
	    	}
	    else if (item.equalsIgnoreCase("Socks")){
	    	System.out.println("Thank you for your purchase! ");
	    	System.out.print("Your current balance is: 95");
	    	}
	    else if (item.equalsIgnoreCase("USB cable")){
	    	System.out.println("Thank you for your purchase! ");
	    	System.out.print("Your current balance is: 90");
	    	}
	    
	    else System.out.print("Invalid item!");
		  
		s.close();
}
}

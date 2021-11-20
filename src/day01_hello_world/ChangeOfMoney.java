package day01_hello_world;

import java.util.Scanner;

public class ChangeOfMoney {
	
	public static void main(String[] args) {
		
		int quarters, dimes, nickels, pennies;

	    Scanner s = new Scanner(System.in);
	    System.out.print("Enter cents");
	    int givenCents = s.nextInt();

	    if (0<givenCents && givenCents<100){
	    	quarters = givenCents/25;
	    	dimes = givenCents%25/10;
	    	nickels = ((givenCents%25)%10)/5;
	    	pennies = (((givenCents%25)%10)%5);
	    	
	    	System.out.print("Your change is " + quarters +" quarters, " + dimes + " dimes, " + nickels + " nickels, " + pennies + " pennies");}
	    else System.out.print("Invalid cents amount");
		  
		s.close();

}
}
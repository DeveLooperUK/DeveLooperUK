package day01_hello_world;

import java.util.Scanner;

public class VideoGame {
	
	public static void main(String[] args) {
		
		int coupons, candies, gumballs;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of coupons:");
		coupons = input.nextInt();
		
		candies = coupons/10;
		gumballs = coupons%10/3;
		
		if(coupons>=3) {System.out.println("Number of Candies: "+candies+"\nNumber of Gumballs: "+gumballs);}
		
		else System.out.println("Not enough coupons");
		
		input.close();
		
	}

}

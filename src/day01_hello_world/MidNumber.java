package day01_hello_world;

import java.util.Scanner;

public class MidNumber {
	
	public static void main(String[] args) {
		
		
		int num1, num2, num3;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number:");
		num1 = input.nextInt();
		
		System.out.println("Enter second number:");
		num2 = input.nextInt();
		
		System.out.println("Enter third number:");
		num3 = input.nextInt();
		
			if((num1==num2 || num2==num3) || num1==num3) {System.out.println("Some numbers are equal! No mid number");}
		
			else if(num2>num1) {
				if(num3>num2) {System.out.println("Medium value is: " + num2);}
				else if(num1>num3) {System.out.println("Medium value is: " + num1);}
				else System.out.println("Medium value is: " + num3);
					}
			else if(num1>num2) {
				if(num3>num1) {System.out.println("Medium value is: " + num1);}
				else if(num2>num3) {System.out.println("Medium value is: " + num2);}
				else System.out.println("Medium value is: " + num3);
				}
		
		
		input.close();
		
	}

}

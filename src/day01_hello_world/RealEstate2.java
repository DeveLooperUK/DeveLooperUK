package day01_hello_world;

import java.util.Scanner;

public class RealEstate2 {
	
	  public static void main(String[] args) {
		    //DO NOT CHANGE
		    int propertyPrice = 0; 
				int numberOfBedrooms, garageSpots;
				float metroAccessibility, schoolScore, highwayAccessibility;
				boolean backyard, smoking, garage;
				String houseType;
				Scanner scan = new Scanner(System.in);
				System.out.println("*****************************************");
				System.out.println("* Welcome to the RealEstate calculator! *");
				System.out.println("*****************************************");
		    //WRITE YOUR CODE HERE
				
				System.out.println("Enter your property type:");
				houseType = scan.nextLine();
				houseType.toLowerCase();
				
				if(houseType.equalsIgnoreCase("condo")) {propertyPrice=50000;}
				else if(houseType.equalsIgnoreCase("townhouse")) {propertyPrice=75000;}
				else if(houseType.equalsIgnoreCase("single family home")) {propertyPrice=95000;}
				else System.out.println("Invalid house type!");
				
				System.out.println("Market report has been generated.\nYour estimate market price is: "+propertyPrice+"$");
				
				System.out.println("How many bedrooms do you have?");
				numberOfBedrooms = scan.nextInt();
				propertyPrice =  propertyPrice + numberOfBedrooms*30000;
				
				System.out.println("Market report has been generated.\nYour estimate market price is: "+propertyPrice+"$");
				
				System.out.println("Do you have a backyard?");
				backyard = scan.nextBoolean();
				
				if(backyard) {
					if(houseType.equalsIgnoreCase("condo")) {System.out.println("Backyard is not available for condo!");}
					else propertyPrice =  propertyPrice + 5000;
					}
				
				System.out.println("Market report has been generated.\nYour estimate market price is: "+propertyPrice+"$");
				
				/*
				if(backyard==true && houseType.equalsIgnoreCase("condo")) {System.out.println("Backyard is not available for condo!");}
				else if(backyard==true) {propertyPrice =  propertyPrice + 5000;}
				*/
				
				System.out.println("Do you have garage?");
				garage = scan.nextBoolean();
				if(garage) {
					System.out.println("How many spots?");
					garageSpots = scan.nextInt();
					if (garageSpots>10) {System.out.println("Pardon, it's not public parking!");}
					else propertyPrice =  propertyPrice + garageSpots*20000;
					}
				
				System.out.println("Market report has been generated.\nYour estimate market price is: "+propertyPrice+"$");
				
				System.out.println("How close is metro station?");
				metroAccessibility = scan.nextFloat();
				if(metroAccessibility<=1f) {propertyPrice =  propertyPrice + 10000;}
				else if((metroAccessibility>1f) && (metroAccessibility<3f)) {propertyPrice =  propertyPrice + 5000;}
				
				System.out.println("Market report has been generated.\nYour estimate market price is: "+propertyPrice+"$");
				
				System.out.println("How close is highway?");
				highwayAccessibility = scan.nextFloat();
				if(highwayAccessibility<=1f) {propertyPrice =  propertyPrice + 15000;}
				else if((highwayAccessibility>1f) && (highwayAccessibility<=5f)) {propertyPrice =  propertyPrice + 8000;}
				else if((highwayAccessibility>5f) && (highwayAccessibility<=20f)) {propertyPrice =  propertyPrice + 4000;}
				
				System.out.println("Market report has been generated.\nYour estimate market price is: "+propertyPrice+"$");
				
				System.out.println("What's the rating of nearest school?");
				schoolScore = scan.nextFloat();
				if(schoolScore<=10f && schoolScore>=8f) {propertyPrice =  propertyPrice + 45000;}
				else if((schoolScore>=4f) && (schoolScore<8f)) {propertyPrice =  propertyPrice + 20000;}
				else if(schoolScore<4f) {propertyPrice =  propertyPrice + 5000;}
				else System.out.println("Invalid input!");
				
				
				System.out.println("Market report has been generated.\nYour estimate market price is: "+propertyPrice+"$");
				
				System.out.println("Does any of your family members smoking?");
				smoking = scan.nextBoolean();
				if(smoking) propertyPrice =  propertyPrice - 5000;
				
				//reports a market result
				System.out.println("Market report has been generated.\nYour estimate market price is: "+propertyPrice+"$");
				
				scan.close();

}
}
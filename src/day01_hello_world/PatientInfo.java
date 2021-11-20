package day01_hello_world;

import java.util.Scanner;

public class PatientInfo {

	public static void main(String[] args) {
	
	    String firstName, lastName, fullName, email, street, state, city, address, contacts;
	    int age, zipcode;
	    double height, weight;
	    boolean isMarried;
	    long workPhoneNumber, personalPhoneNumber;
	    Scanner scan=new Scanner(System.in);
	   // this part is already provided DO NOT CHANGE
	    System.out.println("Welcome to the patient portal!");
	    System.out.println("Please enter your personal information");
	        System.out.println("Enter your first name");
	        firstName = scan.next();
	        scan.nextLine();

	        System.out.println("Enter your last name");
	        lastName = scan.next();
	        scan.nextLine();
	        
	        System.out.println("Enter your email");
	        email = scan.next();
	        scan.nextLine();//to capture Enter key press

	        System.out.println("Enter your street");
	        street = scan.nextLine();
	     // continue for city
	        //scan.nextLine();
	        System.out.println("Enter your city");
	        city = scan.next();
	        scan.nextLine();

	        System.out.println("Enter your state");
	        state = scan.next();
	        scan.nextLine();
	        

	        System.out.println("Enter your zip code");
	        zipcode = scan.nextInt();
	        scan.nextLine();

	        System.out.println("Enter your work phone number");
	        workPhoneNumber = scan.nextLong();
	        scan.nextLine();

	        System.out.println("Enter your personal phone number");
	        personalPhoneNumber = scan.nextLong();
	        scan.nextLine();

	        System.out.println("Enter your age");
	        age = scan.nextInt();
	        scan.nextLine();

	        System.out.println("Enter your height");
	        height = scan.nextDouble();
	        scan.nextLine();

	        System.out.println("Enter your weight");
	        weight = scan.nextDouble();
	        scan.nextLine();

	        System.out.println("Are you married?");
	        isMarried = scan.nextBoolean();
	        
	        
	        
	        fullName = lastName+", "+firstName;
	        address = street+", "+city+", "+state+" "+zipcode;
	        contacts = "work phone number - "+(long)workPhoneNumber+" , personal phone number - "+(long)personalPhoneNumber+", email: "+email;

	        

	        System.out.println("Patient personal information");
	        System.out.println("Full name: "+fullName);
	        System.out.println("Address: "+address);
	        System.out.println("Contacts: "+contacts);
	        System.out.println("Age: "+age);
	        System.out.println("Height: "+height);
	        System.out.println("Weight: "+weight+" pounds");
	        System.out.println("Married?: "+isMarried);



			  scan.close();
		
}}

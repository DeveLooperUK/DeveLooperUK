package day01_hello_world;

import java.util.Scanner;

public class Citizens {

	
	public static void main(String[] args) {
		
		int seniorCitizens, nonSeniorCitizens, age;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
		 seniorCitizens = input.nextInt();
		 nonSeniorCitizens = input.nextInt();
		 System.out.println("What is new citizen's age?");
		 age = input.nextInt();
		 
		 if (age>=65) {System.out.println("Senior Citizen");
		 seniorCitizens++;
		 }
		 else {System.out.println("Non-Senior Citizen");
		 nonSeniorCitizens++;}
		 
		 System.out.println("New seniorCitizens count " + seniorCitizens + "\nNew nonSeniorCitizens count " + nonSeniorCitizens);
		 input.close();
	}
}

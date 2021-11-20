package day01_hello_world;

import java.util.Scanner;

public class AndroidVersions {

	
	public static void main(String[] args) {
		
		/*
		 * Versions 
		 * 1.5 - Cupcake 
		 * 1.6 - Donut 
		 * 2.1 - Eclair 
		 * 2.2 - Froyo 
		 * 2.3 - Gingerbread 
		 * 3.1 - Honeycomb 
		 * 4.0 - Ice Cream Sandwich 
		 * 4.1 - Jelly Bean 
		 * 4.4 - KitKat 
		 * 5.0 - Lollipop 
		 * 8.0 - Oreo 
		 * 9.0 - Pie
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your smart phone's Android version:");
	    double version = input.nextDouble();


	    if (version==1.5){
	    	System.out.println("Cupcake");
	    	}
	    else if (version==1.6){
	    	System.out.println("Donut");
	    	}
	    else if (version==2.1){
	    	System.out.println("Eclair");
	    	}
	    else if (version==2.2){
	    	System.out.println("Froyo");
	    	}
	    else if (version==2.3){
	    	System.out.println("Gingerbread");
	    	}
	    else if (version==3.1){
	    	System.out.println("Honeycomb");
	    	}
	    else if (version==4.0){
	    	System.out.println("Ice Cream Sandwich");
	    	}
	    else if (version==4.1){
	    	System.out.println("Jelly Bean");
	    	}
	    else if (version==4.4){
	    	System.out.println("KitKat");
	    	}
	    else if (version==5.0){
	    	System.out.println("Lollipop");
	    	}
	    else if (version==8.0){
	    	System.out.println("Oreo");
	    	}
	    else if (version==9.0){
	    	System.out.println("Pie");
	    	}
	    
	    else System.out.print("Sorry, I don't know this version!");
		  
	    input.close();
}}

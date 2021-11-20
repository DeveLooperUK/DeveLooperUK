package day01_hello_world;

import java.util.Scanner;

public class TipCalculator {
	
	  public static void main(String[] args) {
		  
		  String split, quality;
		  
		    Scanner s = new Scanner(System.in);
		    
		    System.out.println("Split:");
		    split = s.nextLine();
		    
		    System.out.println("Number of people:");
		    int num = s.nextInt();
		   
		    System.out.println("Check amount:");
		    double amount = s.nextDouble();
		    		       	
		    double tip=0;
		    
		    	       	
			if(split.equalsIgnoreCase("Yes")) { 
			    System.out.println("Service Quality:");
		    	quality = s.next();
		    	quality = capitalize(quality);
			    switch(quality) {
		    	case "Poor":
		    		tip = amount*0.05;
		    		break;
		    	case "Fair":
		    		tip = amount*0.1;
					break;
		    	case "Good":
		    		tip = amount*0.15;
					break;
		    	case "Great":
		    		tip = amount*0.2;
					break;
		    	case "Excellent":
		    		tip = amount*0.25;
					break;
							}}
   
		    System.out.println("Number of people entered: " + "&".repeat(num));
		    System.out.println("Total to pay: " + (tip+amount));
		    System.out.println("Total tip: " + tip);
		    System.out.println("Total per person: " + (tip+amount)/num);
		    System.out.println("Tip per person: " + tip/num);
		    
		     
		  s.close();
		  }
	  
	  public static String capitalize(String str) {
		    if(str == null || str.isEmpty()) {
		        return str;
		    }

		    return str.substring(0, 1).toUpperCase() + (str.substring(1)).toLowerCase();
		}
	
	
}



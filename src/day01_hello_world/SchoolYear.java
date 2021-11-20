package day01_hello_world;

import java.util.Scanner;

public class SchoolYear {
	
	public static void main(String[] args) {
		
		/*less than 2, ineligible
			2, toddler
			3-5, early childhood
			6-7, young reader
			8-10, elementary
			11 and 12, middle
			13, impossible
			14-16, high school
			17-18, scholar
			greater than 18, ineligible
		 */
		
	    Scanner input = new Scanner(System.in);
	    
	    System.out.println("Enter age:");
	    int age = input.nextInt();
	    
	    
	    switch (age) {
	      
	      case 2:
	        System.out.println("toddler");
	        break;
	      case 3,4,5:
	        System.out.println("early childhood");
	        break;
	      case 6,7:
	        System.out.println("young reader");
	        break;
	      case 8,9,10:
	        System.out.println("elementary");
	        break;
	      case 11,12:
	        System.out.println("middle");
	        break;
	      case 13:
	        System.out.println("impossible");
	        break;
	      case 14,15,16:
		        System.out.println("high school");
		        break;
	      case 17,18:
		        System.out.println("scholar");
		        break;
	      default:
		        System.out.println("ineligible");
		        break;

	    }
		
	    input.close();
	}

}

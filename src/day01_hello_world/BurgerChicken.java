package day01_hello_world;

import java.util.Scanner;

public class BurgerChicken {
	
	  public static void main(String[] args) {
		    Scanner s = new Scanner(System.in);
		    String in = s.next();
		    
		    //your code here

		    if(in.equalsIgnoreCase("burger" )|| in.equalsIgnoreCase("chicken" )) {System.out.println("10.0");}
		    if(in.equalsIgnoreCase("soda" )) {System.out.println("2.0");}
		    if(in.equalsIgnoreCase("fries" )) {System.out.println("3.5");}
  
		  s.close();
		  }

}

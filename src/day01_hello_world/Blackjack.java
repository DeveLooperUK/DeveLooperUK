package day01_hello_world;

import java.util.Scanner;

public class Blackjack {
	
	  public static void main(String[] args) {
		     //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
		    // Variables are already declared and given
		    Scanner s = new Scanner(System.in);
		    
		    int house = s.nextInt();
		    int player = s.nextInt();
		    
		    //Write your code here:
		    
		    if(player>house) {
		    	if(player<=21) {System.out.println("player win");}
		    	else System.out.println("player bust");
		    }
		    else if(player==house) {System.out.println("its a tie");}
		    else System.out.println("player loss");
		    
		    s.close();

}}

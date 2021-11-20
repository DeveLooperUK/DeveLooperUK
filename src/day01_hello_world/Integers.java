package day01_hello_world;

import java.util.Scanner;

public class Integers {
	
	public static void main(String[] args) {
	     //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
	    // Variables are already declared and given
	    Scanner s = new Scanner(System.in);
	    int num = s.nextInt();

	    //your code here
	    
	    if (num<0) {System.out.println("num = "+num);System.out.println("negative");}
	    
	    else if(num>0) {System.out.println("num = "+num);System.out.println("positive");}
	    
	    else {System.out.println("num = "+num);System.out.println("zero");}
	    
	    s.close();

}
}
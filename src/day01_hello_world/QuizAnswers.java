package day01_hello_world;

import java.util.Scanner;

public class QuizAnswers {
	public static void main(String[] args) {

		   Scanner scan = new Scanner(System.in);
		    
		    System.out.println("what is the farthest planet in the solar system:" );
		    System.out.println("a)venus" );
		    System.out.println("b)pluto" );
		    System.out.println("c)neptune" );
		    
		    String answer = scan.nextLine();
		    
		    //your code here
		  if(answer.equalsIgnoreCase("a")){System.out.print("a is wrong");}
		  else if(answer.equalsIgnoreCase("b")){System.out.print("b is correct");}
		  else if(answer.equalsIgnoreCase("c")){System.out.print("c is wrong");}
		  else System.out.print(answer + " is not a valid answer");
		  
		scan.close();

}}

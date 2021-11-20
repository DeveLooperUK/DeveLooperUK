package day01_hello_world;

import java.util.Scanner;

public class CalculateTime {

	
	public static void main(String[] args) {
		
		int inputSeconds, hours, minutes, seconds;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter seconds:");
		inputSeconds = scan.nextInt();
		
		hours = inputSeconds/3600;
		minutes = (inputSeconds%3600)/60;
		seconds = (inputSeconds%3600)%60;
		System.out.println(hours+" hours, "+minutes+" minutes, and "+seconds+" seconds");
		scan.close();
}
}
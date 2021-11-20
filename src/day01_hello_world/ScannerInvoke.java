package day01_hello_world;

import java.util.Scanner;

public class ScannerInvoke {
	
		public static void main(String[] args) {
		
			Scanner scan =  new Scanner(System.in);
			System.out.print("Type job: ");
			String X = scan.nextLine();

			System.out.print("Type where you will be: ");
			String Y = scan.nextLine();
		
			System.out.print("Type who you will be married: ");
			String Z = scan.nextLine();
		
			System.out.print("Type how many kids you will have: ");
			int N = scan.nextInt();
		
			System.out.println("You will be a "+X+" in "+ Y+" and married to " +Z +" with "+N +" kids.");
		
			scan.close();		
	}

}

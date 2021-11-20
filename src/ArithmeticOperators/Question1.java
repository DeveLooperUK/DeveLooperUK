package ArithmeticOperators;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter gallon amount to convert to liter: ");
		int gallon = scan.nextInt();
		double liter = gallon *  3.7854;

		System.out.println(gallon +" gallon is " + liter +" liter");
		
		scan.close();
	}

}

package Assignment5ForLoop;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int product = num * 10;
		while(product<100) {
		
		product = num * 10;
		
		}
		
		scan.close();
	}

}

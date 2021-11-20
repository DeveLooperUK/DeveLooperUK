package Assignment5ForLoop;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {

		//  0, 1, 1, 2, 3, 5, 8, 13, 21, 34,...... Fibonacci series
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int i, n1 = 0, n2 = 1, n3;
		
		System.out.print(n1+", "+n2);
		
		for(i=3 ; i<num+1 ; i++) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			
			System.out.print(", " + n3);
			}
		scan.close();
	}

}

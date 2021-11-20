package Assignment5ForLoop;

import java.util.Scanner;

public class Question8 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int upperBound = scan.nextInt();
		int sum=0;
		for(int i=1 ; i<upperBound+1 ; i++) {
			sum += i;
			}
		System.out.println(sum);
	scan.close();
	}
}

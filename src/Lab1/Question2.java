package Lab1;

public class Question2 {
	
	public static void main(String[] args) {
		
		System.out.println(love6(4,2));
	}
	
	static Boolean love6(int num1, int num2) {
		if (num1 == 6 || num2 == 6) {return true;}
		else if ((num1 + num2) == 6 || (num1 - num2) == 6) {return true;}
		else return false;
	}
	

}

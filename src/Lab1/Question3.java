package Lab1;

public class Question3 {
	
	public static void main(String[] args) {
		
		System.out.println(specialEleven(33));
		System.out.println(specialEleven(34));
		System.out.println(specialEleven(35));
		
	}
	
	static Boolean specialEleven(int a) {
		
		if(a%11 == 0 || a%11 == 1) {return true;}
		else return false;
		
	}
	

}

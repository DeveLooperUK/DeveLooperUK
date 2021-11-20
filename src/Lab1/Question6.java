package Lab1;

public class Question6 {

	public static void main(String[] args) {
		
		System.out.println(cigarParty(30, false));
		System.out.println(cigarParty(50, false));
		System.out.println(cigarParty(70, true));
		
	}
	
	static Boolean cigarParty(int numCigars, boolean isWeekend) {
		
		if (isWeekend) {
			if(numCigars >= 40) {return true;}
			else return false;
			}
		else {
			if(numCigars >= 40 && numCigars <= 60) {return true;}
			else return false;
			}
		
	}

}

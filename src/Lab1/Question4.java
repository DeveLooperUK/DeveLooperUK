package Lab1;

public class Question4 {

	
public static void main(String[] args) {
		
		System.out.println(deerPlay(70, false));
		System.out.println(deerPlay(95, false));
		System.out.println(deerPlay(97, true));
		
	}
	
	static Boolean deerPlay(int temp, boolean isSummer) {
		
		if (isSummer) {
			if(temp >= 60 && temp <= 100) {return true;}
			else return false;
			}
		else {
			if(temp >= 60 && temp <= 90) {return true;}
			else return false;
			}
	}
	
}

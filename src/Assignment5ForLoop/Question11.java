package Assignment5ForLoop;

public class Question11 {

	
	public static void main(String [] args) {
		
		int lines = 4;

		for (int i = 1; i <= lines; i++){
			
	    	System.out.print ("  ".repeat(i-1));
	    	
		    for (int j = lines - i + 1; j >= 1; j--){

		        System.out.print (j + "   ");
		    }

		    System.out.println("\n");
		}
	}
}

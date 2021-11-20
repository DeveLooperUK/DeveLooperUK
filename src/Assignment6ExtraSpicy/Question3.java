package Assignment6ExtraSpicy;

public class Question3 {
	
	public static void main(String[] args) {
		
		int rows = 7;

	    for (int i = 0; i < rows; ++i) {
	    	System.out.print(" ".repeat(i));
		      for (int j = i + 1; j < rows+1; j++) {
		        System.out.print(j + " ");
		      }
		      System.out.println("\n");
		      
		    }
	    
	    for (int i = rows-1; i > 0; --i) {
	    	System.out.print(" ".repeat(i-1));
		      for (int j = i; j < rows+1; j++) {
		        System.out.print(j + " ");
		      }
		      System.out.println("\n");
		      
		    }	
	}

}
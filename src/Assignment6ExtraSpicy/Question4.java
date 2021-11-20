package Assignment6ExtraSpicy;

public class Question4 {

	public static void main(String [] args) {
	int rows = 7;

    for (int i = rows; i > 0; --i) {
	      for (int j = rows; j >i-1; j--) {
	        System.out.print(j%2);
	      }
	      System.out.println("\n");
	      
	    }
	}
}

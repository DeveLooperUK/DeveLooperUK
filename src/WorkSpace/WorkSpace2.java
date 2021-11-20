package WorkSpace;
import java.util.*;


public class WorkSpace2 {

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

		String [] guestNames= {};
	    String continueing;
	    int i=0;
	    do {
	      System.out.println("Please enter guest name:");
	      guestNames[i] = input.nextLine();
	      System.out.println("Do you want to enter new guest name:");
	      continueing = input.nextLine();
	      i++;
	    } while(continueing.equalsIgnoreCase("yes"));
	    System.out.print("Guest's list: ");
	    for(int j = 0; j<guestNames.length; j++) {
	    	System.out.print(guestNames);
	    }
	}

}

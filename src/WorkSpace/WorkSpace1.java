package WorkSpace;

import java.util.Scanner;

public class WorkSpace1 {
	public static void main(String[] args) {

//	    Scanner scan = new Scanner(System.in);
//	    String str = scan.next();
//	    int n = scan.nextInt();
//	    
//	    boolean checkPrefix = false;
//	    String subStr = str.substring(0,n);
//	    for(int i = 0; i < str.length()-n; i++) {
//	    	if(str.substring(i+1,i+n+1).equals(subStr)) {
//	    		checkPrefix = true;
//	    	}
//	    }
		String s = "rumble";
		s += s.concat("4").substring(3,s.length()-1);
	    System.out.println(s);
	    
	    

		  }

}

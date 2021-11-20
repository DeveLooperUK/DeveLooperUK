package WorkSpace;


import java.util.Scanner;

public class Workspace3 {

	  public static boolean getThunderBlazz(boolean available,boolean gift, int ingredient1 
			  , int ingredient2, int ingredient3){
			    
			// your cOPL90HUTYode here
			    if(getThunderBlazz(true, gift, ingredient1, ingredient2, ingredient3)){return true;}
			    else return false;
			    
			  }


			  public static void main(String[] args) {
			    Scanner in = new Scanner(System.in);
				System.out.println(getThunderBlazz(in.nextBoolean(), in.nextBoolean(), in.nextInt(), in.nextInt(), in.nextInt()));
			  }

}

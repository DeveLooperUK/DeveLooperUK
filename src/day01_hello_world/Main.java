package day01_hello_world;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	    // write your code here

		Scanner scan = new Scanner(System.in);
	    System.out.print("Enter Item1 and its price:"); 
		  String item1 = scan.nextLine();
		  float price1 = scan.nextFloat();
	    System.out.println("Item1: "+item1+" "+"Price: "+price1);
	    System.out.print("Enter Item2 and its price:"); 
		  String item2 = scan.nextLine();
		  float price2 = scan.nextFloat();
	    System.out.println("Item2: "+item2+" "+"Price: "+price2);
	    System.out.print("Enter Item3 and its price:"); 
		  String item3 = scan.nextLine();
		  float price3 = scan.nextFloat();
	    System.out.println("Item3: "+item3+" "+"Price: "+price3);
	       
	      
	    }

}

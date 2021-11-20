package Assignment5ForLoop;

public class Question9 {
	
	
	public static void main(String [] args) {
		@SuppressWarnings("unused")
		String strUnnecessary = null;
		
		int count = 0, end = 11;
				
		while(count <= end) {
			
			if(count%2 == 1) {System.out.print(count);
				if(count == end ^ count == end - 1) {break;}
					System.out.print(", ");
				}
			count++;
		}
		
		System.gc();
	
	
}}
package Assignment6ExtraSpicy;

public class Question5 {
	
	public static void main(String[] args){
		
		int rows = 7;


		      for (int j = rows; j>0; j--) {
		    	String s = String.valueOf(rows-j+1);
		        System.out.println("1".repeat(j-1) + s.repeat(rows-j+1) + "\n");
		        
		      }
		      
		    
	}

}

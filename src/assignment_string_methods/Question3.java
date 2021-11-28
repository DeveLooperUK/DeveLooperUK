package assignment_string_methods;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        if(word.length()%2==1){
            if(word.length()>2){
                System.out.print(word.charAt(word.length()/2));
            }
            else System.out.print(word.repeat(3));
        }
        else{
            if(word.length()>3){
                System.out.print(word.substring((word.length()/2)-1, (word.length()/2)+1));
            }
            else System.out.print(word.repeat(2));
        }
        scan.close();
    }
}

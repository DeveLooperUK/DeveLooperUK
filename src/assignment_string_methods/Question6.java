package assignment_string_methods;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        if(word.length()<5){System.out.print("Too short!");}
        else if(word.length()==5){
            String reversedWord = "";
            for(int i=word.length()-1; i>=0; i--) {
                reversedWord = reversedWord + word.charAt(i);
            }
            System.out.println(reversedWord);
        }
        else System.out.print("Too long!");
        scan.close();
    }
}

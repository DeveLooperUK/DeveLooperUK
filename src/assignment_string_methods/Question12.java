package assignment_string_methods;

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if(word.toLowerCase().startsWith("x")) {
            word = word.substring(1);
            if(word.toLowerCase().endsWith("x")) {
                word = word.substring(0,word.length()-1);
            }
            System.out.println(word);
        }
        else if(word.toLowerCase().endsWith("x")) {
            word = word.substring(0,word.length()-1);
            if(word.toLowerCase().startsWith("x")) {
                word = word.substring(1);
            }
            System.out.println(word);
        }
        else System.out.println(word);
        scan.close();
    }
}

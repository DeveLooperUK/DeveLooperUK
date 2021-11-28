package assignment_string_methods;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        System.out.print(word.substring(0,word.length()/2).repeat(2));
        scan.close();
    }
}

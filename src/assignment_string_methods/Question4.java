package assignment_string_methods;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        if(word.length()%2==1 && word.length()>4){
            System.out.print(word.substring(word.length()/2-1, word.length()/2+2));
        }
        else System.out.print("invalid");
        scan.close();
    }
}

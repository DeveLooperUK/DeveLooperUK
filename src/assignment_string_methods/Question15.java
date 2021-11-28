package assignment_string_methods;

import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();
        boolean flag = false;
        String word1 = "cat", word2 = "dog";
        for(int i = 0; i < word.length()-2; i++){
            if(word.substring(i, i+3).equals(word1)) {
                countOfCats++;
            }
            if(word.substring(i, i+3).equals(word2)){
                countOfDogs++;
            }
        }

        if(countOfCats == countOfDogs){
            flag = true;
            System.out.println(flag);
        }
        else System.out.println(flag);
        scan.close();
    }
}

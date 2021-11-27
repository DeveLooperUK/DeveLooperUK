package AssignmentArray;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        char arr [] = new char[] {'A', 'Z', 'B', 'N', 'P', 'T', 'X', 'C'};
        Scanner scanner = new Scanner(System.in);
        char searchChar = scanner.next().charAt(0);
        boolean flag = false;
        for (Character charElement : arr) {
            if (charElement == searchChar) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println(searchChar + " found!");
        }
        else System.out.println(searchChar + " Not found!");
    }
}

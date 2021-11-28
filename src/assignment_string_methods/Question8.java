package assignment_string_methods;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        if (a.contains("alejandro")) {
            System.out.print("read");
        } else {
            System.out.print("don't read");
        }
        s.close();
    }
}

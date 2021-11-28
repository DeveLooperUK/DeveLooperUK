package assignment_string_methods;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        System.out.println("First name: " + capitalize(email.substring(0, email.indexOf("_"))));
        System.out.println("Last name: " + capitalize(email.substring(email.indexOf("_")+1, email.indexOf("@"))));
        System.out.println("Domain: " + email.substring(email.indexOf("@")+1,email.indexOf(".")));
        System.out.println("Top-Level Domain: " + email.substring(email.indexOf(".", email.indexOf("@"))+1));
        scan.close();
    }
    public static String capitalize(String str)
    {
        if(str == null) return str;
        else return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}

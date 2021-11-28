package assignment_string_methods;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        if(email.contains("_")){
            System.out.print(email.substring(email.indexOf("_")+1, email.indexOf("@"))+"_"+email.substring(0, email.indexOf("_"))+email.substring(email.indexOf("@")));
        }
        else System.out.print(email);
        scan.close();
    }
}

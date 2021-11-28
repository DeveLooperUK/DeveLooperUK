package assignment_string_methods;

import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        printRoute(scan.next().substring(0,1), scan.next().substring(0,1));
        scan.close();
    }
    public static void printRoute(String start, String end){
        String route = "ABCDABC";
        int indexStart = route.indexOf(start);
        int indexEnd = route.indexOf(end, route.indexOf(start));
        for (int i = indexStart; i < indexEnd; i++) {
            if (route.substring(i,i+2).equals("AB")) {
                System.out.print("right");
            }
            else if (route.substring(i,i+2).equals("BC")) {
                System.out.print("down");
            }
            else if (route.substring(i,i+2).equals("CD")) {
                System.out.print("left");
            }
            else if (route.substring(i,i+2).equals("DA")) {
                System.out.print("up");
            }
            if (i != indexEnd-1) {
                System.out.print(" > ");
            }
            if (i == indexEnd-1) {
                System.out.print(":");
            }
        }
        System.out.println(" " + end + " found");
    }
}

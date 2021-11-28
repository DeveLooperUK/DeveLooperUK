package assignment_string_methods;

import java.util.Scanner;

public class Question1 {

    public static void tipCalculator(boolean isSplit, int numberPeople, double checkAmount, String serviceQuality){

        double tip = 0;
        if(isSplit) {
            serviceQuality = capitalize(serviceQuality);
            switch(serviceQuality) {
                case "Poor":
                    tip = checkAmount*0.05;
                    break;
                case "Fair":
                    tip = checkAmount*0.1;
                    break;
                case "Good":
                    tip = checkAmount*0.15;
                    break;
                case "Great":
                    tip = checkAmount*0.2;
                    break;
                case "Excellent":
                    tip = checkAmount*0.25;
                    break;
            }}

        System.out.println("Number of people entered: " + "&".repeat(numberPeople));
        System.out.println("Total to pay: " + (tip + checkAmount));
        System.out.println("Total tip: " + tip);
        System.out.println("Total per person: " + (tip + checkAmount)/numberPeople);
        System.out.println("Tip per person: " + (tip / numberPeople));

    }

    public static String capitalize(String str) {
        if(str == null || str.isEmpty()) {
            return str;
        }

        return str.substring(0, 1).toUpperCase() + (str.substring(1)).toLowerCase();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        tipCalculator(s.nextBoolean(), s.nextInt(), s.nextDouble(), s.next());
        s.close();
    }

}

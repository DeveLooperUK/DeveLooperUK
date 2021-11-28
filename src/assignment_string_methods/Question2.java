package assignment_string_methods;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {

        double price  = 0;

        System.out.println("Select screen size:");
        Scanner scan =new Scanner (System.in);
        double screenSize = scan.nextDouble();

        if(screenSize == 13.3) {price += 200;}
        else if(screenSize == 15.0) {price += 300;}
        else if(screenSize == 17.3) {price += 400;}
        else System.out.println("Invalid screen size!");

        System.out.println("Select CPU type:");
        String cpuType = scan.next();
        if(cpuType.equalsIgnoreCase("i3")) {price += 150;}
        else if(cpuType.equalsIgnoreCase("i5")) {price += 250;}
        else if(cpuType.equalsIgnoreCase("i7")) {price += 350;}
        else System.out.println("Invalid CPU type!");

        System.out.println("Select RAM size:");
        int ramSize = scan.nextInt();
        if(ramSize%4 != 0) {System.out.println("Invalid RAM size!");}
        else price += (ramSize/4)*50;

        System.out.println("Select storage type:");
        String storageType = scan.next();
        if(storageType.equalsIgnoreCase("hdd")) {
            System.out.println("Enter memory size:");
            int memorySize = scan.nextInt();
            if(memorySize%500 != 0) {System.out.println("Invalid memory size!");}
            else price += (memorySize/500)*50;}

        else if(storageType.equalsIgnoreCase("ssd")) {
            System.out.println("Enter memory size:");
            int memorySize = scan.nextInt();
            if(memorySize%500 != 0) {System.out.println("Invalid memory size!");}
            else price += (memorySize/500)*100;}

        else System.out.println("Invalid storage type!");


        System.out.println("Enter screen resolution:");
        String screenSolution = scan.next();

        if(screenSolution.equalsIgnoreCase("FULLHD")) {price += 100;}
        else if(screenSolution.equalsIgnoreCase("4K")){price += 200;}
        else System.out.println("Invalid screen resolution!");

        System.out.println("Laptop price is: $"+ price);

        scan.close();

    }
}

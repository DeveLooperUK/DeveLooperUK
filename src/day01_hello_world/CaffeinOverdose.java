package day01_hello_world;

import java.util.Scanner;

public class CaffeinOverdose {
	public static void main(String[] args) {
	
	int numOfMilligrams, numOfDrinks;
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter number of milligrams in drink:");
	numOfMilligrams = scan.nextInt();
	
	numOfDrinks = 10000/numOfMilligrams;

	System.out.println("It would take about "+numOfDrinks+" drinks for a lethal overdose.");
	scan.close();
}}

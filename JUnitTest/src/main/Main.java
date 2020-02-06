package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter two values to add them together");
		
		System.out.print("Value 1: ");
		int number1 = InputControl("Use only integers");
		
		System.out.print("Value 2: ");
		int number2 = InputControl("Use only integers");
		
		int answer = number1+number2;
		System.out.println("The answer is: " + answer);
		
	}
	
	
	public static int InputControl (String str) { //Checks if input from scanner is an Int or not
		Scanner input = new Scanner(System.in);
		while(!input.hasNextInt()) {
			System.out.println(str);
			input.next();
		}
		int int1 = input.nextInt();
		return int1;

	}
	
}

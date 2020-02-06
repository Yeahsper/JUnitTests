package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter two values to add them together");
		
		System.out.print("Value 1: ");
		int number1 = scan.nextInt();
		System.out.print("Value 2: ");
		int number2 = scan.nextInt();
		int answer = number1+number2;
		System.out.println("The answer is: " + answer);
		
	}
}

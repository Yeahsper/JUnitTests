package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter two values to add them together");
		
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		int answer = number1+number2;
		System.out.println("The answer is: " + answer);
		
	}
}

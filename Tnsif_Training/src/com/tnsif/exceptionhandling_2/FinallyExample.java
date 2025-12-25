package com.tnsif.exceptionhandling_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyExample {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		try {
			System.out.println("Enter the number : ");
			int number = s.nextInt();
			System.out.println((number % 2 == 0 )? " is Even" : " is Odd");
			} catch (InputMismatchException e) {
			System.err.println("Invalid input...");

		} finally {
			System.out.println("execute....");
			s.close(); 
		}
	}
}

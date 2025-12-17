package com.tnsif.introofjava;

public class BasicCode {

	public static void main(String[] args) {
		
		int age = 21;
		double salary = 50000.00;
		boolean isPassed = true;
		char grade = 'A';
		
		
		double newSalary = age; //Implicit or internal conversion - Data widening
		
		int roundSalary = (int)salary; // Explicit or External - Data Narrowing
		
		//Arithmetic operation
		int increment = 5000;
		
		int total = roundSalary + increment;
		
		
		System.out.println(age);
		System.out.println(salary);
		System.out.println(roundSalary);
		System.out.println(total);

	}

}

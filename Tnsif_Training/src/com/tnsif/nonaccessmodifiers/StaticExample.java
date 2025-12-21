package com.tnsif.nonaccessmodifiers;

public class StaticExample {
	
	
	static int count;
	
	int variable; 
	

	static {
		
		count = 15;
		
		
		
		System.out.println("Showing the static vatiable count: "+count);
	}
	
	
	
	static void display() {
		System.out.println("Displaying the static method with count: "+count);
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Printing the main method");

		display();
	}

}

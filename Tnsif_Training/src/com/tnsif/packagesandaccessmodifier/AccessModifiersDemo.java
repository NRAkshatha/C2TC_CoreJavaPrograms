package com.tnsif.packagesandaccessmodifier;

public class AccessModifiersDemo {
	
	
	public int publicVar = 100;
	protected int protectedvar = 200;
	private int privateVar = 300;
	int defaultvar = 40;
	
	public	void showDetails() {
		System.out.println("Public Variable: "+publicVar);
		System.out.println("Protected Variable: "+protectedvar);
		System.out.println("Private Variable: "+privateVar);
		System.out.println("Default Variable: "+defaultvar);
	}

	public static void main(String[] args) {
		
		AccessModifiersDemo amd = new AccessModifiersDemo();
		amd.showDetails();
	

	}

}


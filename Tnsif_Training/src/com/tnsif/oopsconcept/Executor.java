package com.tnsif.oopsconcept;

public class Executor {

	public static void main(String[] args) {
		
		EncapsulationDemo ED = new EncapsulationDemo();
		ED.setName("M S Dhoni");
		ED.setAge(44);
		ED.setJersyNo(7);
		ED.setTeam("CSK");
		System.out.println(ED);
		
		Executor e = new Executor();
		System.out.println(e);

	}
	
	

}
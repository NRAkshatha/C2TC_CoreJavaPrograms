package com.tnsif.collections_list;

import java.util.Iterator;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		Vector<String> food = new Vector<>();
		food.add("dosa");
		food.add("poori");
		food.add("fried rice");

		System.out.println("Initial Vector: " + food);
		
		String element = food.get(1);
		System.out.println("Element at index 1: " + element);

		
		Iterator<String> iterate = food.iterator();
		System.out.print("Vector: ");
		while (iterate.hasNext()) {
			System.out.print(iterate.next());
			
		}
		
		element = food.remove(2);
		System.out.println("Removed Element: " + element);
		System.out.println("New Vector: " + food);

		food.clear();
		System.out.println("after clear(): " + food);
	}

}

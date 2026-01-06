package com.tnsif.collections_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList l1 = new ArrayList();
		System.out.println("Size : "+l1.size());
		System.out.println("Is list empty? "+l1.isEmpty());
		l1.add(50);
		l1.add(20);
		l1.add(true);
		l1.add(false);
		l1.add(20);
		l1.add("welcome");
		l1.add(53.02);
		l1.add(20);
		l1.add("cat");
		l1.add(6, "Hi");
		System.out.println("List is "+l1);

		System.out.println("Is list conatins 20? "+l1.contains(20));

		l1.remove(false);
		System.out.println("List is "+l1);

		

		System.out.println("Element at 5 location is : "+l1.get(5));
		
		System.out.println("Element removed : "+l1.remove(l1.lastIndexOf(20))); 
		System.out.println("Element removed : "+l1.remove(l1.indexOf(20))); 
		System.out.println("List is "+l1);
        l1.clear();
		System.out.println("List is "+l1);

		List<String> names = new ArrayList<String>();
		names.add("Achu");
		names.add("Roshan");
		names.add("Mohit");
		names.add("Rohit");
		names.add("Lal");
		
		
		System.out.println("Name List is "+names);
		
		Collections.reverse(names);
		System.out.println("Reverse Name List is "+names);

		System.out.println("Is \'Mohit\' contains in name list? "+names.contains("Mohit"));

		System.out.println("Name List Before Sorting is "+names);
		Collections.sort(names);
		System.out.println("Sorting in Ascending order " + names);
		
		Collections.reverse(names);
		System.out.println("Sorting in Descending order " + names);

		
		System.out.println(" Traversing a list ");
		Iterator<String> i = names.iterator();
		while (i.hasNext()) {
			String nm = i.next();
			System.out.println(nm);
			if (nm.equals("Ankit"))
				i.remove();
		}
	
		System.out.println("Name list is "+names);
		System.out.println("Traversing a list in backward manner -");
		ListIterator<String> li=names.listIterator(names.size());
		while(li.hasPrevious())
		{
			String nm = li.previous();
			System.out.println(nm);			
		}

	}

}

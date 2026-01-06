
package com.tnsif.collections_list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		l1.add(50);
		l1.add(10);
		l1.add(20);
		l1.addFirst(5);
		l1.add(2, 60);
		l1.addLast(65);
		l1.add(3);

		System.out.println("Number List is " + l1);

		System.out.println("First Element is " + l1.getFirst());
		System.out.println("Last Element is " + l1.getLast());

		l1.removeFirst();
		l1.removeLast();

		System.out.println("after removing first and last element is " + l1);

		ListIterator<Integer> li = l1.listIterator();

		while (li.hasNext())
			System.out.print(li.next() + "\t");

		li = l1.listIterator(l1.size());
		while (li.hasPrevious()) {
			int n = li.previous();
			System.out.print(n + "\t");
			if (n == 20)
				li.add(369);
			if (n == 60)
				li.set(895);
		}
		
		System.out.println("Number List is " + l1);
		
		Collections.sort(l1);
		System.out.println("Ascending order is " + l1);
		
		Collections.reverse(l1);
		System.out.println("Descending order is " + l1);

	}
}

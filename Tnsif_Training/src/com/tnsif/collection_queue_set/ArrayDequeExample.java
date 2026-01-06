package com.tnsif.collection_queue_set;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ArrayDequeExample {

	public static void main(String[] args) {
		Deque<String> arrayDeque = new ArrayDeque<String>();
		arrayDeque.add("cat");
		arrayDeque.add("wolf");
		arrayDeque.add("dog");

		arrayDeque.offer("Fox");

		arrayDeque.offerFirst("Donkey");
		
		arrayDeque.offerLast("Elephant");

		Iterator<String> itr = arrayDeque.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("After poll");
		String s = arrayDeque.poll();
		System.out.println("Poll Item is:" + s);

		for (String item : arrayDeque) {
			System.out.println(item);
		}
	}
}
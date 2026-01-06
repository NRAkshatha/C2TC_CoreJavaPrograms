package com.tnsif.collection_queue_set;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

	public static void main(String args[]) {
		Queue<String> pq = new PriorityQueue<>();

		pq.add("hello");
		pq.add("welcome");
		pq.add("hi");
		pq.add("good morning");

		System.out.println(pq);
		pq.remove("hi");

		System.out.println("after Remove " + pq);

		System.out.println("Poll  " + pq.poll());

		System.out.println("Final  " + pq);

		Iterator<String> iterator = pq.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next() + " ");
		}

		
		System.out.println(pq.peek());

		System.out.println(pq.poll());

		
		System.out.println(pq.peek());
	}

}

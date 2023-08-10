/*
 * This data structure represent heap.
 * Implemented as a array.
 *
 * Priority:
 * 	If value is small priority is high.
 * 	If value is large priority is low.
 *
 * Always highest priority element will be deleted first.
 * Heap is represented as binary tree(smallest element).
 *
 * Using comparator we can change the priority or convert minheap to maxheap.
 */

import java.util.*;

class priority_queue {

	public static void main(String ...args) {

		// min-heap default.
		//PriorityQueue<Integer> pq = new PriorityQueue<>();

		// max-heap.
		PriorityQueue<Integer> pq = new PriorityQueue<>(new MyCom());

		pq.add(20);
		pq.add(10);
		pq.add(30);
		pq.add(5);
		pq.add(15);
		pq.add(3);

		System.out.println(pq.peek() + "\n");

		pq.forEach((x) -> System.out.print(x + " "));
		System.out.println();
		
		pq.poll();
		pq.forEach((x) -> System.out.print(x + " "));
		System.out.println();

	
	}
}

// To make max-heap
class MyCom implements Comparator<Integer> {

	public int compare(Integer o1, Integer o2) {
		if(o1 < o2)
			return 1;
		if(o1 > o2)
			return -1;
		return 0;
	}
}

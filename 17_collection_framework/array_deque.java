/*
 * Double ended queue.
 */
import java.util.*;

class array_deque {

	public static void main(String ...args) {

		ArrayDeque<Integer> ad = new ArrayDeque<>();

		ad.offerLast(10);
		ad.offerLast(20);
		ad.offerLast(30);
		ad.offerLast(40);

		ad.forEach((x) -> System.out.print(x + " "));
		System.out.println();
		
		// If inserting and deleting from last it will become stack.
		ad.pollLast();
		ad.forEach((x) -> System.out.print(x + " "));
		System.out.println();

		// If inserting at last and deleting from last it will become queue.
		ad.pollFirst();
		ad.forEach((x) -> System.out.print(x + " "));
		System.out.println();

		ad.offerFirst(1);
		ad.offerFirst(2);
		ad.offerFirst(3);
		ad.offerFirst(4);

		ad.forEach((x) -> System.out.print(x + " "));
		System.out.println();

	}
}

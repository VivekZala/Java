import java.util.*;

class linked_list {

	public static void main(String ...args) {

		LinkedList<Integer> li1 = new LinkedList<>();
		LinkedList<Integer> li2 = new LinkedList<>(List.of(50, 60, 70, 80, 90));

		li1.add(10);
		li1.add(0, 5);
		li1.addAll(1, li2);
		li1.add(5, 70);
		li1.set(6, 100);
		li1.addFirst(3);
		li1.addLast(100);

		for(var x: li1) 
			System.out.print(x + " ");

	}
}

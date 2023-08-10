import java.util.*;

class arraylist_and_iterator {

	public static void main(String ...args) {

		ArrayList<Integer> al1 = new ArrayList<>(20);
		ArrayList<Integer> al2 = new ArrayList<>(List.of(50, 60, 70, 80, 90));

		al1.add(10);
		al1.add(0, 5);
		// al1.addAll(al2);
		al1.addAll(1, al2);
		al1.add(5, 70);
		al1.set(6, 100);

		System.out.println(al1);
		System.out.println(al1.contains(50));
		System.out.println(al1.get(5));
		System.out.println(al1.indexOf(70));
		System.out.println(al1.lastIndexOf(70));
		System.out.println();

		// Iterating each element at a time form ArrayList.

		// Using for loop.
		for(int i = 0; i < al1.size(); i++) 
			System.out.print(al1.get(i) + " ");
		System.out.println();

		// Using for each loop.
		for(Integer x: al1)
			System.out.print(x + " ");
		System.out.println();

		// Using var.
		for(var x: al1)
			System.out.print(x + " ");
		System.out.println();

		// Using Iterator. One way only next element (forward direction access only).
		Iterator<Integer> it = al1.iterator();
		while(it.hasNext())
			System.out.print(it.next() + " ");
		System.out.println();

		// Using ListIterator. Bi-directional we can go previous as well as next.
		ListIterator<Integer> li = al1.listIterator();
		while(li.hasNext())
			System.out.print(li.next() + " ");
		System.out.println();

		// ListIterator using for loop.
		for(ListIterator<Integer> i = al1.listIterator(); i.hasNext();)
			System.out.print(i.next() + " ");
		System.out.println();

		// for each method of ArrayList class.
		al1.forEach(n -> System.out.print(n + " "));
		System.out.println();

		// Using scope resolution operator.
		al1.forEach(System.out::println);

	}
}

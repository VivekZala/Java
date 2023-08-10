import java.util.*;

public class hashset {

	public static void main(String ...args) {

		HashSet<Integer> h = new HashSet<>();
		// HashSet<Integer> h = new HashSet<>(20, 0.25f); // Initial size and loading capacity.

		// Insertion order doesn't matter.
		h.add(10);
		h.add(20);
		h.add(30);
		h.add(10); // Duplicate values are not allowed while printing it will show only unique elements.

		System.out.println(h);

		h.remove(10);
		System.out.println(h);

	}
}

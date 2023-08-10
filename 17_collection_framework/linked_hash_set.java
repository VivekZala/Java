/*
 * In linkedHashSet we just store the value.
 * This will maintain the order in which values are inserted.
 */

import java.util.*;

class linked_hash_set {

	public static void main(String ...args) {

		LinkedHashSet<String> lhs = new LinkedHashSet<>(10);

		lhs.add("A");
		lhs.add("C");
		lhs.add("E");
		lhs.add("B");
		lhs.add("D");
		lhs.add("A"); // Duplicate is not allowed.

		lhs.forEach((k) -> System.out.println(k));

	}
}

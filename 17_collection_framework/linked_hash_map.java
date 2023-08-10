/*
 * LinkedHashMap will maintain the order in which the keys are inserted.
 * We can specify the limit: If limit for linked hash map is set to 10 then and if 1 more key is inserted then first key will be deleted. The keys will be deleted in the order of insertition.
 */

import java.util.*;

class linked_hash_map {

	public static void main(String ...args) {

		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>(5);
		
		// This will maintain the order in which it is accessed(LRU).
		// LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>(5, 0.75f, true);

		// To restrict the size of linkedHashMap to a specific value, we should override method called removeEldestEntry()
		/*
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>(5, .75f, true) {
			protected boolean removeEldestEntry(Map.Entry e) {
				return size() > 5;
			}
		};
		*/

		lhm.put(1, "A");
		lhm.put(2, "B");
		lhm.put(3, "C");
		lhm.put(4, "D");
		lhm.put(5, "E");
		lhm.put(6, "F");

		lhm.forEach((k, v) -> System.out.println(k + " " + v));

	}
}

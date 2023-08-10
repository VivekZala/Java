import java.util.*;

class treemap {

	public static void main(String ...args) {

		// Integer is key and string is value.
		// TreeMap<Integer, String> t = new TreeMap<>();
		// System.out.println(t);

		TreeMap<Integer, String> t = new TreeMap<>(Map.of(0, "A", 1, "B", 2, "C"));
		System.out.println(t);

		t.put(3, "D");
		t.put(4, "E");
		t.put(6, "G");
		System.out.println(t);
		System.out.println(t.ceilingEntry(5).getValue());
		System.out.println(t.get(3));
	

	}
}

/*
 * TreeSet will store elements in sorted order.
 */

import java.util.*;

class treeset {

	public static void main(String ...args) {

		// TreeSet<Integer> t = new TreeSet<>(List.of(90, 10, 50, 23, 10, 30));
		// System.out.println(t);
		// t.add(25);
		// System.out.println(t);
		// ceiling(Integer); This method will return grater nearest number.
		// System.out.println(t.ceiling(55));
		// floor(Integer); This method will return lower nearest number.
		// System.out.println(t.floor(55));
		
		TreeSet<Point> t = new TreeSet<>();

		t.add(new Point(1, 1));
		t.add(new Point(5, 5));
		t.add(new Point(5, 2));

		System.out.println(t);

	}
}

class Point implements Comparable {

	int x;
	int y;

	Point(int x, int y) {

		this.x = x;
		this.y = y;
	}

	public String toString() {
		
		return "(x, y): " + "(" + x + ", " + y + ")";
		
	}

	public int compareTo(Object o) {

		Point p = (Point) o;

		if(this.x < p.x)
			return -1;
		else if(this.x > p.x)
			return 1;
		else {
			if(this.y < p.y)
				return -1;
			else if(this.y > p.y)
				return 1;
			else 
				return 0;
		}
	}

}

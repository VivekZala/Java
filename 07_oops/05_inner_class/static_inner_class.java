/*
 * 	Static inner class object can be created outside outer class and accessed.
 * 	Static class can access only static members form outer class.
 */
import java.lang.*;

class static_inner_class {

	public static void main(String ...args) {
	
		outer.inner i = new outer.inner();
		i.display();

	}
}

class outer {

	static int x = 10;
	int y = 20;

	static class inner {

		void display() {
			System.out.println(x);
			// System.out.println(y); // This is not static member so cannot be accessed.
		}
	}
}


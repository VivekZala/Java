import java.lang.*;

class nested_class {

	public static void main(String ...args) {

		outer o = new outer();
		o.outerDisplay();

		/* Creating inner class object */
		outer.inner oi = new outer(). new inner();
		oi.innerDisplay();

	}
}

class outer {
	
	// static int x = 10; // This is allowed.
	int x = 10;

	/* This is allowed in java.
	 * Before inner class we can create object.
	 */
	// inner i = new inner();
	
	class inner {

		int y = 20;

		void innerDisplay() {
			System.out.println(x);
			System.out.println(y);
		}
	}

	public void outerDisplay() {

		inner i = new inner();
		i.innerDisplay();
		System.out.println(i.y); // Accessing the value of inner class variable.
	}
}

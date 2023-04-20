/*
 * 	Static block are executed first after the class load.
 * 	Static block execute in order in which they are defined.
 */

import java.lang.*;

class static_block {

	static {
		System.out.println("Static block before main method");
	}

	public static void main(String ...args) {

		
		System.out.println("Main");
		My m = new My();
		System.out.println("Main");
		
	}
	static {
		System.out.println("Static block after main method");
	}
}

class My {

	static int a = 44;

	static {
		System.out.println("Static block 1");
		System.out.println("a is " + a);
		a = 100;
		System.out.println("a is " + a);
	}

	static {
		System.out.println("Static block 2");
		System.out.println("a is " + a);
	}
}

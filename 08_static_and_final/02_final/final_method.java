/*
 *	Static methods cannot be overrided in sub class.
 */

import java.lang.*;

class final_method {

	public static void main(String ...args) {

		test t = new test();
		t.show();	

	}
}

class test {

	public final void show() {
		System.out.println("Hello");
	}
}

class over extends test {

	/*
	public void show() {
		System.out.println("Hi"); // We cannot override final method.
					  // By which we can restrict run time polymorphism.
	}
	*/ 
}


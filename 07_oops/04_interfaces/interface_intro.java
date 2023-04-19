/*
 * 	Interfaces are designed to achieve run time polymorphism.
 * 	Interfaces are collection of abstracts methods.
 */

import java.lang.*;

class interface_intro {

	public static void main(String ...args) {
		
		parent p = new child();
		p.meth1();
		p.meth2();
		// p.meth3(); // This is not possible because of dynamic method dispatch.
	}
}

// By default all methods in interface is abstract.
interface parent {
	void meth1();
	void meth2();
}

class child implements parent {

	public void meth1() {
		System.out.println("Inside method 1");
	}

	public void meth2() {
		System.out.println("Inside method 2");
	}
}

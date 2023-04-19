import java.lang.*;

class dynamic_method_dispatch {

	public static void main(String ...args) {

		System.out.println("Parent");
		parent p = new parent();
		p.meth1();
		p.meth2();
		System.out.println();

		System.out.println("Child");
		child c = new child();
		c.meth1();
		c.meth2();
		c.meth3();
		System.out.println();

		System.out.println("Dynamic method dispatch");
		// Using dynamic method dispatch we can achieve run time polymorphism.
		parent pc = new child();
		pc.meth1();
		pc.meth2();
		// pc.meth3(); // This is not possible because parent has no reference to meth3();


	}
}

class parent {

	public void meth1() {
		System.out.println("Parent meth1");
	}
	public void meth2() {
		System.out.println("Parent meth2");
	}
}

class child extends parent {

	@Override
	public void meth2() {
		System.out.println("Child meth2");
	}
	public void meth3() {
		System.out.println("Child meth3");
	}
}


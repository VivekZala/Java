import java.lang.*;

class abstract_class {

	public static void main(String ...args) {

		parent p = new child();
		// p.meth1(); // This method cannot be called by this object.
		p.meth2();

	}
}
abstract class parent {

	parent() {
		System.out.println("Parent constructor");
	}
	abstract public void meth2();
}

class child extends parent {

	child() {
		System.out.println("Child constructor");
	}
	public void meth2() {
		System.out.println("Child override method of parent");
	}
}


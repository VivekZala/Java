import java.lang.*;

class inheritance_constructor {

	public static void main(String ...args) {

		parent p = new parent();
		System.out.println();

		child c = new child();
		System.out.println();

		grandChild g = new grandChild();

	}
}

class parent {
	parent() {
		System.out.println("Parent constructor");
	}
}

class child extends parent {
	child() {
		System.out.println("Child constructor");
	}
}

class grandChild extends child {
	grandChild() {
		System.out.println("Grand child constructor");
	}
}


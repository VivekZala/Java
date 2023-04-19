import java.lang.*;

class inheritance_parameterized_constructor_super {

	public static void main(String ...args) {
		
		System.out.println("******** Parent ********");
		parent p = new parent();
		System.out.println();

		parent p1 = new parent(4);
		System.out.println();

		System.out.println("******** Child ********");
		child c = new child();
		System.out.println();

		child c1 = new child(4);
		System.out.println();

	}
}

class parent {

	parent() {
		System.out.println("Parent -> Non-parameterized constructor");
	}
	parent(int x) {
		System.out.println("Parent -> Parameterized constructor");
	}
}

class child extends parent {
	
	child() {
		System.out.println("Child -> Non-parameterized constructor");
	}
	child(int y) {
		super(y);
		System.out.println("Child -> Parameterized constructor");
	}
}


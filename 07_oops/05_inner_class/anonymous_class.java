import java.lang.*;

class anonymous_class {

	public static void main(String ...args) {
	
		outer o = new outer();
		o.meth();
	}
}

abstract class My {
	abstract void display();
}
/*
 * Anonymus class can also implement interface.
interface i {
	void display();
}
*/


class outer {

	public void meth() {
		
		My m = new My() {
			public void display() { // here abstract class method is overridden.
				System.out.println("Hello");
			}
		};
		m.display();
	}
}

import java.lang.*;

class method_overriding {

	public static void main(String ...args) {

		parent p = new parent();
		p.display();

		child c = new child();
		c.display();

		// This method will be called upon object not on reference.
		// This is called dynamic method dispatch. 
		// When the super class is holding reference of sub class and overrided method is called then the method of object will be caalled.
		// This can call methods in object class and not from super class.
		parent p1 = new child();
		p1.display();


	}
}

class parent {

	void display() {
		System.out.println("Hello from parent");
	}
}

class child extends parent {

	void display() {
		System.out.println("Hello from child");
	}
}

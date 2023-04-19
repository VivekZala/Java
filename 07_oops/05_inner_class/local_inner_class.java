/*
 * 	Class is local to method. 
 * 	It is created inside method and cannot be accessed outside.
 */

import java.lang.*;

class local_inner_class {

	public static void main(String ...args) {

		outer o = new outer();
		o.display();

	}
}

class outer {

	void display() {

		class inner {

			void innerDisplay() {

				System.out.println("Hello");
			}
		}
		inner i = new inner();
		// new inner().innerDisply(); // Alternative.
		i.innerDisplay();
	}
}


/*
 * 	final class cannot be inherited.
 */

import java.lang.*;

class final_class {

	public static void main(String ...args) {

		test t = new test();
		t.show();

	}
}

final class test {

	final void show() {
		System.out.println("Hello");
	}

}

/*
class child extends test { // We cannot extend final class.

}
*/

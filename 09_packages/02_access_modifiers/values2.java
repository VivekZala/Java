/*
 * 	this is non-subclass within same package.
 */

package mypack1;

import java.lang.*;

class values2 {

	values v = new values();

	// Here we cannot access the values of d as it is private.
	/*
	 * public void show() {
	 *	System.out.println(v.a + v.b + v.c + v.d);
	 * }
	*/

}

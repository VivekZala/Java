/*
 * 	final acts like constant.
 * 	Once the value is assigned, then the value cannot be changed.
 *	final variables are written in CAPITAL letters(recommended).
 *	final variables are initialized in 3 ways.
 *		1) direct -> while declareing initialize it.
 *		2) inside static block -> Initialize inside static block.
 *		3) inside constructor -> Initialize inside constructor, can be overloaded.
 *	Inside method we can declare final variable and initiaize it later,
 *	But in class it should be initialized by any of the above.
 */

import java.lang.*;

class final_variable {

	final int MIN = 1;
	final int NORMAL; // If it is static then only in static block we can initialize.
	static final int ANOTHER; // This can be initialized in static block.
	final int MAX;

	static {
		ANOTHER = 34;
	}

	// Instance block.
	{
		NORMAL = 10;
	}

	final_variable() {
		MAX = 99;
	}

	public static void main(String ...args) {

		// If not creatd this object then variables must be static. 
		final_variable fv = new final_variable();

		System.out.println("Min value is " + fv.MIN);
		System.out.println("Normal value is " + fv.NORMAL);
		System.out.println("Max value is " + fv.MAX);
		System.out.println("Another value is " + ANOTHER); // Here object is not required as it is static.

	}
}

/*
 * 	Static variable is shared data among all the object of the class.
 * 	It is created in method area.
 * 	Static variable can be accessed by object of directly by class name.
 */

import java.lang.*;

class static_variable {

	public static void main(String ...args) {

		Honda car1 = new Honda();
		Honda car2 = new Honda();
		System.out.println("Price of car 1: " + car1.price);
		System.out.println("Price of car 2: " + car2.price);

		System.out.println("Price is " + Honda.price);

	}
}

class Honda {

	static long price = 1000000;
	int a, b;

}

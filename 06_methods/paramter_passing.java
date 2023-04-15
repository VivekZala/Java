/*
 * 	Parameter passing in java is basically the actual parameters are copied to formal parameters.
 * 	if primitive data is passed it will be copied.
 * 	if objects are passed references will be copied.(Which can modify the content).
 */

import java.lang.*;

class parameter_passing {

	static int sum(int x, int y) {
		return (x + y);
	}

	static void welcome(String name) {
		System.out.println("Welcome " + name);
	}

	public static void main(String args[])  {

		int a = 5, b =15;
		System.out.println("sum is : " + sum(a, b));

		String name = "java";
		welcome(name);
	}
}

		

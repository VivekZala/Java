import java.lang.*;
import java.util.*;

class overloaded_method_to_calculate_areas {

	// Area of rectangel.
	static float area(float length, float breadth) {
		return length * breadth;
	}
	static double area(double radius) {
		return Math.PI * radius * radius;
	}

	public static void main(String args[]) {

		float length = 13.3f, breadth = 23.4f;
		double radius = 23.34d;

		System.out.println("Area of rectangel is " + area(length, breadth));
		System.out.println("Area of circle is " + area(radius));
	}
}


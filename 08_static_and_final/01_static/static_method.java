/*
 * 	Static method belong to a class.
 * 	They are common for all the objects.
 * 	They can be called by just class name, no need to create object.
 * 	Even using object we can call them.
 * 	Static methods can access only static members.
 *
 * 	NOTE: Inside statid method this and super are not allowed.
 */

import java.lang.*;

class static_method {

	public static void main(String ...args) {

		System.out.println("Price in Delhi is " + HondaCity.onRoadPrice("delhi"));
		System.out.println("Price in Mumbai is " + HondaCity.onRoadPrice("mumbai"));
		System.out.println("Price in Bangalore is " + HondaCity.onRoadPrice("bangalore"));
		System.out.println("Price in Ahmedaabad is " + HondaCity.onRoadPrice("ahmedabad"));

		System.out.println();
		HondaCity hc = new HondaCity();
		hc.show();
	}
}

class HondaCity {

	static long price = 1000000;
	int a = 50, b = 23;

	public void show() {
		System.out.println("a is " + a);
		System.out.println("b is " + b);
		System.out.println("Price is " + price);
	}
	static double onRoadPrice(String city) {

		// This is not allowed, static methods cannot access non-static variable.
		// System.out.println("a is " + a);
		// System.out.println("b is " + b);

		switch(city) {

			case "delhi":
				return price + price * 0.1;
			
			case "mumbai":
				return price + price * 0.09;

			case "bangalore":
				return price + price * 0.08;
		}
		return price;
	}
}

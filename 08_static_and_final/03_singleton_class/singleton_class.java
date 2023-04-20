/*
 * 	A class which can create just 1 object.
 * 	More thean 1 object are not allowd.
 */

import java.lang.*;

class singleton_class {

	public static void main(String ...args) {

		// Here in c reference of coffeeMachine will be returned.
		coffeeMachine c = coffeeMachine.getInstance();

		System.out.println("your " + c.getCoffee() + "ml of coffee is ready");

	}
}

class coffeeMachine {

	private float coffeeQuantity;
	private float waterQuantity;
	private float milkQuantity;
	private float sugarQuantity;

	// Only 1 reference.
	static private coffeeMachine our = null;

	// We cannot create the object of private constructor outside the class.
	// So static method will be implemented to create the object.
	private coffeeMachine() {
		coffeeQuantity = 1;
		waterQuantity = 1;
		milkQuantity = 1;
		sugarQuantity = 1;
	}

	// Parameterized constructor overriden of default constructor.
	private coffeeMachine(float coffeeQuantity, float waterQuantity, float milkQuantity, float sugarQuantity) {
		this.coffeeQuantity = coffeeQuantity;
		this.waterQuantity = waterQuantity;
		this.milkQuantity = milkQuantity;
		this.sugarQuantity = sugarQuantity;
	}

	// If instance is not created then only it will create. 
	static public coffeeMachine getInstance() {
		if(our == null)
			our = new coffeeMachine();
		return our;
	}

	public float getCoffee() {
		return 50f;
	}
}


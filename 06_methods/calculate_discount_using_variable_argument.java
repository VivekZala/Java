import java.lang.*;

class calculate_discount_using_variable_argument {

	static double discount(double ...price) {
		double sum = 0, discount = 0;
		for(double x : price)
			sum += x;
		if(sum > 5000)
			discount = sum * 0.10;
		else if(sum > 3500 && sum < 5000)
			discount = sum * 0.5;
		else if(sum > 2000 && sum < 3500)
			discount = sum * 0.2;
		else 
			discount = 0;
		return discount;
	}

	public static void main(String ...args) {

		System.out.println("Discount is " + discount(100, 345, 234, 343));
		System.out.println("Discount is " + discount(1000, 234, 2345, 2344));
	}
}


import java.lang.*;

class sum_of_all_elements_using_variable_argument {

	static int sum(int ...x) {
		int sum = 0;
		for(int i = 0; i < x.length; i++)
			sum += x[i];
		return sum;
	}

	public static void main(String ...args) {

		System.out.println("Sum is " + sum());
		System.out.println("Sum is " + sum(1, 23));
		System.out.println("Sum is " + sum(34, 54, 23));
		System.out.println("Sum is " + sum(1,24, 5, 34));
		System.out.println("Sum is " + sum(new int[]{23, 43, 23, 45, 32}));
	}
}


import java.lang.*;
import java.util.*;

class sum {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		int a, b, sum;
		System.out.print("Enter a: ");
		a = input.nextInt();
		System.out.print("Enter b: ");
		b = input.nextInt();
		sum = a + b;

		System.out.println("Sum is: " + sum);
	}
}

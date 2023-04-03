import java.lang.*;
import java.util.*;

class Quadratic_Equatin {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		int a, b, c;
		double r1, r2;

		System.out.print("Enter a: ");
		a = input.nextInt();
		System.out.print("Enter b: ");
		b = input.nextInt();
		System.out.print("Enter c: ");
		c = input.nextInt();

		r1 = (-b + Math.sqrt((b * b) - 4 * a * c)) / (2 * a);
		r2 = (-b - Math.sqrt((b * b) - 4 * a * c)) / (2 * a);

		System.out.println("Roots are " + r1 + "  " + r2);

		// Input
		// 1	1	1
		// 1	-4	4
		// 1	5	6
	}
}


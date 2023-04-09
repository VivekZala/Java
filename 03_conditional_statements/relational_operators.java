import java.lang.*;
import java.util.*;

class relational_operators {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		int a, b, c;
		System.out.print("Enter a: ");
		a = input.nextInt();
		System.out.print("Enter b: ");
		b = input.nextInt();
		System.out.print("Enter c: ");
		c = input.nextInt();

		System.out.println("(" + a + " > " + b + ") = " + (a > b));
		System.out.println("(" + a + " < " + b + ") = " + (a < b));
		System.out.println("(" + a + " > " + c + ") = " + (a > c));
		System.out.println("(" + b + " > " + c + ") = " + (b > c));
		System.out.println("(" + c + " > " + a + ") = " + (c > a));
		System.out.println("(" + c + " > " + b + ") = " + (c > b));
		System.out.println("(" + a + " > " + b + " && " + a + " > " + c + ") = " + ((a > b) && (a > c)));
		System.out.println("(" + a + " < " + b + " && " + a + " < " + c + ") = " + ((a < b) && (a < c)));
		
 
	}
}


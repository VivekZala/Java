import java.lang.*;
import java.util.*;

class maximum_of_3_numbers {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		int a, b, c;

		System.out.print("Enter a: ");
		a = input.nextInt();
		System.out.print("Enter b: ");
		b = input.nextInt();
		System.out.print("Enter c: ");
		c = input.nextInt();

		if(a > b && a > c)
			System.out.println(a + " is greater");
		else if(b > c)
			System.out.println(b + " is greater");
		else
			System.out.println(c + " is greater");
	}
}

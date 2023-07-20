import java.util.Scanner;

public class try_catch_block {

	public static void main(String ...args) {

		Scanner input = new Scanner(System.in);

		int a, b, c;
		System.out.print("Enter a and b: ");
		a = input.nextInt();
		b = input.nextInt();
		try {
			c = a / b;
			System.out.println(c);
		} catch(ArithmeticException e) {
			System.out.println("Denominator should not be 0, try again");
			System.out.println(e);
		}
		System.out.println("Bye");
	}
}

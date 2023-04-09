import java.lang.*;
import java.util.*;

class menu_driven_arithmetic_operations {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		int a, b, result;
		String option;

		System.out.println("ADD");
		System.out.println("SUB");
		System.out.println("MUL");
		System.out.println("DIV");
		System.out.print("Enter your choice: ");
		option = input.next();
		System.out.print("Enter a: ");
		a = input.nextInt();
		System.out.print("Enter b: ");
		b = input.nextInt();

		switch(option) {

			case "ADD": System.out.println(a + " + " + b + " = " + (a + b));
				    break;

			case "SUB": System.out.println(a + " - " + b + " = " + (a - b));
				    break;

			case "MUL": System.out.println(a + " * " + b + " = " + (a * b));
				    break;

			case "DIV": System.out.println(a + " / " + b + " = " + (a / b));
				    break;

			case "EXIT": System.exit(0);
				     break;

			default: System.out.println("Invalid choice");
				 break;
		}
	}
}


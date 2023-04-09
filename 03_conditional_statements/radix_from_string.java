import java.lang.*;
import java.util.*;

class radix_from_string {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		String number;
		
		System.out.print("Enter number: ");
		number = input.nextLine();

		if(number.matches("[01]+"))
			System.out.println(number + " is a binary number, Radix = 2");
		else if(number.matches("[0-7]+"))
			System.out.println(number + " is a octal number, Radix = 8"); // It may be decimal for some case.
		else if(number.matches("[0-9]+"))
			System.out.println(number + " is a decimal number, Radix = 10");
		else if(number.matches("[0-9A-F]+"))
			System.out.println(number + " is a hexa-decimal number, Radix = 16");
		else
			System.out.println("Invalid number");
	}
}


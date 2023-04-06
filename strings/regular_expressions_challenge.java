/*
 * 	Find if a number is binary or not.
 * 	Find if a number is hexa-decimal or not.
 * 	Find is the data in date format(dd/mm/yyyy).
 */

import java.lang.*;
import java.util.*;

class regular_expression_challenge {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		int binaryNumber;

		System.out.print("Enter binary number: ");
		binaryNumber = input.nextInt();
		String binary = String.valueOf(binaryNumber);

		System.out.println(binaryNumber);
		System.out.println(binary.matches("[01]+"));

		String hexaDecimal;
		System.out.print("Enter hexa-decimal number : ");
		hexaDecimal = input.next();
		System.out.println(hexaDecimal);
		System.out.println(hexaDecimal.matches("[0-9A-F]+"));

		String date;
		System.out.print("Enter date[DD/MM/YYYY]: ");
		date = input.next();
		System.out.println(date.matches("[0-3][0-9]{1,2}-[01][0-9]{1,2}-[0-9]{1,4}"));
		System.out.println(date);
	}
}


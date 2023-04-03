/*
 * Program to read binary number and display equivalent decimanl number.
*/

import java.lang.*;
import java.util.*;

class radix {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		input.useRadix(2); // Binary input.
		int Binary_Number;
		System.out.print("Enter binary numbers: ");
		Binary_Number = input.nextInt();
		System.out.println("Deciaml number: " + Binary_Number);
	}
}


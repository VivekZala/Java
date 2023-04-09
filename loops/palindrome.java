import java.lang.*;
import java.util.*;

class palindrome {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		int number, temp, digit, reversed = 0;

		System.out.print("Enter a number: ");
		number = input.nextInt();

		temp = number;
		while(temp > 0) {
			digit = temp % 10;
			reversed = (reversed * 10) + digit;
			temp /= 10;
		}
		if(reversed == number)
			System.out.println("Palindrome");
		else
			System.out.println("Not a palindrome");
	}
}



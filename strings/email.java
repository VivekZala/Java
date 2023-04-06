/*
 *	Program to find the whether the email is on gmail.
 *	Then find the username and domain name form email.
 */

import java.lang.*;
import java.util.*;

class email {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		String email;
		System.out.print("Enter your email id: ");
		email = input.nextLine();
		
		String gmail = email.substring(email.indexOf('@') + 1, email.indexOf('.', email.indexOf('@')));	
		// gmail.startWith("gmail"); // Another way to compare.
		if(gmail.equals("gmail"))
			System.out.println("It's a gmail account");
		else
			System.out.println("It's not a gmail account");

		System.out.println("Username: " + email.substring(0, email.indexOf('@')));
		System.out.println("Domain: " + email.substring(email.indexOf('@') + 1, email.length()));
	}
}

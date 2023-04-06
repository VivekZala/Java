/*
 * 	Remove special characters form the string.
 * 	Remove extra spaces from the string(between words).
 * 	Find number of words in a string.
 */

import java.lang.*;
import java.util.*;

class regular_expression_challenge_2 {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		String str;
		System.out.print("Enter String with special characters: ");
		str = input.nextLine();
		String removed_special = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("Original string: " + str);
		System.out.println("Filtered string: " + removed_special);

		String str1;
		System.out.print("Enter string with many spaces in between: ");
		str1 = input.nextLine();
		String removed_spaces = str1.replaceAll("\\s+", " ").trim();
		System.out.println("Original string: " + str1);
		System.out.println("Filtered string: " + removed_spaces);

		String str2;
		System.out.print("Enter string to count the words: ");
		str2 = input.nextLine();
		str2 = str2.replaceAll("\\s+", " ").trim();
		String words[] = str2.split("\\s");
		System.out.println("Number of words: " + words.length);
	}
}

import java.lang.*;

class regular_expressions {

	public static void main(String args[]) {

		String str = "a";
		System.out.println(str.matches(".")); // Any single character(alphabet, number or any special)
		
		System.out.println(str.matches("[abc]")); // Any single character among[](between given brackets). 
		
		String str1 = "p";
		System.out.println(str1.matches("[^abc]")); // Any single character other than provided.
							
		String str2 = "A";
		System.out.println(str2.matches("[a-zA-Z0-9]")); // Within range given single character. Casesensitive.
		
		String str3 = "A8";
		System.out.println(str3.matches("[a-zA-Z][0-9]")); // Multiple character.

		String str4 = "a";
		System.out.println(str4.matches("a|b")); // Either a or b is allowed.
						
		String str5 = "abc";
		System.out.println(str5.matches("abc")); // Exact abc must be there in string.
		
		// Meta characters.
		String str6 = "a";
		System.out.println(str6.matches("\\w")); // Any single character and digit.
		System.out.println(str6.matches("\\W")); // Any single non-character and non digit.

		String str7 = "8";
		System.out.println(str7.matches("\\d")); // Any single digit.
		System.out.println(str7.matches("\\D")); // Any single non-digit.

		String str8 = " ";
		System.out.println(str8.matches("\\s")); // Single space.
		System.out.println(str8.matches("\\S")); // Single non-space;
		
		// Quantifiers.
		// Multiple character.
		// * -> means 0 or any number of times.
		// + -> means 1 or any number of times.
		String str9 = "abcdef";
		System.out.println(str9.matches(".*")); // Anything any number of times.
		String str10 = "vivek";
		System.out.println(str10.matches("[a-z]*")); // Any number of character within a-z.

		String str11 = "aabbbbbbbcccaaacccaaabbb";
		System.out.println(str11.matches("[abc]*")); // any of [abc] any number of times.
		
		String str12 = "";
		System.out.println(str12.matches("[abc]*")); // true because(*) 0 or any number of times.
		System.out.println(str12.matches("[abc]+")); // false because(+) 1 or any number of times.

		String str13 = "acc";
		System.out.println(str13.matches("[abc]{3}")); // Ecactly any three character from [abc].
		System.out.println(str13.matches("[abc]{3,7}")); // Exactly minimum 3 and maximum.

		String str14 = "vivek@gmail.com";
		System.out.println(str14.matches(".*[@]*.*")); // Email expression.
		System.out.println(str14.matches("\\w*[@]*.*")); // Email.
	}
}

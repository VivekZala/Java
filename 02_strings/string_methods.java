import java.lang.*;

class string_method {

	public static void main(String args[]) {

		String str = new String("java");

		// length();
		System.out.println("Length is " + str.length());

		// toUpperCase();
		System.out.println("Upper case: " + str.toUpperCase());

		// toLowerCase();
		System.out.println("Lower case: " + str.toLowerCase());

		// trim();
		String str2 = new String("        trim      ");
		System.out.println("Before trim: " + str2);
		System.out.println("After trim: " + str2.trim());

		// substring(int begin), substring(int begin, int end);
		String str3 = new String("Java Programing");
		System.out.println("String is: " + str3);
		System.out.println("Substring is : " + str3.substring(5)); // Only with begin index.
		System.out.println("Substring is : " + str3.substring(5, 12)); // With begin and ending index.
									       
		// replace(char old, char new);
		String str4 = new String("Welcome");
		System.out.println(str4);
		System.out.println(str4.replace('e', 'K'));

		// startsWith(), and endsWith();
		String str5 = new String("Mr. Vivek Zala");
		System.out.println(str5.startsWith("Mr.")); // true.
		System.out.println(str5.startsWith("mr.")); // false. It is case sensitive.
		System.out.println(str5.startsWith("Vivek", 4)); // true (Overloaded method).
		System.out.println(str5.endsWith("Zala")); // true.
		System.out.println(str5.endsWith("zala")); // fase. It is case sensitive.
							   
		// charAt();
		System.out.println(str5.charAt(4));
		// Displaying all the character from the string.
		for(int i = 0; i < str5.length(); i++)
			System.out.print(str5.charAt(i));
		System.out.println();

		// indexOf() and lastIndexOf();
		String str6 = "www.google.co.in";
		System.out.println(str6.indexOf("."));
		System.out.println(str6.indexOf("google")); // Checks the starting index.
		System.out.println(str6.indexOf(".", 4)); // Check another (.) after form index 4.
		System.out.println(str6.lastIndexOf("."));

		// equals(), equalIngoreCase(), ==, compareTo();
		String str7 = "Pyramid";
		String str8 = "Pyramid";
		System.out.println(str7.equals(str8)); // It is case sensitive. It checks contents.
		System.out.println(str7.equalsIgnoreCase(str8)); // Here it ignores the case.
		System.out.println(str7 == str8); // Here references are compared.
		System.out.println(str7.compareTo(str8)); // Compare in dictionary order.(0 if strings are equal or difference if not equal(positive or negative);
		System.out.println(str7.compareToIgnoreCase(str8)); // It ignores the case.

		// contains();
		String str9 = "The great wall of China";
		System.out.println(str9.contains("china"));
		String str10 = "The great wall";
		String str11 = " of Chine";
		// System.out.println(str10.concat(str11));
		System.out.println(str10 + str11);
		String str12 = str10.concat(str11);
		System.out.println(str12);
		System.out.println(str9 == str12);

		// valueOf() --> It returns the string.
		// To convert any data type to string.
		int a = 1233;
		System.out.println(String.valueOf(a));

	}
}


import java.lang.*;
import java.util.*;

class string_Literal {

	public static void main(String args[]) {

		String str = "Java Program"; // This will be created in string pool.
		System.out.println(str);

		String str2 = new String("JAVA"); // This will be created in heap as well as string pool.
		System.out.println(str2);

		char c[] = {'H', 'e', 'l', 'l', 'o'};
		String str3 = new String(c);
		System.out.println(str3);

		byte b[] = {65, 66, 67, 68};
		String str4 = new String(b);
		System.out.println(str4);

		String str5 = new String(b, 2, 2); // 2 is starting index and another 2 is total character.
		System.out.println(str5);
	}
}


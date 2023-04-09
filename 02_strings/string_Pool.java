import java.lang.*;

class string_Pool {

	public static void main(String args[]) {

		// Both variable are referencing to object in string pool.
		String str1 = "Java";
		String str2 = "Java";

		System.out.println(str1 == str2);

		// Creating string in heap.
		String str3 = new String("Java");
		System.out.println(str1 == str3);
	}
}

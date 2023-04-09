import java.lang.*;
import java.util.*;

class literal {

	public static void main(String args[]) {
		
		// Different number system using byte.
		// It can be also represented with short, int and long.
		byte b1 = 10;     // Deciaml 10.
		byte b2 = 0b1010; // Binary 10.
		byte b3 = 012;    // Octal 10.
		byte b4 = 0XA;    // Hexadecimal 10.
	
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);

		// Literals.
		// long.
		long l = 9999999999L; // If we don't write L or l it will give error. Because it consider it as integer.
		System.out.println(l);

		// int
		int i = 134;
		System.out.println(i);

		//float and double.
		//By default decimal point numbers are double.
		float f = 12.56F; 	// If F or f is not mentioned it will consider as double and give error.
		double d = 213.34D; // Here D is optional because decimal point number by default is double.
		System.out.println(f);
		System.out.println(d);


		// Underscore between numbers.
		// It is used for the code readability of the program.
		// _(underscore) user for ,(comma).
		
		long ll = 999_999_999;
		float ff = 123_234.234F;
		System.out.println(ll);
		System.out.println(ff);
	}
}

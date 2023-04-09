/*
 * Program to find data type size and range.
*/

import java.lang.*;
import java.util.*;

class data_types_and_range {

	public static void main(String args[]) {
	
		// Bytes.
		System.out.println("Bytes");
		System.out.println("Minimum bytes value: " + Byte.MIN_VALUE);
		System.out.println("Maximum bytes value: " + Byte.MAX_VALUE);
		System.out.println("Number of bytes it takes: " + Byte.BYTES);

		// Integers.
		System.out.println("\nInteger");
		System.out.println("Minimum integer value: " + Integer.MIN_VALUE);
		System.out.println("Maximum integer value: " + Integer.MAX_VALUE);
		System.out.println("Number of bytes it takes: " + Integer.BYTES);

		// Short.
		System.out.println("\nShort");
		System.out.println("Minimum short value: " + Short.MIN_VALUE);
		System.out.println("Maximum short value: " + Short.MAX_VALUE);
		System.out.println("Number of bytes it takes: " + Short.BYTES);

		// Long.
		System.out.println("\nLong");
		System.out.println("Minimum long value: " + Long.MIN_VALUE);
		System.out.println("Maximum long value: " + Long.MAX_VALUE);
		System.out.println("Number of bytes it takes: " + Long.BYTES);

		// Float.
		System.out.println("\nfloat");
		System.out.println("Minimum float value: " + Float.MIN_VALUE);
		System.out.println("Maximum float value: " + Float.MAX_VALUE);
		System.out.println("Number of butes it takes: " + Float.BYTES);

		// Double.
		System.out.println("\nDouble");
		System.out.println("Mimumum double value: " + Double.MIN_VALUE);
		System.out.println("Maximum double value: " + Double.MAX_VALUE);
		System.out.println("Number of bytes it takes: " + Double.BYTES);

		// Chatacter.
		System.out.println("\nCharacter");
		System.out.println("Minimum character value: " + Character.MIN_VALUE);
		System.out.println("Maximum character value: " + Character.MAX_VALUE);
		System.out.println("Number of bytes it takes: " + Character.BYTES);
	}
}


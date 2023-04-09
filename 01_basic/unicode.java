import java.lang.*;

class unicode {

	public static void main(String args[]) {
		
		// Reference for unicode is unicode.org.
		char c = 0X0370;
		System.out.println(c);

		// Printing all characters of Greek language.
		System.out.println("Greek language all character");
		for(char x = 0X0370; x <= 0X03FF; x++)
			System.out.print(x + "  ");

		// Printing all characters of Devanagari language.
		System.out.println("\nDevanagari language all character");
		for(char d = 0X0900; d <= 0X097F; d++)
			System.out.print(d + "  ");
	}
}

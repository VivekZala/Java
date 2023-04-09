import java.lang.*;
import java.util.*;

class input_string {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		String name;
		System.out.print("Enter name: ");
		name = input.nextLine();
		System.out.println("Welcome " + name);
	}
}

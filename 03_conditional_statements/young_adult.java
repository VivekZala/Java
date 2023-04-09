import java.lang.*;
import java.util.*;

class young_adult {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		int age;
		System.out.print("Enter age: ");
		age = input.nextInt();
		
		if(age >= 18)
			System.out.println("Adult");
		else
			System.out.println("Young");
	}
}


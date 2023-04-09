import java.lang.*;
import java.util.*;

class grades {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		int a, b, c;
		float average;

		System.out.print("Enter marks for subject 1: ");
		a = input.nextInt();
		System.out.print("Enter marks for subject 2: ");
		b = input.nextInt();
		System.out.print("Enter marks for subject 3: ");
		c = input.nextInt();

		average = (a + b + c) / 3f;
		
		if(average >= 80)
			System.out.println("Grade = A+");
		else if(average >= 70 && average < 80)
			System.out.println("Grade - A");
		else if(average >= 60 && average < 70)
			System.out.println("Grade -  B");
		else if(average >= 50 && average < 60)
			System.out.println("Grade - C");
		else if(average >= 40 && average < 50)
			System.out.println("Grade - E");
		else
			System.out.println("Grade - F");
	}
}


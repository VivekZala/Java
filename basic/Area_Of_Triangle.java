import java.lang.*;
import java.util.*;

class Area_Of_Triangle {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		float height, base, area;

		System.out.print("Enter height of triangle: ");
		height = input.nextFloat();
		System.out.print("Enter base of triangle: ");
		base = input.nextFloat();

		area = base * height / 2;
		//area = 1f / 2f * (base * height); // This will also work.
		System.out.println("Area of triangle is " + area);
	}
}

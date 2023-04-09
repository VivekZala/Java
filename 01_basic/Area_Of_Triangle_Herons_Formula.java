import java.lang.*;
import java.util.*;

class Area_Of_Triangle_Herons_Formula {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		float a, b, c;
		double s, area;

		System.out.print("Enter a: ");
		a = input.nextFloat();
		System.out.print("Enter b: ");
		b = input.nextFloat();
		System.out.print("Enter c: ");
		c = input.nextFloat();

		s = (a + b + c) / 2D;
		area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		System.out.println("Area is " + area);
	}
}

import java.lang.*;
import java.util.*;

class Cuboid {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		float length, breadth, height, area, volume, front_back, top_bottom, left_right;

		System.out.print("Enter length: ");
		length = input.nextFloat();
		System.out.print("Enter breadth: ");
		breadth = input.nextFloat();
		System.out.print("Enter height: ");
		height = input.nextFloat();

		front_back = length * height;
		top_bottom = length * breadth;
		left_right = breadth * height;

		area = 2 * (front_back + top_bottom + left_right);
		volume = length * breadth * height;

		System.out.println("Area is " + area);
		System.out.println("Volume is " + volume);
	}
}


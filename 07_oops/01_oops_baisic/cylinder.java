import java.lang.*;

public class cylinder {

	public double radius;
	public double height;

	public double lidArea() {
		return Math.PI * radius * radius;
	}
	public double totalSurfaceArea() {
		return 2 * lidArea() + circumference() * height;
	}
	public double volume() {
		return lidArea() * height;
	}
	public double circumference() {
		return 2 * Math.PI * radius;
	}


	public static void main(String ...args) {

		cylinder c1 = new cylinder();

		c1.radius = 7;
		c1.height = 10;

		System.out.println("Lid area is: " + c1.lidArea());
		System.out.println("Total surface area is: " + c1.totalSurfaceArea());
		System.out.println("Volume is: " + c1.volume());
		System.out.println("Circumference is: " + c1.circumference());

	}
}

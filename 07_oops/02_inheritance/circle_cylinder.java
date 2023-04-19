import java.lang.*;

class circle_cylinder {

	public static void main(String ...args) {

		cylinder c = new cylinder();

		c.radius = 7;
		c.height = 10;

		System.out.println("Volumne is : " + c.volume());
		System.out.println("Area is: " + c.area());
	}
}
class circle {

	public double radius;

	public double area() {
		return Math.PI * radius * radius;
	}

	public double perimeter() {
		return 2 * Math.PI * radius;
	}
}

class cylinder extends circle{

	public double height;

	public double volume() {
		return area() * height;
	}
}

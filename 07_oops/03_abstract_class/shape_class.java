import java.lang.*;

class shape_class {

	public static void main(String ...args) {

		circle c = new circle();
		rectangle r = new rectangle();

		c.radius = 10;
		r.length = 34;
		r.breadth = 22;

		System.out.println("Circle");
		System.out.println("Area of circle: " + c.area());
		System.out.println("Perimeter of circle: " + c.perimeter());
		System.out.println();

		System.out.println("Rectangle");
		System.out.println("Area of rectangle: " + r.area());
		System.out.println("Perimeter of rectangle: " + r.perimeter());
	}
}

abstract class shape {

	abstract public double perimeter();
	abstract public double area();
}

class circle extends shape {

	public double radius;

	public double perimeter() {
		return 2 * Math.PI * radius;
	}

	public double area() {
		return Math.PI * radius * radius;

	}
}

class rectangle extends shape {

	public double length, breadth;

	public double perimeter() {
		return 2 * (length + breadth);
	}

	public double area() {
		return length * breadth;
	}
}


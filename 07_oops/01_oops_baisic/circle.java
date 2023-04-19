import java.lang.*;

class circle_class {

	public double radius;

	public double area() {
		return Math.PI * radius * radius;
	}

	public double perimeter() {
		return 2 * Math.PI * radius;
	}

	public double circumference() {
		return perimeter();
	}

	public static void main(String ...args) {

		circle_class c1 = new circle_class();

		c1.radius = 7;

		System.out.println("Arear is : " + c1.area());
		System.out.println("Perimeter is : " + c1.perimeter());
		System.out.println("Circumference is : " + c1.circumference());
	}
}

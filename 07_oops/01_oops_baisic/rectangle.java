import java.lang.*;

class rectangle {

	public double length, breadth;
	public double area() {
		return length * breadth;
	}
	public double perimeter() {
		return 2 * (length + breadth);
	}
	public boolean isSquare() {
		return length == breadth;
	}

	public static void main(String ...args) {
	
		rectangle r1 = new rectangle();

		r1.length = 10.5d;
		r1.breadth = 5.5d;

		System.out.println("Area is: " + r1.area());
		System.out.println("Perimeter is: " + r1.perimeter());
		System.out.println("Is square : " + r1.isSquare());
	}
}

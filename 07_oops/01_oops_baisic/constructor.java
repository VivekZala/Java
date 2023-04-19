import java.lang.*;

class constructor {

	public static void main(String ...args) {
		
		// rectangle r = new rectangle();
		// r.setLength(10.5);
		// r.setBreadth(5.5);
		// System.out.println("Length is: " + r.getLength());
		// System.out.println("Breadth is: " + r.getBreadth());
		// System.out.println("Area is: " + r.area());

		rectangle r2 = new rectangle(10.5, 5.5);
		System.out.println("Length is: " + r2.getLength());
		System.out.println("Breadth is: " + r2.getBreadth());

		System.out.println("Area is: " + r2.area());



	



	}
}

class rectangle {

	private double length, breadth;

	public rectangle() {
		length = 1;
		breadth = 1;
	}

	public rectangle(double l, double b) {
		setLength(l);
		setBreadth(b);
	}

	public rectangle(double s) {
		setLength(s);
		setBreadth(s);
	}

	public void setLength(double l) {
		length = l;
	}

	public void setBreadth(double b) {
		breadth = b;
	}

	public double getLength() {
		return length;
	}
	
	public double getBreadth() {
		return breadth;
	}

	public double area() {
		return getLength() * getBreadth();
	}
}

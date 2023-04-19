import java.lang.*;


class data_hiding {

	public static void main(String ...args) {

		dataHiding d = new dataHiding();

		d.setLength(10.5);
		d.setBreadth(5.5);

		System.out.println("Area is: " + d.area());
		System.out.println("Perimeter is: " + d.perimeter());
		System.out.println("Is square: " + d.isSquare());
		System.out.println("Length is: " + d.getLength());
		System.out.println("Breadth is: " + d.getBreadth());

	}
}
class dataHiding {

	private double length, breadth;

	public double getLength() {
		return length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setLength(double l) {
		if(l >= 0)
			length = l;
		else
			length = 0;
	}

	public void setBreadth(double b) {
		if(breadth >= 0)
			breadth = b;
		else
			breadth = 0;
	}

	public double area() {
		return length * breadth;
	}

	public double perimeter() {
		return  2 * (length + breadth);
	}

	public boolean isSquare() {
		return length == breadth;
	}
}


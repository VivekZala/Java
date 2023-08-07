// Serialization - 3
import java.io.*;

class object_stream {

	public static void main(String ...args) throws Exception {
		
		// OuputStream (Serialization).
		FileOutputStream fos = new FileOutputStream("files/student3.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		Student s = new Student(10, "John", 89.5f, "CSE");

		oos.writeObject(s); // This will achieve serialization.
				    
		// InputStream (Decrialization).
		FileInputStream fis = new FileInputStream("files/student3.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);

		Student s1 = (Student)ois.readObject();

		System.out.println(s1);

		fis.close();
		ois.close();

	}
}

class Student implements Serializable {

	private int roll_no;
	private String name;
	private float avg;
	private String dept;
	public static int data = 10;
	public transient int t;

	// Default constructor.
	public Student() {

	}

	public Student(int r, String n, float a, String d) {

		roll_no = r;
		name = n;
		dept = d;
		data = 500;
		t = 500;
	}

	public String toString() {
		return "\nStudent Details\n" +
			"\nRoll no: " + roll_no +
			"\nName: " + name + 
			"\nAverage: " + avg + 
			"\nDept: " + dept + 
			"\nData: " + data + 
			"\nTransient: " + t + "\n";
	}
}
